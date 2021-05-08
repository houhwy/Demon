package com.example.test;

import com.example.pojo.User;
import com.example.service.UserService;
import com.example.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceImplTest {

    UserService userService = new UserServiceImpl();
    @Test
    void registUser() {
        userService.registUser(new User(null,"hy","jinniu","4216262@qq.com"));
    }

    @Test
    void login() {
        System.out.println(userService.login(new User(null,"hy","jinniu","4216262@qq.com")));
    }

    @Test
    void existsUsername() {
        System.out.println(userService.existsUsername("hy"));
    }
}