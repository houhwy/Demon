package Demon06IO.Demon01Output;

import java.io.FileOutputStream;
import java.io.IOException;

public class Output {
    public static void main(String[] args) throws IOException {
        a();
    }

    public static void a() throws IOException {
        FileOutputStream f = new FileOutputStream("C:\\资料\\1自学\\Daima\\a.txt");
        f.write(97);
        f.close();

    }

    public static void b() throws IOException {
        FileOutputStream f = new FileOutputStream("C:\\资料\\1自学\\Daima\\a.txt");
        byte[] bytes = {65, 66, 67};
        f.write(bytes);
        f.write(bytes, 1, 2);
        f.close();

    }

    public static void c() throws IOException {
        FileOutputStream f = new FileOutputStream("C:\\资料\\1自学\\Daima\\a.txt");
        byte[] bytes = "雯雯".getBytes();
        f.write(bytes);
        f.close();

    }

    //换行为/r/n f.write("/r/n".getBytes())
}
