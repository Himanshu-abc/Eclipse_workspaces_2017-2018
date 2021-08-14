<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student-Form</title>
</head>
<body>
<h1>${message}</h1>

<form action="/g8_Model_Attribute_on_Method/StudentDetails.html" method="post">

Enter name : <input type="text" name="name"><br><br>

Enter hobby : <input type="text" name="hobby"><br><br>

<input type="submit" value="saveDetails"><br>
<input type="reset" value="re-enter"><br>
</form>
</body>
</html>