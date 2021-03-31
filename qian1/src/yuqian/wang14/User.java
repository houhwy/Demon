package yuqian.wang14;

public class User {
    private String name;
    private int money;

    public User(){}

    public User(String name,int money){
        this.money=money;
        this.name=name;
    }

    public void show() {
        System.out.println("我叫"+name+"我有"+money+"钱");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
