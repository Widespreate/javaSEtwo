package collection03;

import javax.xml.transform.Source;
import java.util.*;

public class Demo05 {
    public static void main(String[] args) {
        //单值
        // List<String> list = new ArrayList<String>();
        List<String> list = new ArrayList<>();   // 和上面的等价/1.7之后提供的类型推断
        list.add("a");
        String s = list.get(0);
        System.out.println(s);

        //双值
        //k(学号)  ，v(名次)
        Map<String,Integer> map = new HashMap<>();
        map.put("s01",3);
        map.put("s02",1);
        map.put("s03",2);

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for(Map.Entry<String, Integer> o:entries){
            System.out.println(o.getKey());
            System.out.println(o.getValue());
        }

        //迭代器方式
        //取key
        Set<String> keys = map.keySet();
        Iterator<String> iterator = keys.iterator();
        while(iterator.hasNext()){
            String key = iterator.next();
            Integer value = map.get(key);
            System.out.println(key+"--"+value);
        }
    }
}
