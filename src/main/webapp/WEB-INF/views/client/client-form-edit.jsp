<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<h1>New Client:</h1>

<form:form action="${action}" commandName="client"
	modelAttribute="client" method="POST">

	<form:label path="name">Name:</form:label>
	<form:input path="name" />
	<form:errors path="name" />
	<br />

	<c:if test="${client.id > 0}">
		<form:label path="ssn">SSN:</form:label>
		<form:hidden path="ssn" /> ${client.ssn} <br />
		<br />
	</c:if>

	<c:if test="${client.id == 0}">
		<form:label path="ssn">SSN:</form:label>
		<form:input path="ssn" />
		<form:errors path="ssn" />
		<br />
		<br />
	</c:if>

	<br />
	<br />

	<form:label path="active">Is Active:</form:label>
	<br />
	<form:checkbox path="active" />
	<form:errors path="active" cssClass="error" />

	<br />
	<br />

	<form:label path="notes">Notes:</form:label>
	<br />
	<form:textarea path="notes" />
	<form:errors path="notes" cssClass="error" />

	<br />
	<br />

	<input type="submit" value="Save" />
	<input type="reset" value="Cancel" />

</form:form>
