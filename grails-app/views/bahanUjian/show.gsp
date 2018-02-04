
<%@ page import="com.exam.data.BahanUjian" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'bahanUjian.label', default: 'BahanUjian')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-bahanUjian" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-bahanUjian" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list bahanUjian">
			
				<g:if test="${bahanUjianInstance?.nama}">
				<li class="fieldcontain">
					<span id="nama-label" class="property-label"><g:message code="bahanUjian.nama.label" default="Nama" /></span>
					
						<span class="property-value" aria-labelledby="nama-label"><g:fieldValue bean="${bahanUjianInstance}" field="nama"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${bahanUjianInstance?.type}">
				<li class="fieldcontain">
					<span id="type-label" class="property-label"><g:message code="bahanUjian.type.label" default="Type" /></span>
					
						<span class="property-value" aria-labelledby="type-label"><g:fieldValue bean="${bahanUjianInstance}" field="type"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${bahanUjianInstance?.level}">
				<li class="fieldcontain">
					<span id="level-label" class="property-label"><g:message code="bahanUjian.level.label" default="Level" /></span>
					
						<span class="property-value" aria-labelledby="level-label"><g:fieldValue bean="${bahanUjianInstance}" field="level"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${bahanUjianInstance?.certificate}">
				<li class="fieldcontain">
					<span id="certificate-label" class="property-label"><g:message code="bahanUjian.certificate.label" default="Certificate" /></span>
					
						<span class="property-value" aria-labelledby="certificate-label"><g:link controller="certificate" action="show" id="${bahanUjianInstance?.certificate?.id}">${bahanUjianInstance?.certificate?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${bahanUjianInstance?.informasi}">
				<li class="fieldcontain">
					<span id="informasi-label" class="property-label"><g:message code="bahanUjian.informasi.label" default="Informasi" /></span>
					
						<span class="property-value" aria-labelledby="informasi-label"><g:fieldValue bean="${bahanUjianInstance}" field="informasi"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:bahanUjianInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${bahanUjianInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
