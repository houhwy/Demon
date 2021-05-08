package com.example.service.impl;

import com.example.dao.UserDao;
import com.example.dao.impl.UserDaoimpl;
import com.example.pojo.User;
import com.example.service.UserService;

import java.util.function.UnaryOperator;

public class UserServiceImpl implements UserService {
    UserDao userDao = new UserDaoimpl();

    @Override
    public void registUser(User user) {
        userDao.saveUser(user);
    }

    @Override
    public User login(User user) {
        return userDao.userByUsernameAndpassword(user.getUsername(),user.getPassword());
    }

    @Override
    public boolean existsUsername(String username) {
        if(userDao.userByUsername(username)==null){
            return false;
        }
        return true;
    }
}
