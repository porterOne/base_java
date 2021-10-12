package qqqcloud.cn.Threads;

import java.util.LinkedHashSet;

public class hacker_03_RunableImpleDemo {
    public static void main(String[] args) {

        Person per = new Person();

        // Runable接口的实现类
//        hacker_03_RunableImpl1 hacker_03_runable1 = new hacker_03_RunableImpl1();
//        hacker_03_RunableImpl2 hacker_03_runable2 = new hacker_03_RunableImpl2();
//        hacker_03_RunableImpl3 hacker_03_runable3 = new hacker_03_RunableImpl3();
        hacker_03_RunableImpl4_join hacker_03_runable4 = new hacker_03_RunableImpl4_join(per);

        
//        for(int i=0;i<3300;i++){
//            new Thread(hacker_03_runable1).start();
//            new Thread(hacker_03_runable2).start();
//            new Thread(hacker_03_runable3).start();
//
//        }

        Thread thr= new Thread(hacker_03_runable4);
        thr.start();

        // join 等待子线程执行完，主线程再执行
        try{
            thr.join();
        }
        catch(Exception e ){
            e.printStackTrace();
        }

        String name = per.getName();
        System.out.println(name);



    }

}
