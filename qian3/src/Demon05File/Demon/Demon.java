package Demon05File.Demon;

import java.io.File;

public class Demon {
    public static void main(String[] args) {
        show01();
        show02();
        show03();
        show04();
    }

    public static void show01() {
        File file1 = new File("C:\\资料\\1自学\\Daima\\11.jpg");
        String abs = file1.getAbsolutePath(); //获取绝对路径
        System.out.println(abs);

        File file2 = new File("11.jpg");
        String abso = file2.getAbsolutePath(); //绝对路径
        System.out.println(abso);
    }

    public static void show02() {
        File file1 = new File("C:\\资料\\1自学\\Daima\\11.jpg");
        String abs = file1.getPath(); //是什么就是什么
        System.out.println(abs);

        File file2 = new File("11.jpg");
        String abso = file2.getPath();
        System.out.println(abso);
    }

    public static void show03() {
        File file1 = new File("C:\\资料\\1自学\\Daima\\11.jpg");
        String abs = file1.getName();   //获取末尾文件名
        System.out.println(abs);
        File file2 = new File("C:\\资料\\1自学\\Daima");
        String abso = file2.getName();
        System.out.println(abso);
    }

    public static void show04() {
        File file1 = new File("C:\\资料\\1自学\\Daima\\11.jpg");
        long len = file1.length();  //获取文件字节数
        System.out.println(len);
        File file2 = new File("C:\\Users\\guoyubo\\Pictures\\Screenshots");
        long le2 = file2.length();
        System.out.println(le2);
    }
}
