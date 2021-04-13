package gyb03.servies;

import gyb03.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service(value = "userService")

public class UserService {
//    @Autowired
//    @Qualifier(value = "aaa")
    @Resource(name = "aaa")
    private UserDao userDao;
    public void add(){
        System.out.println("add。。。。。");
        userDao.add();
    }
}
