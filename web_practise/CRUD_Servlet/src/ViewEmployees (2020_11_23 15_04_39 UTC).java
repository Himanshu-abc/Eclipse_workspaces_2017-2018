import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.app.employee.EmpDao;
import com.app.employee.Employee;

@WebServlet("/ViewEmployees")
public class ViewEmployees extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.println("<a href='index.html'>Add New Employee</a><br>");
	    out.println("<h1>Employee Records</h1>");
		
		try {
			EmpDao ed=new EmpDao();
		     List<Employee> l=ed.getEmployees();
		     Iterator<Employee> it=l.iterator();
		     
		   out.print("<table border='1' width='100%'>");
		   out.print("<tr><th>Id</th><th>Name</th><th>Password</th><th>Email</th><th>country</th><th>Edit</th>"
		    	 		+ "<th>Delete</th></tr>");
		    	 
		   while(it.hasNext()) {
			   Employee e=it.next();
		   out.print("<tr><td>"+e.getId()+"</td><td>"+e.getName()+"</td><td>"+e.getPassword()+"</td><td>"+e.getEmail()+"</td>"
		    	 		+ "<td>"+e.getCountry()+"</td><td><a href='UpdateEmployee?id="+e.getId()+"'>Update</td>"
		    	 				+ "<td><a href='DeleteEmployee?id="+e.getId()+"'>Delete</td></tr>");
		     }
		    out.print("</table>");
		}catch (Exception ex) {
			System.out.println(ex);
		}
	}
}
