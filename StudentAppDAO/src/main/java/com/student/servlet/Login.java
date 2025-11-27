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


@WebServlet("/Login")
public class Login extends HttpServlet {
    @Override
    protected void doPost (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        StudentDAO sdao = new StudentDAOimp();
        Student s = null;

        String mail = req.getParameter("mail");
        String password = req.getParameter("password");

        s = sdao.getstudent(mail, password);

        if (s != null) {
            req.setAttribute("success_l", "Welcome back:");
            req.setAttribute("Student", s);
            RequestDispatcher rd = req.getRequestDispatcher("Dashboard.jsp");
            rd.forward(req, resp);
        } else {
            req.setAttribute("error_l", "Invalid credentials");
            RequestDispatcher rd = req.getRequestDispatcher("Login.jsp");
            rd.forward(req, resp);
        }
    }
}
