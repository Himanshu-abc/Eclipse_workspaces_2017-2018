<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Form Page</title>
</head>
<body>

<form:errors path="emp"></form:errors>

<form:form action="doEmpReg" method="post" modelAttribute="emp">

Id : <form:input path="id"/><br><br>
Name : <form:input path="name"/><br><br>
Password : <form:input  path="password"/><br><br>
Salary : <form:input path="salary"/><br><br>
Hobbies : <form:select path="hobbies" multiple="true">

<form:option value="cricket">cricket</form:option>
<form:option value="Football">football</form:option>
<form:option value="others">other</form:option>
</form:select><br><br>
<button type="submit" value="save"></button>
</form:form>

</body>
</html>