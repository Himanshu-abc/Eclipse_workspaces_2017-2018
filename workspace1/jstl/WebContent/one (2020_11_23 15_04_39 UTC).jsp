<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:out value="${param.id}"></c:out>
<c:out value="${param.name}"></c:out>

<%-- <c:import url="http://www.telusko.com" var="data">
<c:out value="${data}"></c:out>
</c:import> --%>

<c:set property="name" var="n" value="400"></c:set>
value : <c:out value="${n}"></c:out>
<br>
<c:remove var="n"/>
value : <c:out value="${n}"></c:out>

</body>
</html>