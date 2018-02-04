
<%@ page import="com.exam.data.UjianOnline" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'ujianOnline.label', default: 'UjianOnline')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-ujianOnline" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-ujianOnline" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list ujianOnline">
			
				<g:if test="${ujianOnlineInstance?.nama}">
				<li class="fieldcontain">
					<span id="nama-label" class="property-label"><g:message code="ujianOnline.nama.label" default="Nama" /></span>
					
						<span class="property-value" aria-labelledby="nama-label"><g:fieldValue bean="${ujianOnlineInstance}" field="nama"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${ujianOnlineInstance?.information}">
				<li class="fieldcontain">
					<span id="information-label" class="property-label"><g:message code="ujianOnline.information.label" default="Information" /></span>
					
						<span class="property-value" aria-labelledby="information-label"><g:fieldValue bean="${ujianOnlineInstance}" field="information"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${ujianOnlineInstance?.end}">
				<li class="fieldcontain">
					<span id="end-label" class="property-label"><g:message code="ujianOnline.end.label" default="End" /></span>
					
						<span class="property-value" aria-labelledby="end-label"><g:formatDate date="${ujianOnlineInstance?.end}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${ujianOnlineInstance?.start}">
				<li class="fieldcontain">
					<span id="start-label" class="property-label"><g:message code="ujianOnline.start.label" default="Start" /></span>
					
						<span class="property-value" aria-labelledby="start-label"><g:formatDate date="${ujianOnlineInstance?.start}" /></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:ujianOnlineInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${ujianOnlineInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
