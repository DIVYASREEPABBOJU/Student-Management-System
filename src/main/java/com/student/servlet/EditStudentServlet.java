package com.student.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.student.db.DBConn;

@WebServlet("/EditStudentServlet")
public class EditStudentServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws IOException {

        int id = Integer.parseInt(req.getParameter("id"));

        try {
            Connection con = DBConn.getConnection();
            PreparedStatement ps = con.prepareStatement(
                "SELECT * FROM students WHERE student_id=?"
            );
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                req.setAttribute("id", rs.getInt("student_id"));
                req.setAttribute("name", rs.getString("name"));
                req.setAttribute("email", rs.getString("email"));
                req.setAttribute("course", rs.getString("course"));
                req.setAttribute("year", rs.getInt("year"));

                req.getRequestDispatcher("editStudent.jsp")
                   .forward(req, res);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

