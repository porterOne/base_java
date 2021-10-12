package qqqcloud.cn.Threads.JoinFunction;

import java.util.ArrayList;
import java.util.List;

public class hacker_02_mutil_join {

    public static void main(String[] args) throws InterruptedException {
        List<Thread> list=new ArrayList<>();   // 线程array

        for(int i=0;i<100;i++){
            Thread thr=new Thread(){
                @Override
                public void run(){
                    System.out.println(Thread.currentThread().getName()+"正在执行中。。。");
                }
            };
            thr.setName(String.valueOf(i));
            list.add(thr);
        }
        // 开启
        for(int i=0;i<list.size();i++){
            list.get(i).start();
        }
        // 子线程执行完，主线程再执行
        for(int i=0;i<list.size();i++){
            // 主线程调用join() ->内部调用wait(0),主线程等待子线程notify()唤醒
            list.get(i).join();
        }

        System.out.println(Thread.currentThread().getName()+"主线程执行完。。。");

    }





}
