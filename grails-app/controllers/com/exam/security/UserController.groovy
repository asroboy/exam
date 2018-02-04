package com.exam.security

class UserController extends grails.plugin.springsecurity.ui.UserController {

    def index(){
        [title: "Pengguna"]
    }
}
