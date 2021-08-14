package byHimanshu;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet2")
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		long t1=System.currentTimeMillis();
		
		ServletContext sc2=getServletContext();
		List<User> li= (List<User>) sc2.getAttribute("data");
		
		Iterator<User> it=li.iterator();
		while (it.hasNext()) {
			User u=it.next();
			out.println(u.getId()+" "+u.getName()+" "+u.getPassword());
		}
		long t2=System.currentTimeMillis();
	
	    long t3=t2-t1;
	    
	    out.println("total time taken "+t3);
	}
	
}