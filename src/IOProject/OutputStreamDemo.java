package IOProject;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamDemo {
    public static void main(String[] args) {
        OutputStream out = null;
        try {
           out = new FileOutputStream("d:/xyz.txt");
            try {
                //内存-->往xvy.txt输出
                //getBytes()方法把字符串转成字节
                out.write("sdwrerewrwe231".getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
