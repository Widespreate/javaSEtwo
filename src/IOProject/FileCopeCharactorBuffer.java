
package IOProject;
import java.io.*;

public class FileCopeCharactorBuffer {
    public static void main(String[] args) {
        //文件->内存
        Reader reader =null;
        Writer writer =null;
        BufferedReader br = null ;
        BufferedWriter bw = null ;
        try {
            reader = new FileReader("d:/说明.txt");
            writer = new FileWriter("d:/说明完.txt");

           br = new BufferedReader(reader);
           bw  = new BufferedWriter(writer);

            StringBuffer sb = new StringBuffer();
            String line = null;

            while( (line= br.readLine()) != null){
                sb.append(line);
            }
            System.out.println(sb);
            //在内存中替换占位符
            String content = sb.toString();
            //StringSuffer中没有单个替换的replace,所以在转转换成String进行操作
            content = content.replace("{name}", "赵鑫阳")
                    .replace("{age}","22").replace("{address}","黑龙江");
            //链式写法
            //将替换后的内容 输出到文件  内存->文件
            bw.write(content);
            System.out.println("输出成功");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(bw!= null) bw.close();
                if(br!= null) br.close();
                if(writer!= null) writer.close();
                if(reader!= null) reader.close();
            } catch (IOException e) {
                e.printStackTrace();

            }
        }
    }
}
