package collection03;

import java.util.Arrays;

public class Demo08 {
    public static void main(String[] args) {
        int[] arr = new int[]{2,4,5,8,6,1};
        //排序
        Arrays.sort(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+"\t");
        }

        System.out.println();

        //二分法找数字(返回下表)（先有序）
        int i1 = Arrays.binarySearch(arr, 5);
        System.out.println(i1);

        System.out.println();

        //数字全部填充为5
        Arrays.fill(arr,5);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+"\t");
        }

    }
}
