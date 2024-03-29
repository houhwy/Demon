package com.example.web;

import com.example.pojo.User;
import com.example.service.UserService;
import com.example.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    private UserService userService=new UserServiceImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username=req.getParameter("username");
        String password = req.getParameter("password");
        User user=new User();
        user.setUsername(username);
        user.setPassword(password);
        if (userService.login(user)==null){
            System.out.println("用户名或密码错误");
            req.getRequestDispatcher("pages/user/login.html").forward(req,resp);
        }else {
            req.getRequestDispatcher("pages/user/login_success.html").forward(req,resp);
        }
    }
}
