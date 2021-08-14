<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
 pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<style>
.err
{
color:#F00;
}
</style>
</head>
<body>
<form:form action="update1" modelAttribute="em">
EmpId <form:input type="text" path="empid" /><br>
Name <form:input type="text" path="name"/><br>
password<form:input type="password" path="password"/><br>
Salary<form:input type="text" path="salary"/><span class="err">${error}</span><br>
hobbies<form:select path="hobbies"><br>
<form:option value="cricket">cricket</form:option>
<form:option value="volleyball">volleyball</form:option>
<form:option value="football">football</form:option>
<form:option value="other">other sports</form:option>
</form:select>
<form:button type="submit">update</form:button>
</form:form>

</body>
</html>