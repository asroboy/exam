import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_exam_requestmapedit_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/requestmap/edit.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',3,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':(layoutUi)],-1)
printHtmlPart(1)
invokeTag('title','s2ui',4,['messageCode':("default.edit.label"),'entityNameMessageCode':("requestmap.label"),'entityNameDefault':("Requestmap")],-1)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',5,[:],1)
printHtmlPart(2)
createTagBody(1, {->
printHtmlPart(3)
createTagBody(2, {->
printHtmlPart(4)
createTagBody(3, {->
printHtmlPart(5)
invokeTag('textFieldRow','s2ui',14,['name':("url"),'size':("50"),'labelCodeDefault':("URL")],-1)
printHtmlPart(6)
invokeTag('textFieldRow','s2ui',15,['name':("configAttribute"),'size':("50"),'labelCodeDefault':("Config Attribute")],-1)
printHtmlPart(6)
if(true && (hasHttpMethod)) {
printHtmlPart(6)
invokeTag('selectRow','s2ui',18,['name':("httpMethod"),'noSelection':(['': '']),'optionKey':({it}),'labelCodeDefault':("HttpMethod"),'from':(org.springframework.http.HttpMethod.values())],-1)
printHtmlPart(6)
}
printHtmlPart(7)
invokeTag('submitButton','s2ui',24,[:],-1)
printHtmlPart(8)
if(true && (requestmap)) {
printHtmlPart(8)
invokeTag('deleteButton','s2ui',26,[:],-1)
printHtmlPart(8)
}
printHtmlPart(9)
})
invokeTag('form','s2ui',29,[:],3)
printHtmlPart(10)
})
invokeTag('formContainer','s2ui',30,['type':("update"),'beanType':("requestmap"),'focus':("url"),'height':("350")],2)
printHtmlPart(10)
if(true && (requestmap)) {
printHtmlPart(10)
invokeTag('deleteButtonForm','s2ui',32,['instanceId':(requestmap.id)],-1)
printHtmlPart(10)
}
printHtmlPart(11)
})
invokeTag('captureBody','sitemesh',35,[:],1)
printHtmlPart(12)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1516224966799L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
