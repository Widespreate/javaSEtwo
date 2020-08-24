//package cala;
//
//
//
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args){
//        int ri, repeat;
//        float rate, salary, tax;
//        Scanner in=new Scanner(System.in);
//        repeat=in.nextInt();
//        for(ri=1; ri<=repeat; ri++){
//            salary=in.nextFloat();
//            if( salary <= 850){
//               tax= salary;
//            }else if ( 850.0f <salary<=1350.0f){
//                rate = 0.05f;
//                tax = rate * (salary-850);
//            }else if (){
//                rate = 0.05f;
//                tax = rate * (salary-850);
//            }else if (){
//                rate = 0.05f;
//                tax = rate * (salary-850);
//            }else if(){
//                rate = 0.05f;
//                tax = rate * (salary-850);
//            }
//
//            System.out.println("tax="+(int)(tax*100+0.5)/100.0);
//        }
//    }
////    输入一个正整数repeat (0<repeat<10)，做repeat次下列运算：
////    输入一个职工的月薪salary，输出应交的个人所得税tax。
////    tax = rate * (salary-850)
////    当 salary <= 850 时，rate = 0%;
////    当 850 < salary <= 1350 时，rate = 5%;
////    当 1350 < salary <= 2850 时，rate = 10%;
////    当 2850 < salary <= 5850 时，rate = 15%;
////    当 5850 < salary 时，rate = 20%;
//}
//
