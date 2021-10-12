package qqqcloud.cn.Annotations;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value={ElementType.TYPE})
@Retention(value=RetentionPolicy.RUNTIME)
public @interface PersonalAnno {
/**
    int value();
    // Person 为枚举类型
    Person per();
    MyAnno anno();
    String name() default "";

     int[] valueArr();
     Person[] perArr();
     MyAnno[] annoArr();
     String[] strsArr();  **/

    String classname();
    String methodname();

}
