import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.employee.EmpDao;
import com.app.employee.Employee;


@WebServlet("/AddEmployee")
public class AddEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		try {
			
			String name=request.getParameter("name");
			String password=request.getParameter("pass");
			String email=request.getParameter("email");
			String country=request.getParameter("country");
			
			Employee ee=new Employee();
			ee.setName(name);
			ee.setPassword(password);
			ee.setEmail(email);
			ee.setCountry(country);
			
			EmpDao ed=new EmpDao();
			int status=ed.addEmployee(ee);
			
			if(status>0) {
				out.println("record successfully saved");
				request.getRequestDispatcher("index.html").include(request, response);
			}
			else {
				out.println("an error occured please try again");
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
