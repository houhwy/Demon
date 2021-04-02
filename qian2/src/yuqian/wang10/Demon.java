package yuqian.wang10;

public class Demon {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("亚瑟");
        hero.setAge(18);
        Woopen woopen = new Woopen("黑切");
        hero.setWoopen(woopen);
        Skill skil = new Skill() {
            @Override
            public void use() {
                System.out.print("王者审判");
            }
        };
        hero.setSkill(skil);

        hero.atack();
    }
}
