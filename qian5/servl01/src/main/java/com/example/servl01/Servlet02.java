package com.example.servl01;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Servlet02")
public class Servlet02 extends HttpServlet {
@Override

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String username = req.getParameter("username");
    System.out.println("02中查看"+username);

    Object key1 = req.getAttribute("key1");
    System.out.println("01是否有章");

    System.out.println("处理业务");

}
}
