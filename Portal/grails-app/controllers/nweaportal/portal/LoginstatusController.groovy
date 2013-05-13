package nweaportal.portal

class LoginstatusController {

    def authenticationService

    def status() {

        def authUser = authenticationService.sessionUser
        def model = [:]
        if (authUser != null && authUser.isLoggedIn()) {
            def user = new User()
            user.email = authUser.login
            def users = user.findAll(user);
            if (users.size() == 1) {
                user = users[0]
                model.name = user.name
                model.email = user.email
                if (user.agency != null) {
                    model.agency = user.agency.name
                }
            }
        }
        render(view: "/loginstatus/_status", model: model)
    }
}
