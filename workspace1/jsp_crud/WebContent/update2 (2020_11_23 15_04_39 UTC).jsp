<%@page import="com.app.dao.EmployeeDao"%>
<%@page import="com.app.bean.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="ob" class="com.app.bean.Employee" scope="page" type="com.app.bean.Employee"></jsp:useBean>

<jsp:setProperty property="*" name="ob"/>

<%
int s=EmployeeDao.update(ob);

if(s>0){
	out.println("successfully updated");
}
%>

<jsp:include page="Viewall.jsp"></jsp:include>

</body>
</html>