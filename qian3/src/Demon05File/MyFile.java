package Demon05File;

import java.io.File;

public class MyFile {
    public static void main(String[] args) {
        show1();
        show2("C:", "\\a.txt");
        show3();
    }

    public static void show1() {
        File file1 = new File("c:\\a.txt");
        System.out.println(file1);
    }

    public static void show2(String parents, String child) {
        File file1 = new File(parents, child);
        System.out.println(file1);
    }

    public static void show3() {
        File file1 = new File("c:");
        File file2 = new File(file1, "//a.txt");
        System.out.println(file2);
    }
}
