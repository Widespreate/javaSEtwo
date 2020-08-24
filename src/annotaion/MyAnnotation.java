package annotaion;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
//修饰该注解能在类、属性和方法上使用
@Target(value = {ElementType.FIELD,ElementType.METHOD,ElementType.TYPE,ElementType.PARAMETER,ElementType.LOCAL_VARIABLE})
@Retention(RetentionPolicy.RUNTIME)


public @interface MyAnnotation {
        String value() default "张三";
        int age() default 22;
        //用定义方法的形式，定义一个属性
        //方法的名字，就是属性的名字；方法的返回值，就是属性的类型
}
