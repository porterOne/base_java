package qqqcloud.cn.Threads.JoinFunction;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class hacker_01_RunableImpl_join {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Join();
        //CountDownLatch();
        //FutureTask();

        //Thread.sleep(100000);
        System.out.println("主线程结束");
    }
    // join 方式一实现主线程等待子线程执行完再执行
    public static void Join() throws InterruptedException {
        Thread th1=new Thread(new RunableImp("A"));
        Thread th2=new Thread(new RunableImp("B"));
        th1.start();
        th2.start();
        th1.join();
        th2 .join();
    }

    // CountDownLatch 方式二实现主线程等待子线程执行完再执行
    public static void CountDownLatch() throws InterruptedException {
        CountDownLatch cdl=new CountDownLatch(2);

        Thread th1=new Thread(new RunableImp2("A",cdl));
        Thread th2=new Thread(new RunableImp2("B",cdl));
        th1.start();
        th2.start();
        cdl.await();
        System.out.println("主线程执行完");


    }

    // Callable FutureTask 方式三实现主线程等待子线程执行完再执行
    public static void FutureTask() throws ExecutionException, InterruptedException {
        FutureTask task1=new FutureTask(new CallableImp("A"));
        FutureTask task2=new FutureTask(new CallableImp("B"));
        Thread th1=new Thread(task1);
        Thread th2=new Thread(task2);
        th1.start();
        th2.start();

        if(!task1.isDone()&&!task2.isDone()){
            System.out.println("子线程正在执行中");
        }
        System.out.println(task1.get());
        System.out.println(task2.get());

    }

    static class RunableImp implements Runnable
    {
        private String name;

        public RunableImp(String name) {
            this.name = name;
        }
        @Override
        public void run() {
            System.out.println(this.name+"开始执行");
            try {
                Thread.sleep(30000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(this.name+"执行结束");
        }
    }

    static class RunableImp2 implements Runnable
    {
        private String name;
        private CountDownLatch latch;

        public RunableImp2(String name, CountDownLatch latch) {
            this.name = name;
            this.latch = latch;
        }

        @Override
        public void run() {
            System.out.println(this.name+"开始执行");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(this.name+"执行结束");
            latch.countDown();
        }
    }

    static class CallableImp implements Callable{
        private String name;
        public CallableImp(String name) {
            this.name = name;
        }

        @Override
        public Object call() throws Exception {
            System.out.println(this.name+"开始执行");
            Thread.sleep(3000);
            return this.name+"执行完成";
        }
    }

}
