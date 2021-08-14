<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <h1 align="center">Student Registration</h1>
  
    <form method="POST" action="reg2.jsp">
     <div align="center">
       <center>
       <font color="RED" size="6"> ${errMsg}</font>
       <table border="0" cellpadding="3" cellspacing="3" style="border-collapse: collapse" bordercolor="#111111" width="27%" id="AutoNumber1">
         <tr>
           <td width="50%">RollNO</td>
           <td width="50%"><input type="text" name="rollno" size="20" value="${st.roll_no}" ></td>
         </tr>
         <tr>
           <td width="50%">First Name</td>
           <td width="50%"><input type="text" name="fname" size="20" value="${st.first_name}" ></td>
         </tr>
         <tr>
           <td width="50%">last Name</td>
           <td width="50%"><input type="text" name="lname" size="20" value="${st.last_name}" ></td>
         </tr>
         <tr>
           <td width="50%">Course</td>
           <td width="50%"><input type="text" name="course" size="20" value="${st.course}" ></td>
         </tr>
         
         <tr>
           <td width="50%">Age</td>
           <td width="50%"><input type="text" name="age" size="20" value="${st.age}" ></td>
         </tr>
         
         <tr>
           <td width="50%">Admission Date(dd/MM/yyyy)</td>
           <td width="50%"><input type="text" name="saddate" size="20" value="${st.ad_date}" ></td>
         </tr>
         
          <tr>
           <td width="50%">City</td>
           <td width="50%"><input type="text" name="city" size="20" value="${st.city}"></td>
         </tr>
         
         <tr>
         
           <td width="50%"><input type="submit" value="Submit" name="B1"></td>
           <td width="50%">&nbsp;</td>
         </tr>
       </table>
       </center>
     </div>
     </form>

  <br>
<hr>
<br>
<%


%>
<a href="index.jsp">Home</a>

                          
</body>
</html>