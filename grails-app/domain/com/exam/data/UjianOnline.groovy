package com.exam.data

class UjianOnline {

    String nama
    Date startUjian
    Date endUjian
    String information

    static constraints = {
        nama nullable: false, blank: false
        information nullable: true, blank: true
    }
}
