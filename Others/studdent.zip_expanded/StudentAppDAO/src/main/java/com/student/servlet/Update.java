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
@WebServlet("/updateAccountServlet")
public class Update extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session = req.getSession(false);
		StudentDAO sdao = new StudentDAOimp();

		Student s = (Student) session.getAttribute("user");
		
		s.setName(req.getParameter("name"));
		s.setPhone(Long.parseLong(req.getParameter("phone")));
		s.setMail(req.getParameter("mail"));
		s.setBranch(req.getParameter("branch"));
		s.setLoc(req.getParameter("location"));
		
		if(sdao.updatestudent(s)) {
			req.setAttribute("success_u", "updated successfully");
			RequestDispatcher rd = req.getRequestDispatcher("Dashboard.jsp");
            rd.forward(req, resp);
		}
		else {
			req.setAttribute("fail_u", "failed to update!");
			RequestDispatcher rd = req.getRequestDispatcher("Dashboard.jsp");
            rd.forward(req, resp);
		}

	}

}
