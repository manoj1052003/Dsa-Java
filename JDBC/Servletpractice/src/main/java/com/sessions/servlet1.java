package com.sessions;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/login")
public class servlet1 extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession(true);
		
		session.setAttribute("name1", req.getParameter("input1"));
		session.setAttribute("name2", req.getParameter("input2"));
		
		PrintWriter out = resp.getWriter();
		
		out.println("<a href=\"servlet2\"> page 2 </a>");
		out.println("<a href=\"servlet3\"> page 3 </a>");
		out.println("<a href=\"logout\"> Log out </a>");
		
	}

}
