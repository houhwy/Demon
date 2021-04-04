package Demon05File.Fileter;

import java.io.File;
import java.util.Locale;

public class Demon {
    public static void main(String[] args) {
        File file = new File("C:\\资料\\1自学\\Daima");
        getFile(file);
    }

    public static void getFile(File dir) {
        File[] files = dir.listFiles(pathname -> pathname.isDirectory() || pathname.getName().toLowerCase(Locale.ROOT).endsWith(".java"));
        for (File f : files) {
            if (f.isDirectory()) {
                getFile(f);
            } else {
                System.out.println(f);
            }
        }
    }
}
