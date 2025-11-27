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

@WebServlet("/Login")
public class Login extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
        rd.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        StudentDAO sdao = new StudentDAOimp();
        String mail = req.getParameter("mail");
        String password = req.getParameter("password");

        if (mail == null || password == null || mail.isEmpty() || password.isEmpty()) {
            req.setAttribute("error_l", "Email and Password are required!");
            RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
            rd.forward(req, resp);
            return;
        }

        Student s = sdao.getstudent(mail, password);

        if (s != null) {
//            req.setAttribute("success_l", "Welcome back: " + s.getName());
//            req.setAttribute("Student", s);
//            RequestDispatcher rd = req.getRequestDispatcher("Dashboard.jsp");
//            rd.forward(req, resp);
        	HttpSession session = req.getSession();
        	session.setAttribute("user", s);
        	resp.sendRedirect("Dashboard.jsp");

        	
        } else {
            req.setAttribute("error_l", "Invalid credentials!");
            RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
            rd.forward(req, resp);
        }
    }
}

