<%@ page import="com.exam.banksoal.Jawaban" %>



<div class="fieldcontain ${hasErrors(bean: jawabanInstance, field: 'huruf', 'error')} ">
	<label for="huruf">
		<g:message code="jawaban.huruf.label" default="Huruf" />
		
	</label>
	<g:textField name="huruf" value="${jawabanInstance?.huruf}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: jawabanInstance, field: 'jawabanBenar', 'error')} ">
	<label for="jawabanBenar">
		<g:message code="jawaban.jawabanBenar.label" default="Jawaban Benar" />
		
	</label>
	<g:checkBox name="jawabanBenar" value="${jawabanInstance?.jawabanBenar}" />

</div>

<div class="fieldcontain ${hasErrors(bean: jawabanInstance, field: 'jawaban', 'error')} ">
	<label for="jawaban">
		<g:message code="jawaban.jawaban.label" default="Jawaban" />
		
	</label>
	<g:textArea name="jawaban" cols="40" rows="5" maxlength="1000" value="${jawabanInstance?.jawaban}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: jawabanInstance, field: 'soal', 'error')} ">
	<label for="soal">
		<g:message code="jawaban.soal.label" default="Soal" />
		
	</label>
	<g:select id="soal" name="soal.id" from="${com.exam.banksoal.Soal.list()}" optionKey="id" value="${jawabanInstance?.soal?.id}" class="many-to-one" noSelection="['null': '']"/>

</div>

