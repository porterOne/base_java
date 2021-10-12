package qqqcloud.cn.Threads;

import java.util.Random;

public class hacker_04_WaitAndNotify2 {


    public static void main(String[] args) {
        // 锁对象
        BaoZi baozi=new BaoZi();
        // 生产者
        new hacker_05_WaitAndNotify2BaoZiPu(baozi).start();
        // 消费者
        new hacker_05_WaitAndNotify2ChiHuo(baozi).start();
    }

}



