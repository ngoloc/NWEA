package nweaportal.portal

import com.nwea.portal.domain.RegisterUser
import nweaportal.admin.Agency

class SignupController {

    def authenticationService

    static allowedMethods = [signup: 'POST']

    def grailsCacheManager

    def signup() {
        def cache = grailsCacheManager.getCache('zuora')
        def agency = new Agency();
        agency.code = params.code;
        def agencies = agency.findAll(agency);
        if (agencies.size() == 0) {
            agency.name = params.code
            agency.save()
        }
        else{
            agency = agencies.first()
        }

        def user = new User()
        user.email = params.email
        def users = user.findAll(user)

        if (users.size() > 0) {
            flash.signupmessage = 'User with email ' + params.email + ' already exists.'
            redirect(action: 'index', controller: 'login');
            return;
        }

        RegisterUser reg = new RegisterUser(cache);
        def zaccountid = reg.Register(params.email, params.code, params.name);

        def newuser = new User()
        newuser.email = params.email
        newuser.name = params.name
        newuser.agency = agency
        newuser.role = 'User'
        newuser.zuoraAccountName = params.email
        newuser.zuoraAccountId = zaccountid.toString()
        newuser.save(flush: true, failOnError: true);
        authenticationService.signup([login: params.email, password: params.password, suppressConfirmation: true, immediate: true])

        session["username"] = params.email

        redirect(action: 'index', controller: 'MyAccount');
    }
}