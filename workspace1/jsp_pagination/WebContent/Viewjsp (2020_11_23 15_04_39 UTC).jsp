<%@page import="jsp_pagination.Employee"%>
<%@page import="java.util.List"%>
<%@page import="jsp_pagination.EmployeeDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%   int pageid=Integer.parseInt(request.getParameter("page"));
      
     int total=5;
     
     if(pageid==1) {}
     
     else{
    	pageid=pageid-1;
    	pageid=(pageid*total)+1;
     }
     
     List<Employee> li=EmployeeDao.fetch(pageid, total);
      
     out.println("records are :<br>");
     
     out.print("<table border='1' width='60%' > ");
     
     out.print("<tr><th>id</th><th>name</th><th>alary</th></tr>");
     
    for(Employee e:li){
    out.print("<tr><td>"+e.getId()+"</td>  <td>"+e.getName()+"</td> <td>"+e.getSalary()+"</td> </tr>");
    }
     
    out.print("</table>");
    
    if(li.isEmpty()){
   	 out.println("sorry no more records");
    }
    
    out.print("<a href='Viewjsp.jsp?page=1'> 1 Page </a>");
    out.print("<a href='Viewjsp.jsp?page=2'> 2 Page </a>");
    out.print("<a href='Viewjsp.jsp?page=3'> 3 Page </a>");
    out.print("<a href='Viewjsp.jsp?page=4'> 4 Page </a>");
%>
</body>
</html>