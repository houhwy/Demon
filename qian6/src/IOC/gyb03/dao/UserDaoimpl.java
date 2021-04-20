package IOC.gyb03.dao;

import org.springframework.stereotype.Repository;

@Repository(value = "aaa")

public class UserDaoimpl implements UserDao{
    @Override
    public void add() {
        System.out.println("dao add.........");
    }
}
