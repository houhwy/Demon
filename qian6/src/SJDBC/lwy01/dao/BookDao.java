package SJDBC.lwy01.dao;

import AOP.aopxml.Book;
import SJDBC.lwy01.entity.User;

public interface BookDao {
    void add(User user);
    void update(User user);
    void del(User user);
}
