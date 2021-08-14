<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%-- <%@ page errorPage="error.jsp" %> --%>
<%@ page isThreadSafe="true" %>
<%@ page buffer="8kb" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="obj" class="dumy.Employee"  scope="session"  type="dumy.Employee"></jsp:useBean>

<jsp:setProperty property="id" name="obj" value='<%=Integer.parseInt(request.getParameter("id"))%>'/>

<jsp:setProperty property="name" name="obj" value='<%=request.getParameter("name")%>'/>

<jsp:setProperty property="age" name="obj" value='<%=Integer.parseInt(request.getParameter("age")) %>'/>

<jsp:forward page="three.jsp"></jsp:forward>



</body>
</html>