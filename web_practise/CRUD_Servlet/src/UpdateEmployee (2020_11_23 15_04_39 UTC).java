import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.app.employee.EmpDao;
import com.app.employee.Employee;

@WebServlet("/UpdateEmployee")
public class UpdateEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		try {
			int id=Integer.parseInt(request.getParameter("id"));
			
			EmpDao ed=new EmpDao();
			Employee ee=ed.getById(id);
			out.println("<h1> Update employee Record </h1>");
			
			out.print("<form action='UpdateEmployee2' method='post'>");
			out.print("<table>");
			out.print("<tr><td> </td><td><input type='hidden' name='id' value='"+ee.getId()+"'></td></tr>");
			out.print("<tr><td>Name</td><td><input type='text' name='name' value='"+ee.getName()+"'></td></tr>");
			out.print("<tr><td>Password</td><td><input type='password' name='password' value='"+ee.getPassword()+"'></td></tr>");
			out.print("<tr><td>Email</td><td><input type='email' name='email' value='"+ee.getEmail()+"'></td></tr>");
			out.print("<tr><td>Country</td><td>");
			out.print("<select name='country'style='width:150px'>");
			out.print("<option>USA</option>");
			out.print("<option>UK</option>");
			out.print("<option>India</option>");
			out.print("<option>Canada</option>");
			out.print("<option>China</option>");
			out.print("<option>Russia</option>");
            out.print("<option>Other</option>");
			out.print("</select></td></tr>");
			out.print("<tr><td> </td><td><input type='submit' value='edit&save'</td></tr>");
			out.print("</table>");
			out.print("</form>");
			out.close();
			
		}catch (Exception e) {
			System.out.println(e);
		}
	}
}