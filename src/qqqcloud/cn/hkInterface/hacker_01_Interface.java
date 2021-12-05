package qqqcloud.cn.hkInterface;

public interface hacker_01_Interface {

    void test01();
    void test02();
    void test03();

    // 接口默认方法，解决接口升级问题
    default void defalutTest04(){
        System.out.println("default");
    }
}
