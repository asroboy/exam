package com.exam.banksoal

class Jawaban {

    String huruf
    boolean jawabanBenar
    String jawaban
    Soal soal


    static constraints = {
        huruf nullable: false
        jawabanBenar default: false
        jawaban nullable: false, size: 1..1000
        soal nullable: true
    }
}
