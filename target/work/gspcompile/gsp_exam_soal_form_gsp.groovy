import com.exam.banksoal.Soal
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_exam_soal_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/soal/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: soalInstance, field: 'pertanyaan', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("soal.pertanyaan.label"),'default':("Pertanyaan")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("pertanyaan"),'value':(soalInstance?.pertanyaan)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: soalInstance, field: 'type', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("soal.type.label"),'default':("Type")],-1)
printHtmlPart(2)
invokeTag('select','g',19,['name':("type"),'from':(soalInstance.constraints.type.inList),'value':(soalInstance?.type),'valueMessagePrefix':("soal.type"),'noSelection':(['': ''])],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: soalInstance, field: 'typePilihanGanda', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("soal.typePilihanGanda.label"),'default':("Type Pilihan Ganda")],-1)
printHtmlPart(2)
invokeTag('select','g',28,['name':("typePilihanGanda"),'from':(soalInstance.constraints.typePilihanGanda.inList),'value':(soalInstance?.typePilihanGanda),'valueMessagePrefix':("soal.typePilihanGanda"),'noSelection':(['': ''])],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: soalInstance, field: 'skorBenar', 'error'))
printHtmlPart(6)
invokeTag('message','g',34,['code':("soal.skorBenar.label"),'default':("Skor Benar")],-1)
printHtmlPart(7)
invokeTag('field','g',37,['name':("skorBenar"),'value':(fieldValue(bean: soalInstance, field: 'skorBenar')),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: soalInstance, field: 'skorSalah', 'error'))
printHtmlPart(8)
invokeTag('message','g',43,['code':("soal.skorSalah.label"),'default':("Skor Salah")],-1)
printHtmlPart(7)
invokeTag('field','g',46,['name':("skorSalah"),'value':(fieldValue(bean: soalInstance, field: 'skorSalah')),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: soalInstance, field: 'skorDefault', 'error'))
printHtmlPart(9)
invokeTag('message','g',52,['code':("soal.skorDefault.label"),'default':("Skor Default")],-1)
printHtmlPart(7)
invokeTag('field','g',55,['name':("skorDefault"),'value':(fieldValue(bean: soalInstance, field: 'skorDefault')),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: soalInstance, field: 'informasi', 'error'))
printHtmlPart(10)
invokeTag('message','g',61,['code':("soal.informasi.label"),'default':("Informasi")],-1)
printHtmlPart(2)
invokeTag('textArea','g',64,['name':("informasi"),'cols':("40"),'rows':("5"),'maxlength':("10000"),'value':(soalInstance?.informasi)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: soalInstance, field: 'adaLampiran', 'error'))
printHtmlPart(11)
invokeTag('message','g',70,['code':("soal.adaLampiran.label"),'default':("Ada Lampiran")],-1)
printHtmlPart(2)
invokeTag('checkBox','g',73,['name':("adaLampiran"),'value':(soalInstance?.adaLampiran)],-1)
printHtmlPart(12)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1517423001863L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
