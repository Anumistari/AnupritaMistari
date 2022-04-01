package com.test;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("username");
	System.out.println("USERNAME"+ name);
	String pass=request.getParameter("password");
			System.out.println("PASSWORD"+pass);
			if ("velocity".equals(name) && "pune".equals(pass)) {
				System.out.println("you have entered correct credentials...");
				request.setAttribute("data", name);//here we are sending name to success.jsp page
			RequestDispatcher rd=request.getRequestDispatcher("Success.jsp");
			rd.forward(request, response);
			}else {
				System.out.println("invalid username and password");
				RequestDispatcher rd=request.getRequestDispatcher("Failure.jsp");	
						rd.forward(request, response);
				
			}
	}

}
