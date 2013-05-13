package nweaportal.api

import com.nwea.portal.domain.RelatedProductsViewModelBuilder
import grails.converters.JSON

class RelatedProductsController {

    def grailsCacheManager

    def authenticationService

    def index() {
        def cache = grailsCacheManager.getCache('zuora')
        def email = authenticationService.sessionUser.login

        def relatedBuilder = new RelatedProductsViewModelBuilder(cache, email);

        def model = relatedBuilder.Build()

        render model as JSON
    }
}
