<!DOCTYPE html >
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Error Demos</title>
<style type="text/css">
.error{
color: red; 
}

.errorblock {
	color: #000;
	background-color: #ffEEEE;
	border: 3px solid #ff0000;
	padding: 8px;
	margin: 16px;
}
</style>
</head>
<body>

<form:form action="doReg" modelAttribute="user">
<form:errors path="*" cssClass="errorblock" element="div" />
Enter Name <form:input path="name"/><form:errors path="name" cssClass="error"></form:errors>
<br>
Enter Age <form:input path="age"/><form:errors path="age" cssClass="error"></form:errors>
<br>
Enter Salary <form:input path="salary"/><form:errors path="salary" cssClass="error"></form:errors>

<br>
<input type="submit" value="Submit"/>
</form:form>
</body>
</html>