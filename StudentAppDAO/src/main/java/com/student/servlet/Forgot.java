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

@WebServlet("/reset-password-action")
public class Forgot extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Student s = new Student();
		StudentDAO sdao = new StudentDAOimp();
		//PrintWriter out = resp.getWriter();

		String mail = req.getParameter("mail");
		long phone = Long.parseLong(req.getParameter("phone"));
		String pass1 = req.getParameter("new-password");
		String pass2 = req.getParameter("confirm-password");

		System.out.println(mail);
		System.out.println(phone);

		s =sdao.getstudent(phone, mail);
		System.out.println(s);
		if(pass1.equals(pass2)) {
			s.setPassword(pass2);
			boolean res = sdao.updatestudent(s);
			if(res) {
				//out.println("password updated succerssfully");
				req.setAttribute("success_1", "updated successfully");
				RequestDispatcher rd = req.getRequestDispatcher("Login.jsp");
				rd.forward(req, resp);
			}
			else {
				//out.println("failed to update");
				req.setAttribute("error_f2", "failed to update");
				RequestDispatcher rd = req.getRequestDispatcher("forget.jsp");
				rd.forward(req, resp);
			}

		}
		else {
			//out.println("new password and confirm password missmatch");
			req.setAttribute("error_f3", "password missmatch");
			RequestDispatcher rd = req.getRequestDispatcher("forget.jsp");
			rd.forward(req, resp);
		}


	}

}
