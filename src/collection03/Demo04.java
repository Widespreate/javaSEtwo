package collection03;

import java.util.*;

public class Demo04 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        for (Object lists:list) {
            System.out.println(lists);
        }



        Set set = new HashSet();
        set.add("AA");
        set.add("BB");
        set.add("CC");

        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println( iterator.next());
        }

        Map map = new HashMap();
        map.put("s01","zs");
        map.put("s02","ls");
        map.put("s03","ww");


        Set entries = map.entrySet();

       for(Object e :entries){
           Map.Entry et = (Map.Entry)e;
           Object k = et.getKey();
           Object v = et.getValue();
           System.out.println("k-"+k);
           System.out.println("v-"+v);
       }


//        Set set1 = map.keySet();
//        for(Object set2:set1){
//            System.out.println(set2);
//        }
//        Collection values = map.values();
//        Iterator iterator1 = values.iterator();
//        while(iterator1.hasNext()){
//            System.out.println(iterator1.next());
//        }



    }

}
