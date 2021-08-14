<%@page import="com.app.bean.EmployeeDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="obj" class="com.app.bean.Employee" scope="request" type="com.app.bean.Employee"></jsp:useBean>

<jsp:setProperty property="*" name="obj" />

<%-- <jsp:setProperty property="name" name="obj" value=/> --%>

<%
   int s= EmployeeDao.register(obj);

   if(s>0){
	   out.println("data successfully saved");
   }
   else{
	   out.println("error");
   }

%>

</body>
</html>