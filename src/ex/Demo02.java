package ex;

public class Demo02 {

    public static void test01() {

        Object a = null;
        try {
            a.equals("");
        } catch (NullPointerException nulls) {
            nulls.printStackTrace();
        } finally {
            System.out.println("无论正常，还是异常都执行的代码");
        }

    }

    public static int test02() {
        Object a = new Object();
        try {
            System.exit(1);
            a.equals("");
            return 1;
        } catch (NullPointerException e) {
            return 0;
        } finally {
            System.out.println("fainally");
        }
    }


    public static void test03() {
        Object a = new Object();
        try {

//            a.equals("");//空指针
//            int[] nums = new int[3];
//            nums[3] = 3 ; //越界异常
            Class.forName("ssd");
        } catch (NullPointerException e) {//捕获空指针
            System.out.println("空指针异常");
        }catch ( ArrayIndexOutOfBoundsException e ){//记住这个异常
            System.out.println("数组越界异常");
        }//还有一些根本想不到的异常
        catch ( Exception e){
            System.out.println("其他异常");
            e.printStackTrace();//打印异常的堆栈信息
            e.getMessage();//提示哪里写错误了

        }
        //只会执行一个catch
    }


    public static void test04()throws NullPointerException,ClassNotFoundException{//抛出异常给上级（方法调用处main）


            Object obj = null ;
            obj.equals("");
            Class.forName("ssd");

    }


    public static  void main(String[] args) throws Exception {//抛给虚拟机
        test04();
    }
}
