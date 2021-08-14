<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
<style>
.err{
color:#F00;
}
</style>
</head>
<body>
<form:form action="doEmpReg" modelAttribute="emp">
Emp ID <form:input type="text" path="empId" /><br>
Name <form:input type="text" path="name" /><br>
Password <form:input type="password" path="password" /><br>
Salary <form:input type="text" path="salary" /><span class="err">${error}</span><br>
Hobbies <form:select path="hobbies">
	<form:option value="Cricket">Cricket</form:option>
	<form:option value="Football">Football</form:option>
	<form:option value="Others">Others</form:option>
</form:select>
<button type="submit">Submit</button>
</form:form>
</body>
</html>