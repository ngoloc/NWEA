package nweaportal.admin

import nweaportal.portal.User

class AdminLoginController {

    static allowedMethods = [login: 'POST', index: 'GET']

    def authenticationService

    def index() {

    }

    def login() {

        def a = new User();
        a.email = params.email
        def admins = a.findAll(a)

        if (admins.size() == 0) {
            flash.loginmessage = 'Invalid username or password'
            redirect(action: 'index', controller: 'adminlogin', params: params)
            return
        }

        a = admins.get(0)

        if (a.role != 'Admin') {
            flash.loginmessage = 'Invalid username or password'
            redirect(action: 'index', controller: 'adminlogin', params: params)
            return
        }

        def authUser = authenticationService.login(params.email, params.password)

        if (authUser.loggedIn) {
            redirect(action: 'index', controller: 'adminHome')
            return
        } else {
            flash.loginmessage = 'Invalid username or password'
            redirect(action: 'index', controller: 'adminlogin', params: params)
        }
    }
}
