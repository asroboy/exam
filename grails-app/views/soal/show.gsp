
<%@ page import="com.exam.banksoal.Soal" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'soal.label', default: 'Soal')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-soal" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-soal" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list soal">
			
				<g:if test="${soalInstance?.pertanyaan}">
				<li class="fieldcontain">
					<span id="pertanyaan-label" class="property-label"><g:message code="soal.pertanyaan.label" default="Pertanyaan" /></span>
					
						<span class="property-value" aria-labelledby="pertanyaan-label"><g:fieldValue bean="${soalInstance}" field="pertanyaan"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${soalInstance?.type}">
				<li class="fieldcontain">
					<span id="type-label" class="property-label"><g:message code="soal.type.label" default="Type" /></span>
					
						<span class="property-value" aria-labelledby="type-label"><g:fieldValue bean="${soalInstance}" field="type"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${soalInstance?.typePilihanGanda}">
				<li class="fieldcontain">
					<span id="typePilihanGanda-label" class="property-label"><g:message code="soal.typePilihanGanda.label" default="Type Pilihan Ganda" /></span>
					
						<span class="property-value" aria-labelledby="typePilihanGanda-label"><g:fieldValue bean="${soalInstance}" field="typePilihanGanda"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${soalInstance?.skorBenar}">
				<li class="fieldcontain">
					<span id="skorBenar-label" class="property-label"><g:message code="soal.skorBenar.label" default="Skor Benar" /></span>
					
						<span class="property-value" aria-labelledby="skorBenar-label"><g:fieldValue bean="${soalInstance}" field="skorBenar"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${soalInstance?.skorSalah}">
				<li class="fieldcontain">
					<span id="skorSalah-label" class="property-label"><g:message code="soal.skorSalah.label" default="Skor Salah" /></span>
					
						<span class="property-value" aria-labelledby="skorSalah-label"><g:fieldValue bean="${soalInstance}" field="skorSalah"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${soalInstance?.skorDefault}">
				<li class="fieldcontain">
					<span id="skorDefault-label" class="property-label"><g:message code="soal.skorDefault.label" default="Skor Default" /></span>
					
						<span class="property-value" aria-labelledby="skorDefault-label"><g:fieldValue bean="${soalInstance}" field="skorDefault"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${soalInstance?.informasi}">
				<li class="fieldcontain">
					<span id="informasi-label" class="property-label"><g:message code="soal.informasi.label" default="Informasi" /></span>
					
						<span class="property-value" aria-labelledby="informasi-label"><g:fieldValue bean="${soalInstance}" field="informasi"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${soalInstance?.adaLampiran}">
				<li class="fieldcontain">
					<span id="adaLampiran-label" class="property-label"><g:message code="soal.adaLampiran.label" default="Ada Lampiran" /></span>
					
						<span class="property-value" aria-labelledby="adaLampiran-label"><g:formatBoolean boolean="${soalInstance?.adaLampiran}" /></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:soalInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${soalInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
