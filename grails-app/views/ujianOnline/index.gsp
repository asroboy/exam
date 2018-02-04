
<%@ page import="com.exam.data.UjianOnline" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'ujianOnline.label', default: 'UjianOnline')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-ujianOnline" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-ujianOnline" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="nama" title="${message(code: 'ujianOnline.nama.label', default: 'Nama')}" />
					
						<g:sortableColumn property="information" title="${message(code: 'ujianOnline.information.label', default: 'Information')}" />
					
						<g:sortableColumn property="end" title="${message(code: 'ujianOnline.end.label', default: 'End')}" />
					
						<g:sortableColumn property="start" title="${message(code: 'ujianOnline.start.label', default: 'Start')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${ujianOnlineInstanceList}" status="i" var="ujianOnlineInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${ujianOnlineInstance.id}">${fieldValue(bean: ujianOnlineInstance, field: "nama")}</g:link></td>
					
						<td>${fieldValue(bean: ujianOnlineInstance, field: "information")}</td>
					
						<td><g:formatDate date="${ujianOnlineInstance.end}" /></td>
					
						<td><g:formatDate date="${ujianOnlineInstance.start}" /></td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${ujianOnlineInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
