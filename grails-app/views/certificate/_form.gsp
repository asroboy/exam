<%@ page import="com.exam.data.Certificate" %>



<div class="fieldcontain ${hasErrors(bean: certificateInstance, field: 'nama', 'error')} ">
	<label for="nama">
		<g:message code="certificate.nama.label" default="Nama" />
		
	</label>
	<g:textField name="nama" value="${certificateInstance?.nama}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: certificateInstance, field: 'informasi', 'error')} ">
	<label for="informasi">
		<g:message code="certificate.informasi.label" default="Informasi" />
		
	</label>
	<g:textArea name="informasi" cols="40" rows="5" maxlength="10000" value="${certificateInstance?.informasi}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: certificateInstance, field: 'fileSertificate', 'error')} ">
	<label for="fileSertificate">
		<g:message code="certificate.fileSertificate.label" default="File Sertificate" />
		
	</label>
	<input type="file" id="fileSertificate" name="fileSertificate" />

</div>

