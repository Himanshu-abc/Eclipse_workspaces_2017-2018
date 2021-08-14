<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" info="create by himanshu" isELIgnored="false" isThreadSafe="true" 
    isErrorPage="false" autoFlush="true" session="true" import="java.util.Date" errorPage="error.jsp"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
int i1=Integer.parseInt(request.getParameter("n1"));
int i2=Integer.parseInt(request.getParameter("n2"));

int c=i1/i2;
out.println(c);
%>

</body>
</html>