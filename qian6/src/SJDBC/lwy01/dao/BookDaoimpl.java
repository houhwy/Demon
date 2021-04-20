package SJDBC.lwy01.dao;

import AOP.aopxml.Book;
import SJDBC.lwy01.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoimpl implements BookDao{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void add(User user) {
        String sql ="insert into Stu value(?,?,?)";
        Object[] arg={user.getUserId(),user.getUsername(),user.getUstatus()};
        int update=jdbcTemplate.update(sql,arg);
        System.out.println(update);
    }

    @Override
    public void update(User user) {
        String sql ="update Stu set username=?,ustatus=? where user_id=?";
        Object[] arg={user.getUsername(),user.getUstatus(),user.getUserId()};
        int update=jdbcTemplate.update(sql,arg);
        System.out.println(update);
    }

    @Override
    public void del(User user) {
        String sql ="delete from Stu where user_id=?";
        Object[] arg={user.getUserId()};
        int update=jdbcTemplate.update(sql,arg);
        System.out.println(update);
    }
}
