<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="form1.jsp">
 Search Form <br><br>
roll no. : <input type="number" name="roll_no" value="${st.roll_no}"><br><br>
first name:  <input type="text" name="first_name" value="${st.first_name}"><br><br>
last name:  <input type="text" name="last_name" value="${st.last_name}"><br><br>
course: <input type="text" name="course" value="${st.course}"><br><br>
admission date (dd/MM/yyyy): <input type="text" name="adate1" value="${st.ad_date1}"> to <input type="text" name="adate2" value="${st.ad_date2}"><br><br>
age from: <input type="number" name="age1" value="${st.age1}"> to <input type="number" name="age2" value="${st.age2}"><br><br>
city : <input type="text" name="city" value="${st.city}"><br><br>
<input type="submit" name="search">


</form>
                                         

</body>
</html>