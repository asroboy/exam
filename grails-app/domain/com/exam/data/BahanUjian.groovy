package com.exam.data

class BahanUjian {

    String nama
    String type
    String level
    Certificate certificate
    String informasi

    static constraints = {
        nama nullable: false
        type inList: ["Pilihan Ganda", "Essay"]
        level inList: ["Semua level", "Level 1", "Level 2", "Level 3", "Level 4", "Level 5", "Level 6", "Level 7", "Level 8", "Level 9", "Level 10"]
        certificate nullable: true
        informasi nullable: false, size: 1..10000

    }
}
