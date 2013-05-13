package nweaportal.portal

import com.zuora.zilla.controller.AccountManager

class ZtestController {

    static allowedMethods = [index: 'GET']

    def index() {
        def accountManager = new AccountManager();
        def summary = accountManager.getCompleteDetail('DanaBenson');
        flash.info = summary.getBalance();
    }
}
