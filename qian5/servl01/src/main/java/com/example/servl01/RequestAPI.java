package com.example.servl01;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RequestAPI extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("uri="+req.getRequestURI());
        System.out.println("url="+req.getRequestURL());
        System.out.println("客户端IP地址-->"+req.getRemoteHost());
        System.out.println("请求头user-Agent-->"+req.getHeader("User-Agent"));
    }
}