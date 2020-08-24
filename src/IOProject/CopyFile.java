package IOProject;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) {
        InputStream in = null;
        OutputStream out = null;
        try {
            in = new FileInputStream("d:/1.jpg");
            out = new FileOutputStream("d:/wpsyun/2.jpg");
            byte[] buf = new byte[10];
            int len = -1;
            while ((len = in.read(buf)) != -1) {
                    out.write(buf,0,len);
                }
            System.out.println("复制成功");
            }

         catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (out != null) out.close();
                if (in != null) in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
