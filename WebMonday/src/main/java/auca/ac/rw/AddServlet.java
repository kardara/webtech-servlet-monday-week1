package auca.ac.rw;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpResponse;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/add")
public class AddServlet extends HttpServlet 

{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException 
	{
		int num1=Integer.parseInt(req.getParameter("num1"));
		int num2=Integer.parseInt(req.getParameter("num2"));
		int num3=Integer.parseInt(req.getParameter("num3"));
		
		int result = num1 + num2 + num3;
		
		String oddEvent= (result%2==0) ? "even" : "odd";
		
		PrintWriter out=res.getWriter();
		
		req.setAttribute("result", result);
		
		RequestDispatcher rd=req.getRequestDispatcher("sqr");
		rd.forward(req, res);
			
	}

}
