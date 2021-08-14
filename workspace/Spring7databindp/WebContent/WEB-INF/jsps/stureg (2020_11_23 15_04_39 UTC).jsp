<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>   
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
<img src="static/sf-128.jpg" width="20%" height="20%"><br><br>
<form:form action="reg1" modelAttribute="stu">
Gender <form:radiobutton path="gender" value="MALE"/>Male<form:radiobutton path="gender" value="FEMALE"/>Female<br>
Roll No. <form:input type="text" path="roll"/><br>
Name <form:input type="text" path="name"/><br>
City <form:select path="city">
<form:options items="${city}"/>
</form:select> <br>
Course <form:select path="course.courseCode" items="${course}" itemLabel="courseName" itemValue="courseCode" >
</form:select>  <br>
</form:form>
</body>
</html>