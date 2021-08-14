
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="org.hibernate.Transaction"%>
<%@page import="com.pp.bean.Employee"%>
<%@page import="org.hibernate.Session"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page import="org.hibernate.cfg.Configuration"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body> 

<jsp:useBean id="emp" class="com.pp.bean.Employee"/>
 <jsp:setProperty property="*" name="emp"/>
 
 <% 
Configuration cfg=new Configuration();
 
    cfg.configure();
	SessionFactory sf = cfg.buildSessionFactory();
	Session hsession=sf.openSession();
	Employee e=new Employee();
	e.setId(emp.getId());
	e.setName(emp.getName());
	e.setCity(emp.getCity());
	e.setSalary(emp.getSalary());
	e.setEmail(emp.getEmail());
	Transaction tx=hsession.beginTransaction();
	
	hsession.save(e);
	
	
	tx.commit();
	hsession.close();
	sf.close();
	System.out.println("Done");
	response.sendRedirect("index.jsp");
	%>

</body>
</html>