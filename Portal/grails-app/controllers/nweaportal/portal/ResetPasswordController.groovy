package nweaportal.portal

class ResetPasswordController {

    def authenticationService

    def index() {

        if (!params.id) {
            flash.error = 'Invalid reset request'
            redirect(action: 'index', controller: 'login')
            return
        }

        def reset = ResetPasswordRequest.get(params.id)

        if (reset == null) {
            flash.error = 'Invalid reset request'
            redirect(action: 'index', controller: 'login')
            return
        }

        if (!reset.isValid) {
            flash.error = 'Reset request is no longer valid'
            redirect(action: 'index', controller: 'login')
            return
        }

        render(view: "index", model: [id: params.id])
    }

    def reset() {
        if (!params.id) {
            flash.error = 'Invalid reset request'
            redirect(action: 'index', controller: 'login')
            return
        }
        def reset = ResetPasswordRequest.get(params.id)
        reset.isValid = false
        reset.save()

        def authUser = authenticationService.fireEvent("FindByLogin", reset.user.email)
        authUser.password = authenticationService.encodePassword(params.password)
        authUser.save()

        authenticationService.login(reset.user.email, params.password)

        redirect(action: 'index', controller: 'home')

    }
}
