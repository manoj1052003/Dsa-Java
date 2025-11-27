package com.student.servlet;

import java.io.IOException;

import com.student.dao.StudentDAO;
import com.student.dao.StudentDAOimp;
import com.student.dto.Student;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/DeleteUser")
public class DeleteUser extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");

        Student s = new Student();
        s.setName(name);

        StudentDAO sdao = new StudentDAOimp();
        boolean isDeleted = sdao.deletestudent(s);

        if (isDeleted) {
            HttpSession session = req.getSession(false);
            if (session != null) {
                session.setAttribute("message", "Student deleted successfully!");
            }
            resp.sendRedirect("viewuser.jsp");
        } else {
            resp.getWriter().println("Failed to delete user.");
        }
    } 
}


