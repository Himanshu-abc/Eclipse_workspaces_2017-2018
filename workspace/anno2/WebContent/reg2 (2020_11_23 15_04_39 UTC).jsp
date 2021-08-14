<%@page import="com.anno.Students"%>
<%@page import="org.hibernate.Transaction"%>
<%@page import="org.hibernate.Session"%>
<%@page import="org.hibernate.cfg.AnnotationConfiguration"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page import="java.text.ParseException"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="stu" class="com.anno.Students"/>
<jsp:setProperty property="*" name="stu"/>
<%

int roll_no=Integer.parseInt(request.getParameter("rollno"));
String finame = request.getParameter("fname");
String laname= request.getParameter("lname");
String course = request.getParameter("course");
String city = request.getParameter("city");
int age=Integer.parseInt(request.getParameter("age"));

 Date addate=null; 

SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");

String sd = request.getParameter("saddate");
   
   
   addate=sdf.parse(sd);
   out.print("Ad Date"+addate);

   SessionFactory sf=new AnnotationConfiguration().configure().buildSessionFactory();

	Session sess=sf.openSession();
	
	Students st = new Students();
	
	st.setRoll_no(roll_no);
	st.setFirst_name(finame);
	st.setLast_name(laname);
	st.setCourse(course);
	st.setCity(city);
	st.setAge(age);
	st.setAd_date(addate);
	
	Transaction tx=sess.beginTransaction();
	sess.save(st);
	tx.commit();
	sf.close();
	sess.close();
	
	
	
	
%>
</body>
</html>