package nweaportal.portal

import nweaportal.admin.Agency

class User {

    String email

    Agency agency

    String name

    String role

    String zuoraAccountId

    String zuoraAccountName

    static constraints = {
        email blank: false, unique: true
        name blank: false
        role blank: false
        agency nullable: true
        zuoraAccountId blank: false
        zuoraAccountName blank: false
    }
}
