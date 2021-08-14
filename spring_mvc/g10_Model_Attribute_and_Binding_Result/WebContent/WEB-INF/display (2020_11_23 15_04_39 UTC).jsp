<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student-Details</title>
</head>
<body>
<h1>${message}</h1>
<h2>${message2}</h2>
<table>
<tr> <td> name : </td> <td> ${student.name} </td> </tr>

<tr> <td> hobby : </td> <td> ${student.hobby} </td> </tr>

<tr> <td> mobile-number : </td> <td> ${student.mobileNumber} </td> </tr>

<tr> <td> DOB : </td> <td> ${student.DOB} </td>  </tr>

<tr>  <td> skills : </td> <td> ${student.skills} </td> </tr>

<tr> <td> Country : </td> <td> ${student.studentAddress.country} </td> </tr>

<tr> <td> City : </td> <td> ${student.studentAddress.city} </td> </tr>

<tr> <td> Street : </td> <td> ${student.studentAddress.street}</td> </tr>

<tr> <td> pinCode : </td> <td> ${student.studentAddress.pinCode} </td> </tr>
</table>
</body>
</html>