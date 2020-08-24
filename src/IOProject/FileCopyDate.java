package IOProject;

import java.io.*;
//二进制流
public class FileCopyDate {
    //abc.txt->内存->xyz.txt
    public static void main(String[] args) {
        InputStream in = null ;
        OutputStream out = null ;
        InputStream dataInput = null;
        OutputStream dataOutput = null;
        try {
            //abc.txt->内存A
            in = new FileInputStream("d:/abc.txt") ;
            //字节流转二进制流
           dataInput = new DataInputStream(in) ;
            out = new FileOutputStream("d:/xyz.txt") ;
            dataOutput = new DataOutputStream(out);
            
            //开辟10字节的内存
            byte []buf = new byte[10] ;
            int len = -1 ;
            while(   (len= dataInput.read(buf)) != -1){//in ->buf
                //  (len= in.read(buf)) != -1这里搞错了很要命
                dataOutput.write(buf,0,len);//buf->out
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(dataOutput !=null)dataOutput.close();
                if(dataInput !=null)dataInput.close();
                if(out !=null)out.close();
                if(in !=null) in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}