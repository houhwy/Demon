package com.example.servl;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ContestS extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//1.获取上下文参数
        ServletContext servletContext = getServletConfig().getServletContext();

        String username = servletContext.getInitParameter("username");

        System.out.println(username);

        System.out.println(servletContext.getInitParameter("password"));
//2.获取当前工程路径
        System.out.println(servletContext.getContextPath());
//3.获取工程部署后在服务器硬盘上的绝对路径
        System.out.println("工程部署路径:"+servletContext.getRealPath("/"));
        System.out.println("工程部署后CSS的路径:"+servletContext.getRealPath("/css"));
        System.out.println("工程部署后img下的1.jpg的路径:"+servletContext.getRealPath("/img/1.jpg"));


    }
}
