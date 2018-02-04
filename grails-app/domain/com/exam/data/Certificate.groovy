package com.exam.data

class Certificate {

    String nama
    String informasi
    byte[] fileSertificate

    static constraints = {
        nama nullable: false
        informasi nullable: true, size: 1..10000
        fileSertificate(blank: true, nullable:true, maxSize:1073741824)
    }
}
