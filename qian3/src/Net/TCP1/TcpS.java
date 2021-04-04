package Net.TCP1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpS {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(6524);
        Socket socket = server.accept();
        InputStream is = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println(new String(bytes, 0, len));
        OutputStream os = socket.getOutputStream();
        os.write("收到谢谢".getBytes());
        server.close();
        socket.close();
    }
}
