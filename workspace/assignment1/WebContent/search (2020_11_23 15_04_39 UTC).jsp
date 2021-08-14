<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="search1.jsp" > <div align="center">
<table align="center"> 
<tr> <td>select field :</td>
<td><select name="field">
<option value="id">id</option>
<option value="name">name</option>
<option value="city">city</option>
<option value="salary">salary</option>
<option value="email">email</option>
</select>
</td>

<tr> <td>Enter Value :</td>
<td><input type="text" name="value"/></td></tr>

<tr><td> Condition :</td>
<td><select name="condition">
<option value="="> =(equal to) </option>
<option value="<"> <(less than) </option>
<option value=">"> >(greater than)  </option>
<option value=">="> >=(greater than equal to) </option>
<option value="<="> <=(les than equal to) </option>
</select>
</td>
</tr>
</table>
<input type="submit" value="search" />
</form>



</body>
</html>