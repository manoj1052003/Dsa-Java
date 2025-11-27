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
import jakarta.servlet.http.HttpSession;
@WebServlet("/resetPasswordServlet")
public class Reset extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		StudentDAO sdao = new StudentDAOimp();

		Student s = null;
		HttpSession session = req.getSession(false);
		
		Student user = (Student)session.getAttribute("user");

		long  phone = Long.parseLong(req.getParameter("phone"));
		String mail = req.getParameter("mail");
		String pass1 =  req.getParameter("password");
		String pass2 = req.getParameter("confirm_password");

		if(pass1.equals(pass2)) {
			s = sdao.getstudent(phone, mail);
			s.setPassword(pass2);
			if(sdao.updatestudent(s)) {
				req.setAttribute("reset_s", "password reset successfully");
				//req.setAttribute("Student", s);
				RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
				rd.forward(req, resp);
			}
		}
		else {

		}
	}

}
