package com.exam.security

import grails.plugin.springsecurity.SpringSecurityUtils

class LogoutController {

    def index() {
//        redirect(uri: '/')
        redirect uri: SpringSecurityUtils.securityConfig.logout.filterProcessesUrl
    }
}
