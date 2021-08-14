<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
<link rel="stylesheet" href="static/jquery-dt/jquery-ui.css" />
  <script src="static/jquery-dt/jquery-1.9.1.js"></script>
  <script src="static/jquery-dt/jquery-ui.js"></script>

<style>
.err{
color:#F00;
}
</style>

  <script>
  $(function() {
    $( "#datepicker" ).datepicker({
    	changeMonth: true,
		changeYear: true,
		dateFormat: 'dd-M-yy'	
    });
  });
  </script>
</head>
<body>
<form:form action="doEmpReg3" modelAttribute="emp">
Gender <form:radiobutton path="gender" value="MALE"/>Male <form:radiobutton path="gender" value="FEMALE"/>Female
<br>
Emp ID <form:input type="text" path="empid" /><br>
Name <form:input type="text" path="name" /><br>
City
<form:select path="city.cityCode" items="${cts}" itemLabel="cityName" itemValue="cityCode"/>
<br>



Hobbies <form:checkboxes items="${hbs}" path="hobbies"/>


<form:select path="qualifications">
<form:options items="${quals}"/>
</form:select>
<br>
Salary <form:input path="salary"/>
${error }<br>
Join Date <form:input path="joinDate" id="datepicker"/>

<button type="submit">Submit</button>
</form:form>
</body>
</html>