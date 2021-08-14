<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>student form</title>
</head>
<body>
<c:form action="/ps6/employeeDetail.html" method="post" modelAttribute="emp">

name : <c:input  path="name"/><br><br>
age : <c:input path="age"/><br><br>
hobby : <c:input path="hobby"/><br><br>
skills : <c:select path="skills" multiple="multiple"><br><br>

<c:option value="c">c</c:option>
<c:option value="c++">c++</c:option>
<c:option value="java">java</c:option>
<c:option value="sql">sql</c:option>
<c:option value="other">other</c:option>
</c:select>

country : <c:input path="address.country"/><br><br>
city : <c:input path="address.city"/><br><br>
pinCode <c:input path="address.pinCode"/><br><br>

<button type="submit" value="send"></button>
</c:form>
</body>
</html>