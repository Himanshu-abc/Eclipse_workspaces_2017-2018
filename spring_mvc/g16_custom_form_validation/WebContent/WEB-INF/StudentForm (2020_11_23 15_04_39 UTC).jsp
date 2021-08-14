<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@  taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">${message}</h1>
<h2 align="center">${message1}</h2>

<form:errors path="student.*"></form:errors>

<form action="/g16_custom_form_validation/StudentDetail.html" method="post">
<table align="center" width="30%" border="1">

<tr><td>Enter name :</td> <td> <input type="text" name="name"><td></tr>

<tr><td>Enter hobby :</td> <td><input type="text" name="hobby"><td></tr>

<tr><td>Enter Mobile-number :</td> <td><input type="text" name="mobileNumber"></td></tr>

<tr><td>Enter Date-Of-Birth : </td> <td><input type="text" name="DOB"></td></tr>

<tr><td>Select Skills :</td> <td> <select name="skills" multiple>
<option value="c">c</option>
<option value="c++">c++</option>
<option value="java">java</option>
<option value="php">php</option>
<option value="python">python</option>
</select> </td> </tr>

</table>

<table align="center" width="30%" border="1">
<tr> <td> Enter Country : </td> <td> <input type="text" name="studentAddress.country">  </td> </tr>
<tr> <td> Enter City : </td> <td> <input type="text" name="studentAddress.city"> </td> </tr>
<tr> <td> Enter Street : </td> <td> <input type="text" name="studentAddress.street"> </td> </tr>
<tr> <td> Enter pinCode : </td> <td> <input type="text" name="studentAddress.pinCode"> </td> </tr>

<tr><td><input type="submit" value="submitDetails"><td></tr>
<tr><td><input type="reset" value="re-enter"><td></tr>
</table>

</form>
</body>
</html>