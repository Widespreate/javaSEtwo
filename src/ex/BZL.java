package ex;

public class BZL {
    public static void main(String[] args) {
        int i = 10 ;
        Integer j = new Integer(20);
        i = j ;//Integer-->int    自动拆箱   intvalue
        j = i ;//int-->Integer    自动装箱   valueOf

        Integer i3 = 100;
        Integer i4 = 100;

        Integer i5 = 1000;
        Integer i6 = 1000;
        System.out.println(i3==i4);
        System.out.println(i5==i6);



    }
}
