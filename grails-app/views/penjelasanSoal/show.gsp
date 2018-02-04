
<%@ page import="com.exam.banksoal.PenjelasanSoal" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'penjelasanSoal.label', default: 'PenjelasanSoal')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-penjelasanSoal" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-penjelasanSoal" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list penjelasanSoal">
			
				<g:if test="${penjelasanSoalInstance?.penjelasanSoal}">
				<li class="fieldcontain">
					<span id="penjelasanSoal-label" class="property-label"><g:message code="penjelasanSoal.penjelasanSoal.label" default="Penjelasan Soal" /></span>
					
						<span class="property-value" aria-labelledby="penjelasanSoal-label"><g:fieldValue bean="${penjelasanSoalInstance}" field="penjelasanSoal"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${penjelasanSoalInstance?.tampilkanPenjelasanSaatUjian}">
				<li class="fieldcontain">
					<span id="tampilkanPenjelasanSaatUjian-label" class="property-label"><g:message code="penjelasanSoal.tampilkanPenjelasanSaatUjian.label" default="Tampilkan Penjelasan Saat Ujian" /></span>
					
						<span class="property-value" aria-labelledby="tampilkanPenjelasanSaatUjian-label"><g:formatBoolean boolean="${penjelasanSoalInstance?.tampilkanPenjelasanSaatUjian}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${penjelasanSoalInstance?.soal}">
				<li class="fieldcontain">
					<span id="soal-label" class="property-label"><g:message code="penjelasanSoal.soal.label" default="Soal" /></span>
					
						<span class="property-value" aria-labelledby="soal-label"><g:link controller="soal" action="show" id="${penjelasanSoalInstance?.soal?.id}">${penjelasanSoalInstance?.soal?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:penjelasanSoalInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${penjelasanSoalInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
