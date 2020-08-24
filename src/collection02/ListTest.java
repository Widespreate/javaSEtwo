package collection02;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List list1 = new ArrayList();
        list1.add("a");
        list1.add("b");
        list1.add("c");
        System.out.println(list1);
        list1.add("d");
        System.out.println(list1);
        //List接口中,有一个重载的add()方法,可以将增加的元素指定到某一个具体的位置
        list1.add(1,"e");
        System.out.println(list1);

        List list2 = new ArrayList();
        list2.add("1");
        list2.add("2");
        list1.addAll(2,list2);
        System.out.println(list1);

        Object o = list1.get(2);
        System.out.println(o);

        //可以获取到某一个指定对象(元素)在集合之中的位置
        int e = list1.indexOf("e");
        System.out.println(e);

        list1.add("e");
        System.out.println(list1);
        int e1 = list1.lastIndexOf("e");
        System.out.println(e1);

        //remove();可以删除第一次出现的自定对象
        list1.remove("a");
        System.out.println(list1);
        list1.remove("e");
        System.out.println(list1);
        //可以删除指定索引位置对象(元素)通过索引删除(重载方法)(因为list集合是有序的)
        list1.remove(1);
        System.out.println(list1);

        //将指定位置的元素(对象)修改成新的
        list1.set(3,"中");
        System.out.println(list1);

        //类似subString(),截取List集合,左闭右开
        List list = list1.subList(2, 4);
        System.out.println(list);


    }
}
