import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_examindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',4,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("theme_sbadmin")],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',5,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',5,[:],2)
printHtmlPart(3)
createTagBody(2, {->
printHtmlPart(4)
invokeTag('captureMeta','sitemesh',85,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("refresh"),'content':("0; url=${createLink(controller: 'login', action: 'auth')}")],-1)
printHtmlPart(1)
})
invokeTag('ifNotLoggedIn','sec',86,[:],2)
printHtmlPart(5)
})
invokeTag('captureHead','sitemesh',88,[:],1)
printHtmlPart(5)
createTagBody(1, {->
printHtmlPart(6)
expressionOut.print(meta(name:"app.name"))
printHtmlPart(7)
for( c in (grailsApplication.controllerClasses.sort { it.fullName }) ) {
printHtmlPart(8)
createTagBody(3, {->
expressionOut.print(c.fullName)
})
invokeTag('link','g',105,['controller':(c.logicalPropertyName)],3)
printHtmlPart(9)
}
printHtmlPart(10)
})
invokeTag('captureBody','sitemesh',112,[:],1)
printHtmlPart(11)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1516932757545L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
