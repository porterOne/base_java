package qqqcloud.cn.Threads;

import jdk.nashorn.internal.ir.CallNode;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class hacker_03_RunableImpl3 implements Runnable{

    private int ticket=10000;

    // 多态
    private Lock I =new ReentrantLock();


    @Override
    public void run() {
        // 第三种保证同步，锁对象
//        I.lock();
        System.out.println("现在正在卖第"+ticket+"张票");
        --ticket;
//        I.unlock();
    }


}
