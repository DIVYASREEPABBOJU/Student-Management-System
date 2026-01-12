package com.student.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.student.db.DBConn;

@WebServlet("/UpdateStudentServlet")
public class UpdateStudentServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws IOException {

        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String course = req.getParameter("course");
        int year = Integer.parseInt(req.getParameter("year"));

        try {
            Connection con = DBConn.getConnection();
            PreparedStatement ps = con.prepareStatement(
                "UPDATE students SET name=?, email=?, course=?, year=? WHERE student_id=?"
            );

            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, course);
            ps.setInt(4, year);
            ps.setInt(5, id);

            ps.executeUpdate();
            res.sendRedirect("adminDashboard.jsp");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

