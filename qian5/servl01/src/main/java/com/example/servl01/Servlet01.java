package com.example.servl01;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Servlet01")
public class Servlet01 extends HttpServlet {
@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String username = req.getParameter("username");
    System.out.println("01中查看"+username);
    req.setAttribute("key","01的章");
    RequestDispatcher requestDispatcher = req.getRequestDispatcher("/s02");
    requestDispatcher.forward(req,resp);
}
}
