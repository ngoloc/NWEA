package nweaportal.portal


class User {

    String email

    String agencyCode

    String name

    String role

    String zuoraAccountId

    static constraints = {
        email blank: false, unique: true
        name blank: false
        role blank: false
        agencyCode nullable: false
        zuoraAccountId blank: false
    }
}
