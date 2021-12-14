package qqqcloud.cn.hkInterface;

public class hacker_04_Interface {

    public static void main(String[] args) {
        hacker_01_Interface hacker_03_interface = new hacker_03_Interface();
        hacker_03_interface.defalutTest04();
        hacker_03_interface.test01();

        /// 抽象类new的时候需要将抽象方法实现
        test(new hacker_02_Interface() {
            @Override
            public void test01() {

            }

            @Override
            public void test02() {

            }

            @Override
            public void test03() {

            }
        });
    }

    public static void test(hacker_02_Interface o){
        System.out.println("抽象类作为方法的入参");
    }
}
