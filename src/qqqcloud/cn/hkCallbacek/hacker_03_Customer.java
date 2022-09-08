package qqqcloud.cn.hkCallbacek;

public class hacker_03_Customer {

    /**
     * 回调函数
     */
    public void getPackage(hacker_01_Service service){
        System.out.println("请过来取你的快递");
        service.leave();
    }
}
