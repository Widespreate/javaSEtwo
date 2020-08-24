package IOProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class IoInputStream {
    public static void main(String[] args) {
        InputStream in = null;
        try {
          in =  new FileInputStream(new File("d:/abc.txt"));
            //文件的大小in.available()
            System.out.println(in.available());

            byte[] buf = new byte[in.available()];
            //将文件内容读取到buf
           in.read(buf);
            //buf.byte[]-->String
            //字节数组转换成字符串
            System.out.println( new String(buf));
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
