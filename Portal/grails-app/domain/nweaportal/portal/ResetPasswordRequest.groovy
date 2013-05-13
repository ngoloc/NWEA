package nweaportal.portal

class ResetPasswordRequest {

    boolean isValid

    Date dateCreated

    User user

    static constraints = {
        user blank: false
    }

    static mapping = {
    }
}
