package Net.Tcp3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TcpC {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("192.168.56.1", 6524);
        OutputStream os = socket.getOutputStream();

        FileInputStream fi = new FileInputStream("C:\\资料\\1自学\\Daima\\1.jpg");
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = fi.read(bytes)) != -1) {
            os.write(bytes, 0, len);
        }
        socket.shutdownOutput();

        InputStream is = socket.getInputStream();
        int len1 = is.read(bytes);
        System.out.println(new String(bytes, 0, len1));

        socket.close();
        fi.close();
    }
}
