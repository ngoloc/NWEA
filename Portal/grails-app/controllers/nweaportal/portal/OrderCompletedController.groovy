package nweaportal.portal

class OrderCompletedController {

    def index() {

        def os = session["lastorder"]
        def oi = os.getOrderItems()

        render(view: 'index', model: [orders: oi])
    }
}