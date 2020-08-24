package collection02;

import collection01.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class CollectionTest {
    public static void main(String[] args) {
        //    Collection coll = new Collections();//接口不能被实例化
        //add(Object a ):向集合中增加一个元素
        Collection coll = new ArrayList();
        coll.add("a");
        coll.add("b");
        coll.add("c");
        System.out.println(coll);//重写了toString方法.要不然直接打印内存地址了

        coll.clear();//clear:清楚集合中所有的元素
        System.out.println(coll);

        //增加对象
        Student stu1 = new Student();
        stu1.setName("张三");
        stu1.setAge(23);
        Student stu2 = new Student();
        stu2.setName("李四");
        stu2.setAge(24);
        Student stu3 = new Student();
        stu3.setName("王五");
        stu3.setAge(15);
        coll.add(stu1);
        coll.add(stu2);
        coll.add(stu3);
//重写Student中的toString方法
        System.out.println(coll);

        //求集合中真实数据的个数:size()
        System.out.println(coll.size());
        //此时,coll已经有3个元素

        //创建一个新集合
        Collection col2 = new ArrayList();
        col2.add("a");
        col2.add("b");
        col2.add("c");
        //此时,col2已经有3个元素

        //addAll:可以将一个集合中的全部元素增加到另一个集合之中
        coll.addAll(col2) ;
        System.out.println(coll);

        //判断集合是否包含了指定的对象(元素)
        boolean flag = coll.contains("a");
        System.out.println(flag);
        //-------
        boolean flag1 = coll.contains(stu1);
        System.out.println(flag1);

        //containsAll:判断集合是否包含了另一个集合

        boolean flag2= coll.containsAll(col2);
        System.out.println(flag2);


        //isEmpty();判断集合是否为空
        System.out.println("coll是否为空"+coll.isEmpty());
        coll.clear();
        System.out.println("coll是否为空"+coll.isEmpty());

        //iterator():迭代器
        System.out.println("col2:"+col2);
        Iterator iter  = col2.iterator();
      //  iter.hasNext();//判断集合是否有下一个元素
        while(iter.hasNext()){
            //接收类型为Object强制转换成String
            String reault = (String)iter.next();//取出下一个元素
            System.out.println(reault);

        }



       //remove:可以删除集合之中指定的对象
        col2.remove("b");
        System.out.println(col2);


        System.out.println("coll"+coll);
        System.out.println("col2"+col2);

        coll.add("a");
        coll.add("b");
        coll.add("c");

        /*
        System.out.println("coll"+coll);
        System.out.println("col2"+col2);
        //removeAll:从一个集合之中删除另一个集合中包含的元素
        coll.removeAll(col2);
        System.out.println("coll"+coll);
        System.out.println("col2"+col2);
         */


        //retainAll:与removeAll是相反操作,从一个集合之中只保留另一个集合的所有元素
        System.out.println("coll"+coll);
        System.out.println("col2"+col2);
        coll.retainAll(col2);
        System.out.println("coll"+coll);
        System.out.println("col2"+col2);


        //toArray():将集合转换为数组(Obiect[]);
        Object[] col1Array = coll.toArray();
        System.out.println(col1Array[0]);
        System.out.println(col1Array[1]);
    }

}
