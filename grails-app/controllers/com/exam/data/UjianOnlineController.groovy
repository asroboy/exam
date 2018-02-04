package com.exam.data



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class UjianOnlineController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond UjianOnline.list(params), model:[ujianOnlineInstanceCount: UjianOnline.count()]
    }

    def show(UjianOnline ujianOnlineInstance) {
        respond ujianOnlineInstance
    }

    def create() {
        respond new UjianOnline(params)
    }

    @Transactional
    def save(UjianOnline ujianOnlineInstance) {
        if (ujianOnlineInstance == null) {
            notFound()
            return
        }

        if (ujianOnlineInstance.hasErrors()) {
            respond ujianOnlineInstance.errors, view:'create'
            return
        }

        ujianOnlineInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'ujianOnlineInstance.label', default: 'UjianOnline'), ujianOnlineInstance.id])
                redirect ujianOnlineInstance
            }
            '*' { respond ujianOnlineInstance, [status: CREATED] }
        }
    }

    def edit(UjianOnline ujianOnlineInstance) {
        respond ujianOnlineInstance
    }

    @Transactional
    def update(UjianOnline ujianOnlineInstance) {
        if (ujianOnlineInstance == null) {
            notFound()
            return
        }

        if (ujianOnlineInstance.hasErrors()) {
            respond ujianOnlineInstance.errors, view:'edit'
            return
        }

        ujianOnlineInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'UjianOnline.label', default: 'UjianOnline'), ujianOnlineInstance.id])
                redirect ujianOnlineInstance
            }
            '*'{ respond ujianOnlineInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(UjianOnline ujianOnlineInstance) {

        if (ujianOnlineInstance == null) {
            notFound()
            return
        }

        ujianOnlineInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'UjianOnline.label', default: 'UjianOnline'), ujianOnlineInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'ujianOnlineInstance.label', default: 'UjianOnline'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
