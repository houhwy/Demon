package Demon03Doudizhu;

import java.util.*;

public class Pai {
    public static void main(String[] args) {
        Collection<String> HuaSe = new ArrayList<>();
        HuaSe.add("黑桃");
        HuaSe.add("方块");
        HuaSe.add("红桃");
        HuaSe.add("梅花");

        Collection<Integer> Number = new ArrayList<>();
        for (int i = 1; i <= 13; i++) {
            Number.add(i);
        }

        Collection<String> Pai = new ArrayList<>();

        Iterator<String> a = HuaSe.iterator();
        Iterator<Integer> b = Number.iterator();

        for (String s : HuaSe) {
            for (Integer s1 : Number) {
                Pai.add(s + s1);
            }
        }
        Pai.add("**");
        Pai.add("*");
//        Iterator<String> c = Pai.iterator();
//        for (String s :Pai) {
//            System.out.println(s);
//        }
        Collections.shuffle((List<String>) Pai);
//        System.out.println(Pai);
        ArrayList<String> play1 = new ArrayList<>();
        ArrayList<String> play2 = new ArrayList<>();
        ArrayList<String> play3 = new ArrayList<>();
        ArrayList<String> Dizhu = new ArrayList<>();
        for (int i = 0; i < Pai.size(); i++) {
            String p = ((ArrayList<String>) Pai).get(i);
            if (i >= 51) {
                Dizhu.add(p);
            }
            if (i < 51) {
                if (i % 3 == 0) {
                    play1.add(p);
                }
                if (i % 3 == 1) {
                    play2.add(p);
                }
                if (i % 3 == 2) {
                    play3.add(p);
                }

            }
        }

        //看牌
        System.out.print("玩家1:");
        for (String s : play1) {
            System.out.print(s);
        }
        System.out.println();
        System.out.print("玩家2:");
        for (String s : play2) {
            System.out.print(s);
        }
        System.out.println();
        System.out.print("玩家3:");
        for (String s : play3) {
            System.out.print(s);
        }
        System.out.println();
        System.out.print("底牌:");
        for (String s : Dizhu) {
            System.out.print(s);
        }
        System.out.println();


    }


}
