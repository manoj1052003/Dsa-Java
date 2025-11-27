package com.student.servlet;

import java.io.IOException;

import com.student.dao.StudentDAO;
import com.student.dao.StudentDAOimp;
import com.student.dto.Student;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/signup1")
public class Signup extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//PrintWriter out = resp.getWriter();
		StudentDAO sdao = new StudentDAOimp();
		// TODO Auto-generated method stub
		Student s = new Student();
		s.setName(req.getParameter("name"));
		s.setPhone(Long.parseLong(req.getParameter("phone")));
		s.setMail(req.getParameter("mail"));
		s.setBranch(req.getParameter("branch"));
		s.setLoc(req.getParameter("location"));
		s.setPassword(req.getParameter("password"));

		boolean res = sdao.insertstudent(s);

		if(res) {
			//out.println("added successfully");
			req.setAttribute("success", "Data Saves Successfully");
			RequestDispatcher rd = req.getRequestDispatcher("Login.jsp");
			rd.forward(req, resp);
		}
		else {
			//out.println("not added");
			req.setAttribute("error", "Failed To Add The Data");
			RequestDispatcher rd = req.getRequestDispatcher("Signup.jsp");
			rd.forward(req, resp);
		}


	}
}
