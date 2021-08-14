import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.employee.EmpDao;
import com.app.employee.Employee;

@WebServlet("/UpdateEmployee2")
public class UpdateEmployee2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	int status=0;	
	try {
			
	int id=Integer.parseInt(request.getParameter("id"));
	String name=request.getParameter("name");
	String password=request.getParameter("password");
	String email=request.getParameter("email");
	String country=request.getParameter("country");
	
	Employee ee=new Employee();
	
	ee.setId(id);
	ee.setName(name);
	ee.setPassword(password);
	ee.setEmail(email);
	ee.setCountry(country);
	
	EmpDao ed=new EmpDao();
	
	status=ed.updateEmployee(ee);
	
	if(status>0) {
		response.sendRedirect("ViewEmployees");	
		}
	else {
		out.println("sorry unable to print record");
	}
		}catch (Exception e) {
			System.out.println(e);
		}
	}
}