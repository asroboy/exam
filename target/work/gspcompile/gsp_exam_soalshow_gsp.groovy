import com.exam.banksoal.Soal
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_exam_soalshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/soal/show.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'soal.label', default: 'Soal'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',8,['code':("default.show.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',8,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',8,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',9,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('message','g',11,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(5)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(6)
invokeTag('message','g',14,['code':("default.home.label")],-1)
printHtmlPart(7)
createTagBody(2, {->
invokeTag('message','g',15,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('link','g',15,['class':("list"),'action':("index")],2)
printHtmlPart(8)
createTagBody(2, {->
invokeTag('message','g',16,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',16,['class':("create"),'action':("create")],2)
printHtmlPart(9)
invokeTag('message','g',20,['code':("default.show.label"),'args':([entityName])],-1)
printHtmlPart(10)
if(true && (flash.message)) {
printHtmlPart(11)
expressionOut.print(flash.message)
printHtmlPart(12)
}
printHtmlPart(13)
if(true && (soalInstance?.pertanyaan)) {
printHtmlPart(14)
invokeTag('message','g',28,['code':("soal.pertanyaan.label"),'default':("Pertanyaan")],-1)
printHtmlPart(15)
invokeTag('fieldValue','g',30,['bean':(soalInstance),'field':("pertanyaan")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (soalInstance?.type)) {
printHtmlPart(18)
invokeTag('message','g',37,['code':("soal.type.label"),'default':("Type")],-1)
printHtmlPart(19)
invokeTag('fieldValue','g',39,['bean':(soalInstance),'field':("type")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (soalInstance?.typePilihanGanda)) {
printHtmlPart(20)
invokeTag('message','g',46,['code':("soal.typePilihanGanda.label"),'default':("Type Pilihan Ganda")],-1)
printHtmlPart(21)
invokeTag('fieldValue','g',48,['bean':(soalInstance),'field':("typePilihanGanda")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (soalInstance?.skorBenar)) {
printHtmlPart(22)
invokeTag('message','g',55,['code':("soal.skorBenar.label"),'default':("Skor Benar")],-1)
printHtmlPart(23)
invokeTag('fieldValue','g',57,['bean':(soalInstance),'field':("skorBenar")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (soalInstance?.skorSalah)) {
printHtmlPart(24)
invokeTag('message','g',64,['code':("soal.skorSalah.label"),'default':("Skor Salah")],-1)
printHtmlPart(25)
invokeTag('fieldValue','g',66,['bean':(soalInstance),'field':("skorSalah")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (soalInstance?.skorDefault)) {
printHtmlPart(26)
invokeTag('message','g',73,['code':("soal.skorDefault.label"),'default':("Skor Default")],-1)
printHtmlPart(27)
invokeTag('fieldValue','g',75,['bean':(soalInstance),'field':("skorDefault")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (soalInstance?.informasi)) {
printHtmlPart(28)
invokeTag('message','g',82,['code':("soal.informasi.label"),'default':("Informasi")],-1)
printHtmlPart(29)
invokeTag('fieldValue','g',84,['bean':(soalInstance),'field':("informasi")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (soalInstance?.adaLampiran)) {
printHtmlPart(30)
invokeTag('message','g',91,['code':("soal.adaLampiran.label"),'default':("Ada Lampiran")],-1)
printHtmlPart(31)
invokeTag('formatBoolean','g',93,['boolean':(soalInstance?.adaLampiran)],-1)
printHtmlPart(16)
}
printHtmlPart(32)
createTagBody(2, {->
printHtmlPart(33)
createTagBody(3, {->
invokeTag('message','g',101,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',101,['class':("edit"),'action':("edit"),'resource':(soalInstance)],3)
printHtmlPart(34)
invokeTag('actionSubmit','g',102,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(35)
})
invokeTag('form','g',104,['url':([resource:soalInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(36)
})
invokeTag('captureBody','sitemesh',106,[:],1)
printHtmlPart(37)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1517423001538L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
