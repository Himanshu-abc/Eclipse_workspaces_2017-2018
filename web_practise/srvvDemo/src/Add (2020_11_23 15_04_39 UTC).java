import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Add")
public class Add extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	public void goPost(HttpServletRequest request,HttpServletResponse response) {
    	
    	try {
    	int n1=Integer.parseInt(request.getParameter("num1"));
    	int n2=Integer.parseInt(request.getParameter("num2"));
    	
    	int k=n1+n2;
    	
		PrintWriter out=response.getWriter();
		
		out.println(k);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
}
