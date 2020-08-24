package collection03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Demo02 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("hello");
        list.add("world");
        list.addLast("wh");
        list.addFirst("hw");


        System.out.println(list);
    }
}
