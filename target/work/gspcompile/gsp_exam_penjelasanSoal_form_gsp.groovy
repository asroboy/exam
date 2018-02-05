import com.exam.banksoal.PenjelasanSoal
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_exam_penjelasanSoal_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/penjelasanSoal/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: penjelasanSoalInstance, field: 'penjelasanSoal', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("penjelasanSoal.penjelasanSoal.label"),'default':("Penjelasan Soal")],-1)
printHtmlPart(2)
invokeTag('textArea','g',10,['name':("penjelasanSoal"),'cols':("40"),'rows':("5"),'maxlength':("1000"),'value':(penjelasanSoalInstance?.penjelasanSoal)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: penjelasanSoalInstance, field: 'tampilkanPenjelasanSaatUjian', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("penjelasanSoal.tampilkanPenjelasanSaatUjian.label"),'default':("Tampilkan Penjelasan Saat Ujian")],-1)
printHtmlPart(2)
invokeTag('checkBox','g',19,['name':("tampilkanPenjelasanSaatUjian"),'value':(penjelasanSoalInstance?.tampilkanPenjelasanSaatUjian)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: penjelasanSoalInstance, field: 'soal', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("penjelasanSoal.soal.label"),'default':("Soal")],-1)
printHtmlPart(2)
invokeTag('select','g',28,['id':("soal"),'name':("soal.id"),'from':(com.exam.banksoal.Soal.list()),'optionKey':("id"),'value':(penjelasanSoalInstance?.soal?.id),'class':("many-to-one"),'noSelection':(['null': ''])],-1)
printHtmlPart(6)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1517423209905L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
