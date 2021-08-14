import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.Employee.EmpDao;
import com.app.Employee.Employee;

@WebServlet("/ViewServlet")
public class ViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String spageid=request.getParameter("page");
		int pageid=Integer.parseInt(spageid);
		int total=5;
		
		out.println(pageid);
		
		if(pageid==1) {}
		else {
			pageid=pageid-1;
			pageid=pageid*total+1;
		}
		
		EmpDao ed=new EmpDao();
		List<Employee> l=ed.getEmplpoyees(pageid,total);
		
		out.print("<table border='1' cellpadding='4' width='60%' >");
		out.print("<tr><th>Id</th><th>Name</th><th>Salary</th></tr>");
		
		for(Employee ee:l) {
			out.print("<tr><td>"+ee.getId()+"</td><td>"+ee.getName()+"</td><td>"+ee.getSalary()+"</td></tr>");
		}
		out.print("</table>");
		
		out.println("<a href=ViewServlet?page=1>page1</a>");
		out.println("<a href=ViewServlet?page=2>page2</a>");
		out.println("<a href=ViewServlet?page=3>page3</a>");
		out.println("<a href=ViewServlet?page=4>page4</a>");
		
		out.close();
	}
}
