package nweaportal.portal

import com.zuora.zilla.controller.AccountManager
import com.zuora.zilla.controller.SubscriptionManager
import com.zuora.zilla.dispatcher.Backend
import grails.converters.JSON

class MyAccountController {

    def authenticationService

    def grailsCacheManager

    def index() {}

    def GetCompleteSummary() {
        def cache = grailsCacheManager.getCache('zuora')
        def email = authenticationService.sessionUser.login

        def user = new User()
        user.email = email
        user = user.findAll(user)[0]

        def accountManager = new AccountManager(cache)
        def summary = accountManager.getCompleteDetail(user.zuoraAccountName);

        render summary as JSON
    }

    def GetLatestSubscription() {
        def cache = grailsCacheManager.getCache('zuora')
        def email = authenticationService.sessionUser.login
        def subs = new SubscriptionManager(cache).getAllSubscription(email);

        render subs as JSON
    }

    def backend() {
        def cache = grailsCacheManager.getCache('zuora')
        def backend = new Backend(cache);
        def result = backend.HandleRequest(params.type, request, response)
        if (result != null) {
            render result as JSON
        }
        return null;

    }
}