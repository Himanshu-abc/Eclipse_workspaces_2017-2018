<%@page import="com.xyz.dao.UserDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AddUser</title>
</head>
<body>
<jsp:useBean id="u" class="com.xyz.dao.User"  scope="request"></jsp:useBean>

<jsp:setProperty property="*" name="u" />
<%

UserDao ud=new UserDao();
int i=ud.addUser(u);

if(i>0){
	response.sendRedirect("ViewUser.jsp");
}
else{
	response.sendRedirect("AddUser.jsp");
}
%>
</body>
</html>