package nweaportal.portal

import com.nwea.portal.repository.ZuoraRepository

class SignupController {

    def authenticationService

    static allowedMethods = [signup: 'POST']

    def grailsCacheManager

    def signup() {
        def cache = grailsCacheManager.getCache('zuora')
        def repo = new ZuoraRepository(cache)

        def agency = repo.AccountR.GetByNumber(params.code)
        if (agency == null) {
            flash.signupmessage = 'Agency ' + params.code + ' not found'
            redirect(action: 'index', controller: 'login', model: params)
            return
        }

        def user = new User()
        user.email = params.email
        def users = user.findAll(user)

        if (users.size() > 0) {
            flash.signupmessage = 'User with email ' + params.email + ' already exists.'
            redirect(action: 'index', controller: 'login');
            return;
        }

        def accountid = repo.AccountR.GetIdByNumber(params.code)

        def newuser = new User()
        newuser.email = params.email
        newuser.name = params.name
        newuser.agencyCode = params.code
        newuser.role = 'User'
        newuser.zuoraAccountId = accountid
        newuser.save(flush: true, failOnError: true);
        authenticationService.signup([login: params.email, password: params.password, suppressConfirmation: true, immediate: true])

        session["username"] = params.email
        session["accountid"] = accountid
        session["accountname"] = agency.name

        redirect(action: 'index', controller: 'MyAccount');
    }
}