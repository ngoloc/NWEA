package nweaportal.portal

class LogoutController {

    def authenticationService

    static allowedMethods = [index: 'GET']

    def index() {

        authenticationService.logout(authenticationService.getSessionUser())

        redirect(action: 'index', controller: 'login')
    }
}
