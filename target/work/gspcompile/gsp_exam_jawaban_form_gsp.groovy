import com.exam.banksoal.Jawaban
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_exam_jawaban_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/jawaban/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: jawabanInstance, field: 'huruf', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("jawaban.huruf.label"),'default':("Huruf")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("huruf"),'value':(jawabanInstance?.huruf)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: jawabanInstance, field: 'jawabanBenar', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("jawaban.jawabanBenar.label"),'default':("Jawaban Benar")],-1)
printHtmlPart(2)
invokeTag('checkBox','g',19,['name':("jawabanBenar"),'value':(jawabanInstance?.jawabanBenar)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: jawabanInstance, field: 'jawaban', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("jawaban.jawaban.label"),'default':("Jawaban")],-1)
printHtmlPart(2)
invokeTag('textArea','g',28,['name':("jawaban"),'cols':("40"),'rows':("5"),'maxlength':("1000"),'value':(jawabanInstance?.jawaban)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: jawabanInstance, field: 'soal', 'error'))
printHtmlPart(6)
invokeTag('message','g',34,['code':("jawaban.soal.label"),'default':("Soal")],-1)
printHtmlPart(2)
invokeTag('select','g',37,['id':("soal"),'name':("soal.id"),'from':(com.exam.banksoal.Soal.list()),'optionKey':("id"),'value':(jawabanInstance?.soal?.id),'class':("many-to-one"),'noSelection':(['null': ''])],-1)
printHtmlPart(7)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1517423172579L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
