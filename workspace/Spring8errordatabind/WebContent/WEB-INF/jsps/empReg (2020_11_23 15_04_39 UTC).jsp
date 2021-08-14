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
Gender <form:radiobutton path="gender" value="MALE"/>Male <form:radiobutton path="gender" value="FEMALE"/>Female
<br>
Emp ID <form:input type="text" path="empid" /><br>
Name <form:input type="text" path="name" /><br>
City
<form:select path="city.cityCode">
<form:option value="indb">Indore</form:option>
<form:option value="bpl">Bhopal</form:option>
</form:select>
<br>



Hobbies <form:checkbox path="hobbies" value="Cricket"/>Cricket
<form:checkbox path="hobbies" value="Chatting"/>Chatting
<form:checkbox path="hobbies" value="Reading"/>Reading<br>
<form:select path="qualifications">
<form:option value="BE">BE</form:option>
<form:option value="ME">ME</form:option>
<form:option value="BCA">BCA</form:option>
<form:option value="MCA">MCA</form:option>
</form:select>


<button type="submit">Submit</button>
</form:form>
</body>
</html>