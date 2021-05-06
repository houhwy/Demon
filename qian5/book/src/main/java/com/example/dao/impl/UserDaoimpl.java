package com.example.dao.impl;

import com.example.dao.UserDao;
import com.example.pojo.User;

public class UserDaoimpl extends BaseDao implements UserDao {
    @Override
    public User userByUsername(String username) {
        String sql="select id,username,password,email from t_user where username=?";
        return queryForOne(User.class, sql, username);
    }

    @Override
    public User userByUsernameAndpassword(String username, String password) {
        String sql="select id,username,password,email from t_user where username=? and password=?";
        return  queryForOne(User.class, sql, username,password);
    }

    @Override
    public int saveUser(User user) {
        String sql="INSERT INTO t_user(`username`,`password`,`email`) VALUES(?,?,?)";
        return update(sql,user.getUsername(),user.getPassword(),user.getEmail());
    }
}
