package nweaportal.api

import com.nwea.portal.domain.RelatedProductsViewModelBuilder
import grails.converters.JSON
import nweaportal.portal.User

class RelatedProductsController {

    def grailsCacheManager

    def authenticationService

    def index() {
        def cache = grailsCacheManager.getCache('zuora')
        def email = authenticationService.sessionUser.login

        def user = new User()
        user.email = params.email
        def users = user.findAll(user)
        user = users.first()

        def relatedBuilder = new RelatedProductsViewModelBuilder(cache, user.zuoraAccountId);

        def model = relatedBuilder.Build()

        render model as JSON
    }
}
