package nweaportal.portal

class ForgotController {

    def authenticationService

    def reset() {

        if (request.method == 'GET') {
            redirect(action: 'index', controller: 'login')
            return
        }

        def user = authenticationService.fireEvent("FindByLogin", params.email)
        if (user == null) {
            flash.forgotmessage = "User " + params.email + " not found."
            render(view: '/login/index', model: [showForgot: true])
            return
        }
        sendemail(params.email)
        flash.info = "An email has been sent to " + params.email
        redirect(action: 'index', controller: 'login')
    }

    def test() {
        sendemail("danabenson@gmail.com")
        redirect(action: 'index', controller: 'login')
    }

    private sendemail(email) {

        def user = new User()
        user.email = email
        user = user.find(user).first()

        def r = new ResetPasswordRequest();
        r.isValid = true
        r.user = user
        r.save()

        sendMail {
            to email
            subject "Resest Password"
            html g.render(template: 'resetpassword', model: [token: r.id, serverurl: grailsApplication.config.grails.serverurl])
        }
    }
}
