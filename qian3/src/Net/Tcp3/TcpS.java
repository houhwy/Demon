package Net.Tcp3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class TcpS {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(6524);
        while (true) {
            Socket socket = server.accept();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        //为了防止文件重名
                        //              自定义            毫秒值              随机数                              后缀名
                        String filename = "鱼" + System.currentTimeMillis() + new Random().nextInt(999999) + ".jpg";
                        FileOutputStream fos = new FileOutputStream("C:\\Users\\guoyubo\\Desktop\\新建文件夹\\" + filename);
                        InputStream is = socket.getInputStream();
                        byte[] bytes = new byte[1024];
                        int len = 0;
                        while ((len = is.read(bytes)) != -1) {
                            fos.write(bytes, 0, len);
                        }
                        OutputStream os = socket.getOutputStream();
                        os.write("上传成功".getBytes());
                        socket.close();
                        fos.close();
                    } catch (IOException e) {
                        System.out.println(e);
                    }
                }
            }).start();

        }
    }
}
