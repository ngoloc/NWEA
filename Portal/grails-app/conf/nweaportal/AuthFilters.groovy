package nweaportal

class AuthFilters {

    def filters = {
        all(controller: '*', action: '*') {
            before = {

            }
            after = { Map model ->

            }
            afterView = { Exception e ->

            }
        }

        adminFilter(uri: "/**") {
            // Redirect to login if not logged in
            before = {
                if (controllerName != "login" &&
                        controllerName != "adminLogin" &&
                        controllerName != 'signup' &&
                        controllerName != "forgot" &&
                        controllerName != "manageDisabled" &&
                        controllerName != 'resetPassword') {
                    return applicationContext.authenticationService.filterRequest(request,
                            response, "${request.contextPath}/login/index")
                } else return true
            }
        }

    }
}

