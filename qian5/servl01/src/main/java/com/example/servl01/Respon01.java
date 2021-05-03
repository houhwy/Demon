package com.example.servl01;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Respon01 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        System.out.println("我轻轻的来，不带走一片云彩");
//        request.setAttribute("key01","value");
//        response.setStatus(302);
//        response.setHeader("Location","http://localhost:8080/servl01_war_exploded/res2");

        response.sendRedirect("http://localhost:8080/servl01_war_exploded/res2");
    }
}
