package com.exam.banksoal

class PenjelasanSoal {

    String penjelasanSoal
    boolean tampilkanPenjelasanSaatUjian
    Soal soal

    static constraints = {
        penjelasanSoal nullable: true, size: 1..1000
        tampilkanPenjelasanSaatUjian default: false
        soal nullable: true
    }
}
