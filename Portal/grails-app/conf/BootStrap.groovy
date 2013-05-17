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
            admin.agencyCode = 'ADMIN'
            admin.zuoraAccountId = 'notused'
            admin.save(flush: true, failOnError: true)
            authenticationService.signup([login: admin.email, password: 'password'])
        }

    }
    def destroy = {
    }
}
