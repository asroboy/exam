package com.exam.banksoal

class Soal {
    String pertanyaan
    String type
    String typePilihanGanda
    double skorBenar
    double skorSalah
    double skorDefault
    String informasi
    boolean adaLampiran

    static constraints = {
        pertanyaan nullable: false
        type inList: ["Pilihan Ganda"]
        typePilihanGanda inList: ["Multiple Choice", "Combination Choice"]
        skorBenar default: 1.0
        skorSalah default: 0.0
        skorDefault default: 0.0
        informasi size: 1..10000
        adaLampiran default: false
    }

}
