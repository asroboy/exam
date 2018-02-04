package com.exam.data



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class BahanUjianController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond BahanUjian.list(params), model:[bahanUjianInstanceCount: BahanUjian.count()]
    }

    def show(BahanUjian bahanUjianInstance) {
        respond bahanUjianInstance
    }

    def create() {
        respond new BahanUjian(params)
    }

    @Transactional
    def save(BahanUjian bahanUjianInstance) {
        if (bahanUjianInstance == null) {
            notFound()
            return
        }

        if (bahanUjianInstance.hasErrors()) {
            respond bahanUjianInstance.errors, view:'create'
            return
        }

        bahanUjianInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'bahanUjianInstance.label', default: 'BahanUjian'), bahanUjianInstance.id])
                redirect bahanUjianInstance
            }
            '*' { respond bahanUjianInstance, [status: CREATED] }
        }
    }

    def edit(BahanUjian bahanUjianInstance) {
        respond bahanUjianInstance
    }

    @Transactional
    def update(BahanUjian bahanUjianInstance) {
        if (bahanUjianInstance == null) {
            notFound()
            return
        }

        if (bahanUjianInstance.hasErrors()) {
            respond bahanUjianInstance.errors, view:'edit'
            return
        }

        bahanUjianInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'BahanUjian.label', default: 'BahanUjian'), bahanUjianInstance.id])
                redirect bahanUjianInstance
            }
            '*'{ respond bahanUjianInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(BahanUjian bahanUjianInstance) {

        if (bahanUjianInstance == null) {
            notFound()
            return
        }

        bahanUjianInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'BahanUjian.label', default: 'BahanUjian'), bahanUjianInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'bahanUjianInstance.label', default: 'BahanUjian'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
