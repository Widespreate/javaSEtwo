package collection03;

import javax.xml.transform.Source;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Demo03 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("s01","张三");//key:学号, value:姓名
        map.put("s02","李四");//key:学号, value:姓名
        map.put("s03","王五");//key:学号, value:姓名
        System.out.println(map);

        Object v = map.get("s01");//根据key找value
        System.out.println(v);

        int size = map.size();
        System.out.println(size);//元素的个数

        boolean s01 = map.containsKey("s01");
        System.out.println(s01);//判断是否包含了指定的key

        //keySet方法将Map转为单值集合
        //转为只包含Key的单值集合
        Set set = map.keySet();//为什么是set不是list?因为map中key是唯一的
        System.out.println(set);
        //转化为只包含value的单值集合
        //values方法转换单值valuse
        Collection values = map.values();
        System.out.println(values);

        map.remove("s01");//删除,通过学号/删除成功返回值,就是删除的value对象,删除没成功不提示
        System.out.println(map);

    }
}
