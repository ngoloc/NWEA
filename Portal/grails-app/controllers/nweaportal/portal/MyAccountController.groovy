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
        def accountid = (String)session.getAttribute("accountid")
        def summary = accountManager.getCompleteDetail(accountid)

        render summary as JSON
    }

    def GetLatestSubscription() {
        def cache = grailsCacheManager.getCache('zuora')
        def email = authenticationService.sessionUser.login
        def accountId = (String)session.getAttribute("accountid")
        def subs = new SubscriptionManager(cache).getAllSubscription(accountId)

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