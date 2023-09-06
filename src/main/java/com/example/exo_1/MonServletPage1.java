package com.example.demo_jee_01;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "monServletJSP", value = "/page01")
public class MonServletPage1 extends HttpServlet {

    private String prenom;
    @Override
    public void init() throws ServletException {
        prenom = "Julien";
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("prenomA", prenom);

        getServletContext().getRequestDispatcher("/page-01.jsp").forward(req, resp);
    }
}
