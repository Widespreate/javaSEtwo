package ex;

public class Demo01 {
    public static void main(String[] args) {
        int[] nums = new int[3];
        System.out.println(nums[3]);
        //编辑时不报错，运行时报错/运行时异常RuntimeException
        //非运行时异常(检查异常)
        try{
            Class.forName("ex.Demo01");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
