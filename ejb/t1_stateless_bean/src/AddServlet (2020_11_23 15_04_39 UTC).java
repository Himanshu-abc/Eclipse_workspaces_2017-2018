import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.AddEjbBean;

@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	@EJB
	AddEjbBean ab;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
    PrintWriter out=response.getWriter();
	
	int i=Integer.parseInt(request.getParameter("t1"));	
	int j=Integer.parseInt(request.getParameter("t2"));
	
	ab.setI(i);
	ab.setJ(j);
	
	ab.add();
	int k=ab.getK();
	
	out.println("Addition using EJB bean is : " +k);
	}
}