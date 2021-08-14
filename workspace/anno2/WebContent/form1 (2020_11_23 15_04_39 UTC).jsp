<%@page import="org.hibernate.criterion.Restrictions"%>
<%@page import="java.util.List"%>
<%@page import="com.anno.Students"%>
<%@page import="org.hibernate.Criteria"%>
<%@page import="org.hibernate.Session"%>
<%@page import="org.hibernate.cfg.AnnotationConfiguration"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%-- <jsp:useBean id="stu" class="com.anno.Students"/>
 <jsp:setProperty property="*" name="stu"/> --%>
<%

String first_name = request.getParameter("first_name");
String last_name= request.getParameter("last_name");
String course = request.getParameter("course");
String city = request.getParameter("city");

SessionFactory sf=new AnnotationConfiguration().configure().buildSessionFactory();
Session sess= sf.openSession();
Criteria crt=sess.createCriteria(Students.class);
Students st=new Students();

String s=request.getParameter("roll_no");
if(s!=null && s.length()>0){
	 int roll = Integer.parseInt(s);
	crt.add(Restrictions.eq("roll_no",roll) );  }


if(first_name!=null && first_name.length()>0)
	crt.add(Restrictions.eq("first_name", first_name));

if(last_name !=null && last_name.length()>0)
	crt.add(Restrictions.eq("last_name", last_name));

if(course !=null && course.length()>0)
	crt.add(Restrictions.eq("course", course));

if(city!=null && city.length()>0)
	crt.add(Restrictions.eq("city", city));


String adate1 = request.getParameter("adate1");
String adate2 = request.getParameter("adate2");

if(adate1!=null &&  adate1.length()>0  && adate2!=null && adate2.length()>0 ){
	
	Date ada=null;
	Date adb=null;
	SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
	try{
	ada=sdf.parse(adate1);
	out.println(ada);
	adb=sdf.parse(adate2);
	out.println(adb);
	}
	catch(Exception e){  
		out.println(e); }

	crt.add(Restrictions.between("ad_date", ada, adb));	
}

  String a1=request.getParameter("age1");
  String a2=request.getParameter("age2");

 if(a1!=null && a1.length()>0 && a2!=null && a2.length()>0){
    
	 int agee1=Integer.parseInt(a1);
	 int agee2=Integer.parseInt(a2);
	 
	crt.add(Restrictions.between("age", agee1, agee2)); 
 }
 List <Students> list= crt.list();
request.setAttribute("stlist",list); 
%>
 <c:if test="${not empty stlist}" >
  <table border="1">
  <tr>
	
	<th>Sr.no</th>
	<th>roll no.</th>
	<th>first name</th>
	<th>last name</th>
	<th>course</th>
	<th>Admission date</th>
	<th>age</th>
	<th>city</th>
	</tr>
	<c:forEach var="st" items="${stlist}" varStatus="s">
	<tr>
	     <td>${s.count }</td>
	    <td>${st.roll_no }</td>
		<td>${st.first_name}</td>
		<td>${st.last_name}</td>
		<td>${st.course}</td>
		<td>${st.ad_date}</td>
		<td>${st.age}</td>
		<td>${st.city}</td>
	
</tr>
</c:forEach>
</table>
</c:if>
<c:if test="${empty stlist}">
No Data Found
</c:if>

<% 
sess.close();
sf.close(); 
%>
</body>
</html>