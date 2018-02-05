import com.exam.data.BahanUjian
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_exam_bahanUjian_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/bahanUjian/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: bahanUjianInstance, field: 'nama', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("bahanUjian.nama.label"),'default':("Nama")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("nama"),'value':(bahanUjianInstance?.nama)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: bahanUjianInstance, field: 'type', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("bahanUjian.type.label"),'default':("Type")],-1)
printHtmlPart(2)
invokeTag('select','g',19,['name':("type"),'from':(bahanUjianInstance.constraints.type.inList),'value':(bahanUjianInstance?.type),'valueMessagePrefix':("bahanUjian.type"),'noSelection':(['': ''])],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: bahanUjianInstance, field: 'level', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("bahanUjian.level.label"),'default':("Level")],-1)
printHtmlPart(2)
invokeTag('select','g',28,['name':("level"),'from':(bahanUjianInstance.constraints.level.inList),'value':(bahanUjianInstance?.level),'valueMessagePrefix':("bahanUjian.level"),'noSelection':(['': ''])],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: bahanUjianInstance, field: 'certificate', 'error'))
printHtmlPart(6)
invokeTag('message','g',34,['code':("bahanUjian.certificate.label"),'default':("Certificate")],-1)
printHtmlPart(2)
invokeTag('select','g',37,['id':("certificate"),'name':("certificate.id"),'from':(com.exam.data.Certificate.list()),'optionKey':("id"),'value':(bahanUjianInstance?.certificate?.id),'class':("many-to-one"),'noSelection':(['null': ''])],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: bahanUjianInstance, field: 'informasi', 'error'))
printHtmlPart(7)
invokeTag('message','g',43,['code':("bahanUjian.informasi.label"),'default':("Informasi")],-1)
printHtmlPart(2)
invokeTag('textArea','g',46,['name':("informasi"),'cols':("40"),'rows':("5"),'maxlength':("10000"),'value':(bahanUjianInstance?.informasi)],-1)
printHtmlPart(8)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1517420822377L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
