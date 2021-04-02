package yuqian.wang10;

public class Hero {
    private String name;
    private int age;
    private Woopen woopen;
    private Skill skill;

    public Hero() {
    }

    public void atack() {
        System.out.print(name + "已经" + age + "岁了，使用武器" + woopen.getName() + "使用技能");
        skill.use();
        System.out.println("进行攻击");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Woopen getWoopen() {
        return woopen;
    }

    public void setWoopen(Woopen woopen) {
        this.woopen = woopen;
    }

    public Skill getSkill(Skill skill) {
        return this.skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public Hero(String name, int age, Woopen woopen, Skill skill) {
        this.name = name;
        this.age = age;
        this.woopen = woopen;
        this.skill = skill;
    }

}
