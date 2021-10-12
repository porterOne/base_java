package qqqcloud.cn.Annotations;

import java.util.concurrent.ConcurrentHashMap;

@PersonalAnno(classname="class",methodname = "method")
public class hacker_01_PersonalAnnoDemo {

    public static void main(String[] args) {
        // function: 获取注解内容

        //1.解析注解
        //1.1获取该类的字节码文件对象
        Class<hacker_01_PersonalAnnoDemo> Class = hacker_01_PersonalAnnoDemo.class;
        //2.获取上边的注解对象
        //其实就是在内存中生成了一个该注解接口的子类实现对象
        /*

            public class ProImpl implements PersonalAnno{
                public String classname(){
                    return "class";
                }
                public String methodname(){
                    return "method";
                }

            }
 */
        PersonalAnno an = Class.getAnnotation(PersonalAnno.class);
        //3.调用注解对象中定义的抽象方法，获取返回值
        String className = an.classname();
        String methodName = an.methodname();
        System.out.println(className+":"+methodName);

        new ConcurrentHashMap<>();

    }





}
