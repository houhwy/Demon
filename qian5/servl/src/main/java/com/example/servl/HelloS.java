package com.example.servl;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.lang.reflect.Method;

public class HelloS implements Servlet {

    public HelloS(){
        System.out.println("构造器方法");
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init初始化");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
//        System.out.println("啊~被访问了");
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        String Method=httpServletRequest.getMethod();
//        System.out.println(Method);
        if("GET".equals(Method)){
            System.out.println("get请求");
        }
        else if("POST".equals(Method)){
            System.out.println("post请求");
        }
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("销毁方法");
    }
}
