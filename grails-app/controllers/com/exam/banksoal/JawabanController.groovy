package com.exam.banksoal



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class JawabanController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Jawaban.list(params), model:[jawabanInstanceCount: Jawaban.count()]
    }

    def show(Jawaban jawabanInstance) {
        respond jawabanInstance
    }

    def create() {
        respond new Jawaban(params)
    }

    @Transactional
    def save(Jawaban jawabanInstance) {
        if (jawabanInstance == null) {
            notFound()
            return
        }

        if (jawabanInstance.hasErrors()) {
            respond jawabanInstance.errors, view:'create'
            return
        }

        jawabanInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'jawabanInstance.label', default: 'Jawaban'), jawabanInstance.id])
                redirect jawabanInstance
            }
            '*' { respond jawabanInstance, [status: CREATED] }
        }
    }

    def edit(Jawaban jawabanInstance) {
        respond jawabanInstance
    }

    @Transactional
    def update(Jawaban jawabanInstance) {
        if (jawabanInstance == null) {
            notFound()
            return
        }

        if (jawabanInstance.hasErrors()) {
            respond jawabanInstance.errors, view:'edit'
            return
        }

        jawabanInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Jawaban.label', default: 'Jawaban'), jawabanInstance.id])
                redirect jawabanInstance
            }
            '*'{ respond jawabanInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Jawaban jawabanInstance) {

        if (jawabanInstance == null) {
            notFound()
            return
        }

        jawabanInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Jawaban.label', default: 'Jawaban'), jawabanInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'jawabanInstance.label', default: 'Jawaban'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
