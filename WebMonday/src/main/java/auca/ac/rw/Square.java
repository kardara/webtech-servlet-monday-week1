package auca.ac.rw;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Square extends HttpServlet 

{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException 
	{
		PrintWriter out=res.getWriter();
		
		int zak=(int) req.getAttribute("result");
		
		zak*=zak;
		
		out.println("<h1> Oh, now I know why you called me, here is the sqaure of your result: "+zak+"</h1>");
	}

}


