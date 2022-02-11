

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class About
 */
@WebServlet("/About")
public class About extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void processRequest(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException 
	{
	    try(PrintWriter out=response.getWriter()){	
		out.println("<html>");
		
		out.println("<head>");
		 out.println("<link href='Style.css' type='text/css' rel='stylesheet' >");
		 out.println("<title>Servlet Home</title>");
		 out.println("</head>");
		
		out.println("<body>");
		
		out.println("<header>");
		out.print("<a href='Home'>Home</a> <a href='About'>About</a> <a href='Services'>Services</a> <a href='Services'>Services</a> <a href='Contact'>Contact Us</a>");
		out.println("</header>");
		
		out.println("<section>");
		 out.print("<center><h1>Welcome in About us Page</h1></center><hr>");
		 out.print("<center><img src='indore.jpg' width='300' height='300'></center><hr>");
		out.println("</section>");
		
		out.println("<footer>");
		out.println("<a href='Home'>Home</a> <a href='About'>About</a> <a href='Service'>Services</a> <a href='Gallery'>Gallery</a> <a href='Contact'>Contact Us</a>");
		out.println("</footer>");
		
		out.println("</body>");
		
		out.println("</html>");
	}
	}
    public About() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());

		processRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		processRequest(request, response);
	}

}
