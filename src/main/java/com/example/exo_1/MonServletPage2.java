package com.example.demo_jee_01;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "monServletPage2JSP", value = "/monservlet-page02")
public class MonServletPage2 extends HttpServlet {

    private String prenom;
    @Override
    public void init() throws ServletException {
        prenom = "Marie";
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("prenomA", prenom);

        getServletContext().getRequestDispatcher("/page-02.jsp").forward(req, resp);
    }
}
