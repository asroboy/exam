
<%@ page import="com.exam.data.BahanUjian" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="theme_sbadmin">
		<g:set var="entityName" value="${message(code: 'bahanUjian.label', default: 'BahanUjian')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-bahanUjian" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-bahanUjian" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="nama" title="${message(code: 'bahanUjian.nama.label', default: 'Nama')}" />
					
						<g:sortableColumn property="type" title="${message(code: 'bahanUjian.type.label', default: 'Type')}" />
					
						<g:sortableColumn property="level" title="${message(code: 'bahanUjian.level.label', default: 'Level')}" />
					
						<th><g:message code="bahanUjian.certificate.label" default="Certificate" /></th>
					
						<g:sortableColumn property="informasi" title="${message(code: 'bahanUjian.informasi.label', default: 'Informasi')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${bahanUjianInstanceList}" status="i" var="bahanUjianInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${bahanUjianInstance.id}">${fieldValue(bean: bahanUjianInstance, field: "nama")}</g:link></td>
					
						<td>${fieldValue(bean: bahanUjianInstance, field: "type")}</td>
					
						<td>${fieldValue(bean: bahanUjianInstance, field: "level")}</td>
					
						<td>${fieldValue(bean: bahanUjianInstance, field: "certificate")}</td>
					
						<td>${fieldValue(bean: bahanUjianInstance, field: "informasi")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${bahanUjianInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
