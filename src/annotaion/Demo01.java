package annotaion;

import collection02.Main;

import java.sql.SQLOutput;
import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.List;

class Father{
    public void eat(){
        System.out.println("Father eat");
    }
}



class Son extends Father{
   @Override
    public void eat() {
        System.out.println("Son eat...");
    }
}



class Test{
    @Deprecated
    public void foot() {
        System.out.println("测试");
    }
}

@SuppressWarnings(value = "unchecked")

public class Demo01 {
    public static void main(String[] args) {
        List list = new ArrayList();
            Test test = new Test();
            test.foot();
    }

}
