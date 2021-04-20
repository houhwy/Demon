package IOC.gyb01.serives;

import IOC.gyb01.Dao.UseDao;

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
