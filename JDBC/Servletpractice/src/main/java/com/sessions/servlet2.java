package com.sessions;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/servlet2")
public class servlet2 extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);
		
		if(session!=null) {
			String name1 = (String)session.getAttribute("name1");
			String name2 = (String)session.getAttribute("name2");
			
			PrintWriter out = resp.getWriter();
			
			out.println("<h1>"+name1 + " " + name2 + " "+ req.getRequestedSessionId());
		}
		else {
			resp.sendRedirect("servlet1.jsp");
		}
		
	}

}
