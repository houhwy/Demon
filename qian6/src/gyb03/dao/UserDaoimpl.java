package gyb03.dao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository(value = "aaa")

public class UserDaoimpl implements UserDao{
    @Override
    public void add() {
        System.out.println("dao add.........");
    }
}
