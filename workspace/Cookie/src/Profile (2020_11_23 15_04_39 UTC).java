import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Profile")
public class Profile extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
	
	response.setContentType("text/html");
	PrintWriter pr=response.getWriter();
	
	request.getRequestDispatcher("link.html").include(request, response);
	
	Cookie ck[]=request.getCookies();
	
	if(ck!=null) {
		for(Cookie c : ck) {
			if(c.getValue()!=null || c.getValue()!="") {
				
				pr.println("welcome "+c.getValue());
			}
		}
	}
	else {
		pr.println("you are not logged in get yourself logged");
		request.getRequestDispatcher("login.html").include(request, response);
	}
	}
}
