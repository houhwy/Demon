package Demon06IO.Demon03Copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//C:\Users\guoyubo\Pictures\Screenshots
public class Copyjpg {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("C:\\资料\\1自学\\Daima\\1.jpg");
        FileInputStream fis = new FileInputStream("C:\\Users\\guoyubo\\Pictures\\Screenshots\\4.jpg");
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
        }
        fis.close();
        fos.close();
    }
}
