

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.employee.EmpDao;

@WebServlet("/DeleteEmployee")
public class DeleteEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		try {
			
			int id=Integer.parseInt(request.getParameter("id"));
			
			EmpDao ed=new EmpDao();
			int status=ed.deleteEmployee(id);
			
			if(status>0) {
				response.sendRedirect("ViewEmployees");
			}
			
			else {
				out.println("an error occured");
			}
			
		}catch (Exception e) {
			System.out.println(e);
		}
	}

}
