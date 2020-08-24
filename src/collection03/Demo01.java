package collection03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Demo01 {
    public static void main(String[] args) {
        Collection list = new ArrayList();
        list.add("中国");
        list.add("俄罗斯");
        list.add("美国");
        System.out.println(list);
        Collection set = new HashSet();
        set.add("中国");
        set.add("俄罗斯");
        set.add("美国");
        System.out.println(set);
    }
}
