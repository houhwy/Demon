package bean;

public class Orders {
    private String oname;

    public void setOname(String oname) {
        this.oname = oname;
        System.out.println("调用set方法设置属性值");
    }

    public Orders(){
        System.out.println("执行无参构造，创建bean实例");
    }

    public void initMethod(){
        System.out.println("执行初始化方法");
    }

    public void destroyMethod(){
        System.out.println("执行销毁方法");
    }
}
