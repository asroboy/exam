package com.exam.banksoal



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class PenjelasanSoalController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond PenjelasanSoal.list(params), model:[penjelasanSoalInstanceCount: PenjelasanSoal.count()]
    }

    def show(PenjelasanSoal penjelasanSoalInstance) {
        respond penjelasanSoalInstance
    }

    def create() {
        respond new PenjelasanSoal(params)
    }

    @Transactional
    def save(PenjelasanSoal penjelasanSoalInstance) {
        if (penjelasanSoalInstance == null) {
            notFound()
            return
        }

        if (penjelasanSoalInstance.hasErrors()) {
            respond penjelasanSoalInstance.errors, view:'create'
            return
        }

        penjelasanSoalInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'penjelasanSoalInstance.label', default: 'PenjelasanSoal'), penjelasanSoalInstance.id])
                redirect penjelasanSoalInstance
            }
            '*' { respond penjelasanSoalInstance, [status: CREATED] }
        }
    }

    def edit(PenjelasanSoal penjelasanSoalInstance) {
        respond penjelasanSoalInstance
    }

    @Transactional
    def update(PenjelasanSoal penjelasanSoalInstance) {
        if (penjelasanSoalInstance == null) {
            notFound()
            return
        }

        if (penjelasanSoalInstance.hasErrors()) {
            respond penjelasanSoalInstance.errors, view:'edit'
            return
        }

        penjelasanSoalInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'PenjelasanSoal.label', default: 'PenjelasanSoal'), penjelasanSoalInstance.id])
                redirect penjelasanSoalInstance
            }
            '*'{ respond penjelasanSoalInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(PenjelasanSoal penjelasanSoalInstance) {

        if (penjelasanSoalInstance == null) {
            notFound()
            return
        }

        penjelasanSoalInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'PenjelasanSoal.label', default: 'PenjelasanSoal'), penjelasanSoalInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'penjelasanSoalInstance.label', default: 'PenjelasanSoal'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
