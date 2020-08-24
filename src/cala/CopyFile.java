package cala;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) {
        InputStream in = null;
        OutputStream out = null;


        try {
            in = new FileInputStream("d:/as.txt");
            out = new FileOutputStream("d:/s.txt");
            byte[] buf = new byte[10];
            int len = -1 ;
            while ( (len = in.read(buf))!=-1){
                out.write(buf,0,len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(out!=null) out.close();
                if(in!=null)in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


    }

}
