import nweaportal.admin.Agency
import nweaportal.portal.User

class BootStrap {

    def authenticationService

    def init = { servletContext ->

        def findResult = User.findAll("FROM User AS u WHERE u.email='admin@nwea.org'")
        if (findResult.size() == 0) {
            def admin = new User()
            admin.role = 'Admin'
            admin.name = 'Administrator'
            admin.email = 'admin@nwea.org'
            admin.agency = null
            admin.zuoraAccountId = 'notused'
            admin.zuoraAccountName = 'notused'
            admin.save(flush: true, failOnError: true)
            authenticationService.signup([login: admin.email, password: 'password'])
        }

        def agencies = Agency.findAll("FROM Agency AS a")
        if (agencies.size() == 0) {
            def agency = new Agency()
            agency.code = 1234
            agency.name = 'Test Agency'
            agency.save(flush: true, failOnError: true)
        }

    }
    def destroy = {
    }
}
