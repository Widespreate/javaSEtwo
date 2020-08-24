package ex;

public class DeMO03 {
    public static void main(String[] args) {

        int age = 122; //年龄不能大于120岁

        if (age <= 0 || age > 120) {
            try {
                //手工声明
                throw new MyException("年龄不能大于120");
            } catch (MyException e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
            }
        }
    }
}
