<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>form</title>
</head>
<body>
${message1}
<form action="/ps3/formSubmit.html" method="post">

name : <input type="text" name="name"><br><br>

age : <input type="text" name="age"><br><br>


<input type="submit" value="send">
</form>
</body>
</html>