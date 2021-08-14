<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
.error{
color: red;
}
</style>
</head>
<body>
<h1>Login</h1>
<c:if test="${not empty error }">
<div class="error">
${error}
</div>
</c:if>
<form:form action="checkLogin" modelAttribute="user" >
USerid<form:input path="userid"/>
<br>
Password <form:password path="password"/>
<br>
<input type="submit" value="Submit"/>
</form:form>

</body>
</html>