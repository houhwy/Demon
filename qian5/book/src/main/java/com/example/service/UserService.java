package com.example.service;

import com.example.pojo.User;

public interface UserService {
    public void registUser(User user);




    public User login(User user);
/*
*检查用户名是否可用
* @param username
* @return true用户存在 false用户名可用
 */
    public boolean existsUsername(String username);

}
