package gyb01.serives;

import gyb01.Dao.UseDao;
import gyb01.Dao.UseDaoimpl;

public class UseServies {

    private UseDao useDao;
    public void setUseDao(UseDao useDao){
        this.useDao=useDao;
    }

    public void add(){
        System.out.println("add.........");
        useDao.update();
    }

}
