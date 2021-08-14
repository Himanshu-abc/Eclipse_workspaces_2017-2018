import java.io.IOException;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Second")
public class Second extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		String str=request.getParameter("name");
		
	   ServletContext ctx=request.getServletContext();
	   
	   String name=ctx.getInitParameter("name");
	   String mobile=ctx.getInitParameter("mobile");
		
		System.out.println(name);
		System.out.println(mobile);
	}
}
