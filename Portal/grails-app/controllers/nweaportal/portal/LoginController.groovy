package nweaportal.portal

import com.nwea.portal.domain.AccountDisabler
import com.nwea.portal.repository.ZuoraRepository

class LoginController {

    def authenticationService

    def user

    static allowedMethods = [login: 'POST', index: 'GET']

    def grailsCacheManager

    def index() {
        def showForgot = false
        if (authenticationService.sessionUser != null && authenticationService.isLoggedIn(request)) {
            redirect(action: 'index', controller: 'MyAccount')
            return
        }
        render(view: 'index', model: [showForgot: false, hidenav: true])
    }

    def login() {
        if (checklogin()) {
            if (isManagementDisabled()) {
                authenticationService.logout(authenticationService.sessionUser)
                redirect(action: 'index', controller: 'manageDisabled')
            } else {

                redirect(action: 'index', controller: 'MyAccount')
            }
        }
    }

    def isManagementDisabled() {
        def cache = grailsCacheManager.getCache('zuora')
        def disabler = new AccountDisabler(cache)
        return disabler.IsDisabled(user.agency.code)
    }

    def checklogin() {

        def cache = grailsCacheManager.getCache('zuora')
        def repo = new ZuoraRepository(cache)
        def agencyAccount = repo.AccountR.GetByNumber(params.code)

        if (agencyAccount == null) {
            flash.loginmessage = 'Invalid agency code.'
            redirect(action: 'index', controller: 'login', params: params)
            return false
        }

        def findUser = new User();
        findUser.email = params.email
        def users = findUser.findAll(findUser);
        if (users.size() == 0) {
            flash.loginmessage = 'Username not found.'
            redirect(action: 'index', controller: 'login', params: params)
            return false
        }

        user = users.first()

        def authUser = authenticationService.login(params.email, params.password)

        if (!authUser.loggedIn) {
            flash.loginmessage = 'Invalid password'
            redirect(action: 'index', controller: 'login', params: params)
            return false
        }

        session["username"] = params.email
        session["accountid"] = user.zuoraAccountId
        session["accountname"] = agencyAccount.name

        return true
    }
}