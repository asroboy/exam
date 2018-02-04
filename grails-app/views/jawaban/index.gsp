
<%@ page import="com.exam.banksoal.Jawaban" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'jawaban.label', default: 'Jawaban')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-jawaban" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-jawaban" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="huruf" title="${message(code: 'jawaban.huruf.label', default: 'Huruf')}" />
					
						<g:sortableColumn property="jawabanBenar" title="${message(code: 'jawaban.jawabanBenar.label', default: 'Jawaban Benar')}" />
					
						<g:sortableColumn property="jawaban" title="${message(code: 'jawaban.jawaban.label', default: 'Jawaban')}" />
					
						<th><g:message code="jawaban.soal.label" default="Soal" /></th>
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${jawabanInstanceList}" status="i" var="jawabanInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${jawabanInstance.id}">${fieldValue(bean: jawabanInstance, field: "huruf")}</g:link></td>
					
						<td><g:formatBoolean boolean="${jawabanInstance.jawabanBenar}" /></td>
					
						<td>${fieldValue(bean: jawabanInstance, field: "jawaban")}</td>
					
						<td>${fieldValue(bean: jawabanInstance, field: "soal")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${jawabanInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
