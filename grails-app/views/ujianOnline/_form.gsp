<%@ page import="com.exam.data.UjianOnline" %>



<div class="fieldcontain ${hasErrors(bean: ujianOnlineInstance, field: 'nama', 'error')} required">
	<label for="nama">
		<g:message code="ujianOnline.nama.label" default="Nama" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="nama" required="" value="${ujianOnlineInstance?.nama}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: ujianOnlineInstance, field: 'information', 'error')} ">
	<label for="information">
		<g:message code="ujianOnline.information.label" default="Information" />
		
	</label>
	<g:textField name="information" value="${ujianOnlineInstance?.information}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: ujianOnlineInstance, field: 'end', 'error')} required">
	<label for="end">
		<g:message code="ujianOnline.end.label" default="End" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="end" precision="day"  value="${ujianOnlineInstance?.end}"  />

</div>

<div class="fieldcontain ${hasErrors(bean: ujianOnlineInstance, field: 'start', 'error')} required">
	<label for="start">
		<g:message code="ujianOnline.start.label" default="Start" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="start" precision="day"  value="${ujianOnlineInstance?.start}"  />

</div>

