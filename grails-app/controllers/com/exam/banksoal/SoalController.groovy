package com.exam.banksoal



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class SoalController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Soal.list(params), model:[soalInstanceCount: Soal.count()]
    }

    def show(Soal soalInstance) {
        respond soalInstance
    }

    def create() {
        respond new Soal(params)
    }

    @Transactional
    def save(Soal soalInstance) {
        if (soalInstance == null) {
            notFound()
            return
        }

        if (soalInstance.hasErrors()) {
            respond soalInstance.errors, view:'create'
            return
        }

        soalInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'soalInstance.label', default: 'Soal'), soalInstance.id])
                redirect soalInstance
            }
            '*' { respond soalInstance, [status: CREATED] }
        }
    }

    def edit(Soal soalInstance) {
        respond soalInstance
    }

    @Transactional
    def update(Soal soalInstance) {
        if (soalInstance == null) {
            notFound()
            return
        }

        if (soalInstance.hasErrors()) {
            respond soalInstance.errors, view:'edit'
            return
        }

        soalInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Soal.label', default: 'Soal'), soalInstance.id])
                redirect soalInstance
            }
            '*'{ respond soalInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Soal soalInstance) {

        if (soalInstance == null) {
            notFound()
            return
        }

        soalInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Soal.label', default: 'Soal'), soalInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'soalInstance.label', default: 'Soal'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
