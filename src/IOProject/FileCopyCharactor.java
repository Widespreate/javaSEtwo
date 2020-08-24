package IOProject;

import java.io.*;

public class FileCopyCharactor {
    public static void main(String[] args) {
        //文件->内存
        Reader reader =null;
        Writer writer =null;
        try {
           reader = new FileReader("d:/说明.txt");
           writer = new FileWriter("d:/说明完.txt");
            char[] buf = new char[4];
            StringBuffer sb = new StringBuffer();
            int len = -1 ;
            while((len = reader.read(buf))!=-1){
                sb.append(buf,0,len);//将欸此读取到的字符 拼接起来
                //String不适合拼接字符串所以用StringBuffer
            }
            System.out.println(sb);

            //在内存中替换占位符
            String content = sb.toString();
            //StringSuffer中没有单个替换的replace,所以在转转换成String进行操作
            content = content.replace("{name}", "赵鑫阳")
           .replace("{age}","22").replace("{address}","黑龙江");
            //链式写法
            //将替换后的内容 输出到文件  内存->文件
            writer.write(content);
            System.out.println("输出成功");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(writer!= null) writer.close();
                if(reader!= null) reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
