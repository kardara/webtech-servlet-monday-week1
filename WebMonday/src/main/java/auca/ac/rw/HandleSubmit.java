package auca.ac.rw;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HandleSubmit extends HttpServlet 

{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException 
	{
		String fName = req.getParameter("fName");
		String lName = req.getParameter("lName");
		
		PrintWriter out=res.getWriter();
		
		out.println("<h1>Hello " +fName+ " " +lName+"</h1>");
	}
}
