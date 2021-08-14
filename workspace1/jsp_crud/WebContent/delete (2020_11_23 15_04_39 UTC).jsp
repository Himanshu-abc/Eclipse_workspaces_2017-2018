<%@page import="com.app.dao.EmployeeDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String name=request.getParameter("name");
out.println(name);

int s=EmployeeDao.delete(name);
if(s>0){
	out.println("successfully removed !");
}
else{
	out.println("error");
}
%>

<jsp:include page="Viewall.jsp"></jsp:include>

</body>
</html>