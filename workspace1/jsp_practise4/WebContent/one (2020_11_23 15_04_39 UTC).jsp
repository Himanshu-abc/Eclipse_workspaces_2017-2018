<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> --%>
<%@page import="jsp_practise4.Employee"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="e1" class="jsp_practise4.Employee" scope="request" type="jsp_practise4.Employee">
</jsp:useBean>

<%-- <jsp:setProperty property="id" name="e1" value='<%= Integer.parseInt(request.getParameter("id")) %>'></jsp:setProperty>
<jsp:setProperty property="name" name="e1" value='<%=request.getParameter("name") %>'></jsp:setProperty> --%>

<jsp:setProperty property="*" name="e1"/>

<%
RequestDispatcher rd=request.getRequestDispatcher("two.jsp");
rd.forward(request,response);  %>

</body>
</html>