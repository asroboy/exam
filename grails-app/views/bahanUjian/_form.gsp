<%@ page import="com.exam.data.BahanUjian" %>



<div class="fieldcontain ${hasErrors(bean: bahanUjianInstance, field: 'nama', 'error')} ">
	<label for="nama">
		<g:message code="bahanUjian.nama.label" default="Nama" />
		
	</label>
	<g:textField name="nama" value="${bahanUjianInstance?.nama}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: bahanUjianInstance, field: 'type', 'error')} ">
	<label for="type">
		<g:message code="bahanUjian.type.label" default="Type" />
		
	</label>
	<g:select name="type" from="${bahanUjianInstance.constraints.type.inList}" value="${bahanUjianInstance?.type}" valueMessagePrefix="bahanUjian.type" noSelection="['': '']"/>

</div>

<div class="fieldcontain ${hasErrors(bean: bahanUjianInstance, field: 'level', 'error')} ">
	<label for="level">
		<g:message code="bahanUjian.level.label" default="Level" />
		
	</label>
	<g:select name="level" from="${bahanUjianInstance.constraints.level.inList}" value="${bahanUjianInstance?.level}" valueMessagePrefix="bahanUjian.level" noSelection="['': '']"/>

</div>

<div class="fieldcontain ${hasErrors(bean: bahanUjianInstance, field: 'certificate', 'error')} ">
	<label for="certificate">
		<g:message code="bahanUjian.certificate.label" default="Certificate" />
		
	</label>
	<g:select id="certificate" name="certificate.id" from="${com.exam.data.Certificate.list()}" optionKey="id" value="${bahanUjianInstance?.certificate?.id}" class="many-to-one" noSelection="['null': '']"/>

</div>

<div class="fieldcontain ${hasErrors(bean: bahanUjianInstance, field: 'informasi', 'error')} ">
	<label for="informasi">
		<g:message code="bahanUjian.informasi.label" default="Informasi" />
		
	</label>
	<g:textArea name="informasi" cols="40" rows="5" maxlength="10000" value="${bahanUjianInstance?.informasi}"/>

</div>

