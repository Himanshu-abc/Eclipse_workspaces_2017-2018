<%@ page import="com.app.dao.EmployeeDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%-- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="obj" class="com.app.bean.Employee" type="com.app.bean.Employee" scope="page"></jsp:useBean>

<jsp:setProperty property="*" name="obj"/>

<%
int r=EmployeeDao.save(obj);

if(r>0){
 response.sendRedirect("success.jsp");
}
else{
	response.sendRedirect("unsuccess.jsp");
}
%>

</body>
</html>