<%@ page import="com.exam.banksoal.PenjelasanSoal" %>



<div class="fieldcontain ${hasErrors(bean: penjelasanSoalInstance, field: 'penjelasanSoal', 'error')} ">
	<label for="penjelasanSoal">
		<g:message code="penjelasanSoal.penjelasanSoal.label" default="Penjelasan Soal" />
		
	</label>
	<g:textArea name="penjelasanSoal" cols="40" rows="5" maxlength="1000" value="${penjelasanSoalInstance?.penjelasanSoal}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: penjelasanSoalInstance, field: 'tampilkanPenjelasanSaatUjian', 'error')} ">
	<label for="tampilkanPenjelasanSaatUjian">
		<g:message code="penjelasanSoal.tampilkanPenjelasanSaatUjian.label" default="Tampilkan Penjelasan Saat Ujian" />
		
	</label>
	<g:checkBox name="tampilkanPenjelasanSaatUjian" value="${penjelasanSoalInstance?.tampilkanPenjelasanSaatUjian}" />

</div>

<div class="fieldcontain ${hasErrors(bean: penjelasanSoalInstance, field: 'soal', 'error')} ">
	<label for="soal">
		<g:message code="penjelasanSoal.soal.label" default="Soal" />
		
	</label>
	<g:select id="soal" name="soal.id" from="${com.exam.banksoal.Soal.list()}" optionKey="id" value="${penjelasanSoalInstance?.soal?.id}" class="many-to-one" noSelection="['null': '']"/>

</div>

