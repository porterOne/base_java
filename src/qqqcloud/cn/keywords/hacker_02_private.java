package qqqcloud.cn.keywords;

// private修饰的成员变量的作用？    private修饰的成员变量只能在当前类中调用

public class hacker_02_private {

        public static void main(String[] args) {
            Person per1 = new Person();
            Person per2 = new Person();
            per1.classPrivate(per2);

            // System.out.println("其它方法中调用private修饰的变量："+per1.a);     对象. 调用失败
            // System.out.println("其它方法中调用private修饰的变量："+Person.a);   类. 调用失败

        }
    }

class Person {
    private String a = "1";

    public void classPrivate(Person per) {
        System.out.println("this" + this);
        System.out.println("otherPerson" + per);
        System.out.println("类中调用private修饰的变量：" + per.a);
    }
}
