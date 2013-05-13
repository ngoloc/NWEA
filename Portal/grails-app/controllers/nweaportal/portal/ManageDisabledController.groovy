package nweaportal.portal

class ManageDisabledController {

    def index() {
        render(view: 'index', model: [hideaccountinfo: true])
    }
}
