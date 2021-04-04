package Net.TCP1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TcpC {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("192.168.56.1", 6524);
        OutputStream os = socket.getOutputStream();
        os.write("你好，服务器".getBytes());
        InputStream is = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println(new String(bytes, 0, len));
        socket.close();
    }
}
