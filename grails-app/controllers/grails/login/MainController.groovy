package grails.login

import grails.plugin.springsecurity.annotation.Secured

@Secured(['ROLE_USER','ROLE_ADMIN'])
class MainController {

    def index() {
        def userName = "BBartes"
        [user: userName]
    }
}
