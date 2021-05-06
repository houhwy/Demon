package com.example.dao;

import com.example.pojo.User;

public interface UserDao {
    public Object userByUsername(String username);
    public User userByUsernameAndpassword(String username,String password);
    public int saveUser(User user);


}
