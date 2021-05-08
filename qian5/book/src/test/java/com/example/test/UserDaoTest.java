package com.example.test;

import com.example.dao.UserDao;
import com.example.dao.impl.UserDaoimpl;
import com.example.pojo.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserDaoTest {
    UserDao userDao=new UserDaoimpl();
    @Test
    void userByUsername() {
        if (userDao.userByUsername("admin")==null){
            System.out.println("用户名可用");
        }else {
            System.out.println("用户已存在");
        };
    }

    @Test
    void userByUsernameAndpassword() {
        if (userDao.userByUsernameAndpassword("admin","admin")==null){
            System.out.println("用户名或密码错误");
        }else {
            System.out.println("登陆成功");
        }
    }

    @Test
    void saveUser() {
        System.out.println(userDao.saveUser(new User(null,"wyq","123456","25838@qq.com")));
    }
}