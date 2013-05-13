package nweaportal.admin

import nweaportal.portal.User

class Agency {

    String name

    String code

    Date dateCreated

    static hasMany = [users: User]

    static constraints = {
        code blank: false
        name blank: false
    }
}
