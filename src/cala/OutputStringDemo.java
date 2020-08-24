package cala;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStringDemo {
    public static void main(String[] args) {
        OutputStream out = null;
        try {
             out = new FileOutputStream("d:/as.txt");
            out.write("sdafsafsa".getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
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
