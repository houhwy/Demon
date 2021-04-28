package com.example.servl01;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Paramater extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
//        String hobby = req.getParameter("hobby");
        String[] hobby = req.getParameterValues("hobby");
        System.out.println("用户名"+username);
        System.out.println("密码"+password);
        System.out.println("兴趣爱好"+ Arrays.asList(hobby));
    }
}
