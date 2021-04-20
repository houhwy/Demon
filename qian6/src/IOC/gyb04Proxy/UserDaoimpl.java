package IOC.gyb04Proxy;

public class UserDaoimpl implements UserDao{

    @Override
    public int sum(int a, int b) {
        System.out.println("sum方法执行了");
        return a+b;
    }

    @Override
    public String update(String name) {
        return name;
    }
}