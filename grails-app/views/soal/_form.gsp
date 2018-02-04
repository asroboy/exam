<%@ page import="com.exam.banksoal.Soal" %>



<div class="fieldcontain ${hasErrors(bean: soalInstance, field: 'pertanyaan', 'error')} ">
	<label for="pertanyaan">
		<g:message code="soal.pertanyaan.label" default="Pertanyaan" />
		
	</label>
	<g:textField name="pertanyaan" value="${soalInstance?.pertanyaan}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: soalInstance, field: 'type', 'error')} ">
	<label for="type">
		<g:message code="soal.type.label" default="Type" />
		
	</label>
	<g:select name="type" from="${soalInstance.constraints.type.inList}" value="${soalInstance?.type}" valueMessagePrefix="soal.type" noSelection="['': '']"/>

</div>

<div class="fieldcontain ${hasErrors(bean: soalInstance, field: 'typePilihanGanda', 'error')} ">
	<label for="typePilihanGanda">
		<g:message code="soal.typePilihanGanda.label" default="Type Pilihan Ganda" />
		
	</label>
	<g:select name="typePilihanGanda" from="${soalInstance.constraints.typePilihanGanda.inList}" value="${soalInstance?.typePilihanGanda}" valueMessagePrefix="soal.typePilihanGanda" noSelection="['': '']"/>

</div>

<div class="fieldcontain ${hasErrors(bean: soalInstance, field: 'skorBenar', 'error')} required">
	<label for="skorBenar">
		<g:message code="soal.skorBenar.label" default="Skor Benar" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="skorBenar" value="${fieldValue(bean: soalInstance, field: 'skorBenar')}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: soalInstance, field: 'skorSalah', 'error')} required">
	<label for="skorSalah">
		<g:message code="soal.skorSalah.label" default="Skor Salah" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="skorSalah" value="${fieldValue(bean: soalInstance, field: 'skorSalah')}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: soalInstance, field: 'skorDefault', 'error')} required">
	<label for="skorDefault">
		<g:message code="soal.skorDefault.label" default="Skor Default" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="skorDefault" value="${fieldValue(bean: soalInstance, field: 'skorDefault')}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: soalInstance, field: 'informasi', 'error')} ">
	<label for="informasi">
		<g:message code="soal.informasi.label" default="Informasi" />
		
	</label>
	<g:textArea name="informasi" cols="40" rows="5" maxlength="10000" value="${soalInstance?.informasi}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: soalInstance, field: 'adaLampiran', 'error')} ">
	<label for="adaLampiran">
		<g:message code="soal.adaLampiran.label" default="Ada Lampiran" />
		
	</label>
	<g:checkBox name="adaLampiran" value="${soalInstance?.adaLampiran}" />

</div>

