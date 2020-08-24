package annotaion;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.lang.annotation.Annotation;

public class TestMyAnnotation {

    @MyAnnotation(value = "李四", age = 24)
    public static void test() throws Exception {
        //使用注解
        Annotation[] annotations = Class.forName("annotaion.TestMyAnnotation").getMethod("test").getAnnotations();
        for (Annotation a : annotations) {
            if(a instanceof MyAnnotation){//判断注解
                System.out.println(((MyAnnotation) a).age());
                System.out.println(((MyAnnotation) a).value());
            }else{
                System.out.println(" @Deprecated...");
            }
        }
    }

    public static void main(String[] args)throws Exception  {
        test();
    }
}
