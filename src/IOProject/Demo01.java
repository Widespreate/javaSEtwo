package IOProject;

import java.io.File;
import java.io.IOException;

public class Demo01 {
    public static void main(String[] args) {
        //file:文件、目录、不存在的文件或者目录
        File file = new File("d:/abc.txt");

        System.out.println("相对路径"+file.getPath());
        System.out.println("绝对路径"+file.getAbsolutePath());
        System.out.println("文件名称"+file.getName());
        System.out.println("文件的大小"+file.length());//单位字节


        System.out.println( file.isFile()==true? "文件":"非文件");
        System.out.println( file.isDirectory()==true? "目录":"非目录");




        if(file.exists()){
           // 彻底删除（不过回收站）
            file.delete();
            System.out.println("删除成功");
        }else{
            try {
                file.createNewFile();
                System.out.println("创建成功");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
