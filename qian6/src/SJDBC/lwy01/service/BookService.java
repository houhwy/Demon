package SJDBC.lwy01.service;

import AOP.aopxml.Book;
import SJDBC.lwy01.dao.BookDao;
import SJDBC.lwy01.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    private BookDao bookDao;

    public void addBook(User user){
        bookDao.add(user);
    }
    public void updateBook(User user){
        bookDao.update(user);
    }
    public void delBook(User user){
        bookDao.del(user);
    }


}
