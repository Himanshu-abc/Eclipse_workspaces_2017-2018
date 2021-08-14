<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Fom</title>
</head>
<body>
<h1>${message1}</h1>
<h2>${message2}</h2>

<form action="/g7_Model_Attribute_On_Argument/StudentDetail.html" method="post">

Enter name : <input type="text" name="name"><br><br>

Enter Hobby : <input type="text" name="hobby"><br><br>

<input type="submit" value="save Details"><br>
<input type="reset" value="re-enter"><br>

</form>
</body>
</html>