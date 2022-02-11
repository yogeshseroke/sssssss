

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Contact
 */
@WebServlet("/Contact")
public class Contact extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void proccessRequest(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException
	{
		try(PrintWriter out=response.getWriter())
		{
			 response.setContentType("text/html;charset=UTF-8");
			 out.println("<!DOCTYPE html>");
	            out.println("<html>");
	            out.println("<head>");
	             out.println("<link href='Style.css' type='text/css' rel='stylesheet' />");
	             
	            out.println("<title>Servlet Home</title>");
	         
	            out.println("</head>");
	            out.println("<body>");
	            out.print("<header>");
	            out.printf("<a href='Home'>Home</a> <a href='About'>About</a> <a href='Services'>Services</a> <a href='Gallery'>Gallery</a> <a href='Contact'>Contact Us</a>");
	            out.print("</header>");
	            out.print("<section>");
	            out.print("<center><h1>Welcome in Contact us Page</h1></center><hr>");
	            out.print("<center><img src='indore.jpg' width='300' height='300'></center><hr>");
	            out.print("</section>");
	            out.print("<footer>");
	            out.println("<a href='Home'>Home</a> <a href='About'>About</a> <a href='Service'>Services</a> <a href='Gallery'>Gallery</a> <a href='Contact'>Contact Us</a>");
	            out.print("</footer>");
	            out.println("</body>");
	            out.println("</html>");
		}
	}
	
	
	
	
    public Contact() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());

		proccessRequest(request, response);
	}

	




	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		proccessRequest(request, response);
	}

}
