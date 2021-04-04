package Net.TCP2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpS {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("C:\\Users\\guoyubo\\Desktop\\新建文件夹\\1.jpg");

        ServerSocket server = new ServerSocket(6524);
        Socket socket = server.accept();
        InputStream is = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = is.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
        }
        OutputStream os = socket.getOutputStream();
        os.write("上传成功".getBytes());
        server.close();
        socket.close();
        fos.close();
    }
}
