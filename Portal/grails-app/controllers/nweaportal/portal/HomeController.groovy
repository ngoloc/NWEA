package nweaportal.portal

import com.nwea.portal.domain.*
import com.nwea.portal.repository.ZuoraRepository
import com.zuora.zilla.controller.PaymentManager
import grails.converters.JSON

class HomeController {

    def authenticationService

    def grailsCacheManager

    def index() {
        def email = authenticationService.sessionUser.login
        def user = new User()
        user.email = email
        user = User.findAll("FROM User as u WHERE u.email = '" + email + "'").first()

        return [agency: user.agency.name]
    }

    def summary() {

        def email = authenticationService.sessionUser.login

        def user = new User()
        user.email = email
        user = User.findAll("FROM User as u WHERE u.email = '" + email + "'").first()
        def cache = grailsCacheManager.getCache('zuora')

        def mng = new SummaryViewModelBuilder(cache)
        def subs = mng.GetModel(user.zuoraAccountName)


        def paymngr = new PaymentManager(cache)
        def r = paymngr.getExistingIframeSrc(user.zuoraAccountName)
        subs.setPmurl(r.getData())

        render subs as JSON
    }

    def purchase() {
        def cache = grailsCacheManager.getCache('zuora')
        def email = authenticationService.sessionUser.login
        def user = new User()
        user.email = email
        user = user.findAll(user)[0]

        ZuoraRepository zr = new ZuoraRepository(cache);
        AccountActivator active = new AccountActivator(zr);
        String acterror = active.Activate(user.zuoraAccountId);

        if (acterror) {
            render([error: acterror] as JSON);
            return
        }

        def m = params.method
        def ponum = params.ponumber
        def productidsstr = params.productids
        def quantitiesstr = params.quantities
        def pricestr = params.prices
        def typesstr = params.types
        def subidsstr = params.subids

        def productids = productidsstr.split(",")
        def quantities = quantitiesstr.split(",")
        def prices = pricestr.split(",");
        def types = typestr.split(",")
        def subids = typestr.split(",")

        session["lastorder"] = null

        if (productids.length > 0) {
            for (int i = 0; i < productids.length; i++) {
                def pid = productids[i];
                def q = quantities[i];
                def ss = new SubscribeSingle(zr)
                String zname = user.zuoraAccountName;

                String error = ss.Subscribe(zname, pid, q, m, ponum)
                if (error != null && error.length() > 0) {
                    render([error: error] as JSON);
                    return
                }

            }
        }

        def order = new OrderSummary(zr);
        order.Build(productids, quantities, prices)
        session["lastorder"] = order;

        render([error: ''] as JSON);
    }

    def isactive() {
        def email = authenticationService.sessionUser.login
        def isactive = new IsAccountActive();
        if (isactive.Execute(email)) {
            render true
        } else {
            render ''
        }
    }

    def addcontact() {
        def email = authenticationService.sessionUser.login

        def findResult = User.findAll("FROM User AS u WHERE u.zuoraAccountName = '" + email + "'")
        def user = findResult.first()

        def adder = new AddContactAndActivate()
        def result = adder.Execute(request, user.zuoraAccountId)
        render result
    }

}
