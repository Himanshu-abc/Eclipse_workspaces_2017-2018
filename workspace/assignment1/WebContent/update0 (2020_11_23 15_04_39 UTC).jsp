<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@page import="com.pp.bean.*" %>   
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="POST" action="update.jsp">
     <div align="center">
       <center>
       <font color="RED" size="6"> ${errMsg}</font>
       <table border="0" cellpadding="3" cellspacing="3" style="border-collapse: collapse" bordercolor="#111111" width="27%" id="AutoNumber1">
            <%int ide=Integer.parseInt(request.getParameter("id"));
             out.println("id:"+ide);
             session.setAttribute("id", ide);
            %> 
           
            <c:param name="id" value="${e.id}"></c:param>
           
           
                <tr>
           <td width="50%">Name</td>
           <td width="50%"><input type="text" name="name" size="20" value="${e.name}" ></td>
         </tr>
         <tr>
           <td width="50%">City</td>
           <td width="50%"><input type="text" name="city" size="20" value="${e.city}"></td>
         </tr>
         <tr>
           <td width="50%">Salary</td>
           <td width="50%"><input type="text" name="salary" size="20" value="${e.salary}"></td>
         </tr>
         <tr>
           <td width="50%">Email</td>
           <td width="50%"><input type="text" name="email" size="20" value="${e.email}"></td>
         </tr>
         <tr>
           <td width="50%"><input type="submit" value="Submit" name="B1"></td>
           <td width="50%">&nbsp;</td>
         </tr>
       </table>
       </center>
     </div>
     </form>

</body>
</html>