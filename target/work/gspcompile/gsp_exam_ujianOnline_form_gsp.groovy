import com.exam.data.UjianOnline
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_exam_ujianOnline_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/ujianOnline/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: ujianOnlineInstance, field: 'nama', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("ujianOnline.nama.label"),'default':("Nama")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("nama"),'required':(""),'value':(ujianOnlineInstance?.nama)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: ujianOnlineInstance, field: 'information', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("ujianOnline.information.label"),'default':("Information")],-1)
printHtmlPart(5)
invokeTag('textField','g',19,['name':("information"),'value':(ujianOnlineInstance?.information)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: ujianOnlineInstance, field: 'end', 'error'))
printHtmlPart(6)
invokeTag('message','g',25,['code':("ujianOnline.end.label"),'default':("End")],-1)
printHtmlPart(2)
invokeTag('datePicker','g',28,['name':("end"),'precision':("day"),'value':(ujianOnlineInstance?.end)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: ujianOnlineInstance, field: 'start', 'error'))
printHtmlPart(7)
invokeTag('message','g',34,['code':("ujianOnline.start.label"),'default':("Start")],-1)
printHtmlPart(2)
invokeTag('datePicker','g',37,['name':("start"),'precision':("day"),'value':(ujianOnlineInstance?.start)],-1)
printHtmlPart(8)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1517443934730L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
