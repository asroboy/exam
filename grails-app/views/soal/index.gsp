
<%@ page import="com.exam.banksoal.Soal" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'soal.label', default: 'Soal')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-soal" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-soal" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="pertanyaan" title="${message(code: 'soal.pertanyaan.label', default: 'Pertanyaan')}" />
					
						<g:sortableColumn property="type" title="${message(code: 'soal.type.label', default: 'Type')}" />
					
						<g:sortableColumn property="typePilihanGanda" title="${message(code: 'soal.typePilihanGanda.label', default: 'Type Pilihan Ganda')}" />
					
						<g:sortableColumn property="skorBenar" title="${message(code: 'soal.skorBenar.label', default: 'Skor Benar')}" />
					
						<g:sortableColumn property="skorSalah" title="${message(code: 'soal.skorSalah.label', default: 'Skor Salah')}" />
					
						<g:sortableColumn property="skorDefault" title="${message(code: 'soal.skorDefault.label', default: 'Skor Default')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${soalInstanceList}" status="i" var="soalInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${soalInstance.id}">${fieldValue(bean: soalInstance, field: "pertanyaan")}</g:link></td>
					
						<td>${fieldValue(bean: soalInstance, field: "type")}</td>
					
						<td>${fieldValue(bean: soalInstance, field: "typePilihanGanda")}</td>
					
						<td>${fieldValue(bean: soalInstance, field: "skorBenar")}</td>
					
						<td>${fieldValue(bean: soalInstance, field: "skorSalah")}</td>
					
						<td>${fieldValue(bean: soalInstance, field: "skorDefault")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${soalInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
