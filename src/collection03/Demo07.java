package collection03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Demo07 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("e");
        list.add("w");
        list.add("v");
        list.add("s");
        //字典顺序排序
        Collections.sort(list);
        System.out.println(list);
        //获取集合最大值、最小值
        String max = Collections.max(list);
        System.out.println(max);
        String min = Collections.min(list);
        System.out.println(min);
        //二分查询(在list中找v的索引)（使用前，必须保证集合元素是自然有序的，sort）
        int v = Collections.binarySearch(list, "v");
        System.out.println(v);
        //混洗，打乱已有顺序
        Collections.shuffle(list);
        //反转、倒序
        Collections.reverse(list);
        //换顺序
        Collections.swap(list,2,3);
        //替换
        Collections.replaceAll(list, "a", "A");
        //将所有元素全部填充
        Collections.fill(list,"H");

    }
}
