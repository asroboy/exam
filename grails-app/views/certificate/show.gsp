
<%@ page import="com.exam.data.Certificate" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'certificate.label', default: 'Certificate')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-certificate" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-certificate" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list certificate">
			
				<g:if test="${certificateInstance?.nama}">
				<li class="fieldcontain">
					<span id="nama-label" class="property-label"><g:message code="certificate.nama.label" default="Nama" /></span>
					
						<span class="property-value" aria-labelledby="nama-label"><g:fieldValue bean="${certificateInstance}" field="nama"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${certificateInstance?.informasi}">
				<li class="fieldcontain">
					<span id="informasi-label" class="property-label"><g:message code="certificate.informasi.label" default="Informasi" /></span>
					
						<span class="property-value" aria-labelledby="informasi-label"><g:fieldValue bean="${certificateInstance}" field="informasi"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${certificateInstance?.fileSertificate}">
				<li class="fieldcontain">
					<span id="fileSertificate-label" class="property-label"><g:message code="certificate.fileSertificate.label" default="File Sertificate" /></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:certificateInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${certificateInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
