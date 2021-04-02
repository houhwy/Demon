package yuqian.wang08;

public class Body {

    public class Heart {     //成员内部类
        public void beat() {
            System.out.println("心脏跳动");
        }
    }

    private String name;

    public void methodBody() {
        System.out.println("外部类方法");
        new Heart().beat();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
