package qqqcloud.cn.Threads.CountDownLatch;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class hacker_01_CountDownLatchDemo {

    final List<Integer> datas= new ArrayList<>();
    final ExecutorService TASK_POOL= Executors.newFixedThreadPool(20);
    final CountDownLatch cdl=new CountDownLatch(20);

    public static void main(String[] args) throws InterruptedException {

     hacker_01_CountDownLatchDemo countdownlatch= new hacker_01_CountDownLatchDemo();
     countdownlatch.doTestCountDownLatch();
    }

    public void doTestCountDownLatch() throws InterruptedException {
        Runnable task=()->{
            try {
                // 等待，主动让出cup
                cdl.await();
                for (int i = 0; i < 100; i++) {
                   datas.add(i);
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        // 循环20个线程进行执行操作
        for (int i = 0; i <20 ; i++) {
            TASK_POOL.execute(task);
            cdl.countDown();
        }
        /*
        * shutdown()
 将线程池状态置为SHUTDOWN,并不会立即停止：
停止接收外部submit的任务
内部正在跑的任务和队列里等待的任务，会执行完
等到第二步完成后，才真正停止

shutdownNow()
将线程池状态置为STOP。企图立即停止，事实上不一定：
跟shutdown()一样，先停止接收外部提交的任务
忽略队列里等待的任务
尝试将正在跑的任务interrupt中断
返回未执行的任务列表
它试图终止线程的方法是通过调用Thread.interrupt()方法来实现的，但是大家知道，这种方法的作用有限，如果线程中没有sleep 、wait、Condition、定时锁等应用, interrupt()方法是无法中断当前的线程的。所以，ShutdownNow()并不代表线程池就一定立即就能退出，它也可能必须要等待所有正在执行的任务都执行完成了才能退出。
但是大多数时候是能立即退出的

awaitTermination
接收人timeout和TimeUnit两个参数，用于设定超时时间及单位。当等待超过设定时间时，会监测ExecutorService是否已经关闭，若关闭则返回true，否则返回false。一般情况下会和shutdown方法组合使用。
        *
        *
        * */


        TASK_POOL.shutdown();                     // 不再接受外部线程请求，处理完活动的线程
        TASK_POOL.awaitTermination(5, TimeUnit.SECONDS);   // 检测线程池是否关闭
        System.out.println(datas.size());

    }


}
