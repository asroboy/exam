
<%@ page import="com.exam.banksoal.Jawaban" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'jawaban.label', default: 'Jawaban')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-jawaban" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-jawaban" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list jawaban">
			
				<g:if test="${jawabanInstance?.huruf}">
				<li class="fieldcontain">
					<span id="huruf-label" class="property-label"><g:message code="jawaban.huruf.label" default="Huruf" /></span>
					
						<span class="property-value" aria-labelledby="huruf-label"><g:fieldValue bean="${jawabanInstance}" field="huruf"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${jawabanInstance?.jawabanBenar}">
				<li class="fieldcontain">
					<span id="jawabanBenar-label" class="property-label"><g:message code="jawaban.jawabanBenar.label" default="Jawaban Benar" /></span>
					
						<span class="property-value" aria-labelledby="jawabanBenar-label"><g:formatBoolean boolean="${jawabanInstance?.jawabanBenar}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${jawabanInstance?.jawaban}">
				<li class="fieldcontain">
					<span id="jawaban-label" class="property-label"><g:message code="jawaban.jawaban.label" default="Jawaban" /></span>
					
						<span class="property-value" aria-labelledby="jawaban-label"><g:fieldValue bean="${jawabanInstance}" field="jawaban"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${jawabanInstance?.soal}">
				<li class="fieldcontain">
					<span id="soal-label" class="property-label"><g:message code="jawaban.soal.label" default="Soal" /></span>
					
						<span class="property-value" aria-labelledby="soal-label"><g:link controller="soal" action="show" id="${jawabanInstance?.soal?.id}">${jawabanInstance?.soal?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:jawabanInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${jawabanInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
