package collection03;

import java.util.*;

public class Demo06 {
    public static void main(String[] args) {
        Map<String,Person> map = new HashMap<>();
        Person per01 = new Person("zs",23,"西安");
        Person per02 = new Person("ls",23,"北京");
        Person per03 = new Person("ww",25,"上海");
        Person per04 = new Person("zl",24,"天津");
        Person per05 = new Person("sq",27,"深圳");

        //key 名字  ,value：人
        map.put("zs",per01);
        map.put("ls",per02);
        map.put("ww",per03);
        map.put("zl",per04);
        map.put("sq",per05);

        System.out.println("请输入人的名字");
        Scanner input = new Scanner(System.in) ;
        String name = input.next();

        Person person = map.get(name);
        System.out.println(person);

        //如果对象不是Null，在打印时会调用toString.如果是null则不会调用toString

//        Set<String> names = map.keySet();
//        //在Names中找name
//        for(String n:names){
//            if(n.equals(name)){
//                Person person = map.get(n);
//                System.out.println(person);
//            }
//        }

    }
}
