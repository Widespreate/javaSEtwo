package cala;

import java.util.Scanner;
public class Main01 {
    public static void main(String[] args){
        int ri, repeat;
        int x, sum;
        Scanner in=new Scanner(System.in);
        repeat=in.nextInt();
        for(ri=1; ri<=repeat; ri++){
            sum = 0 ;
            x=in.nextInt();
            while(x>0){
                sum+=x;
            }
            System.out.println(sum);
        }
    }
}