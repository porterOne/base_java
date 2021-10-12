package qqqcloud.cn.Threads.GetParamterFunction;

import qqqcloud.cn.Extends.Fu;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class hacker_01_GetParamterDemo {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // join方法
        Person per1=new Person();
        Thread th1=new Thread(new RunableImpl1(per1));
        th1.start();
        th1.join();
        System.out.println(per1.getName());
        // CountDownLatch
        Person per2=new Person();
        CountDownLatch cdl= new CountDownLatch(1);
        Thread th2=new Thread(new RunableImpl2(per2,cdl));
        th2.start();
        cdl.await();
        System.out.println(per2.getName());
        // FutureTask
        Person per3=new Person();
        FutureTask ft=new FutureTask(new CallableImpl(per3));
        Thread th3=new Thread(ft);
        th3.start();
        Person per4 = (Person)ft.get();
        System.out.println(per4.getName());


        System.out.println("主线程结束...");
    }



    static class RunableImpl1 implements Runnable
    {
        private Person Data;

        public RunableImpl1(Person per) {
            this.Data = per;
        }

        @Override
        public void run() {
            try{
                Thread.sleep(3000);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
            finally {
                this.Data.setName("小明");
                this.Data.setSex("女");
            }
        }
    }


    static class RunableImpl2 implements Runnable
    {
        private Person Data;
        private CountDownLatch cdl;

        public RunableImpl2(Person per, CountDownLatch cdl) {
            this.Data = per;
            this.cdl = cdl;
        }

        @Override
        public void run() {
            try{
                Thread.sleep(3000);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
            finally {
                this.Data.setName("王二麻子");
                this.Data.setSex("女");
                //计数-1
               cdl.countDown();
            }
        }
    }


    static class CallableImpl implements Callable
    {
        private Person data;

        public CallableImpl(Person per) {
            this.data = per;
        }

        @Override
        public Object call() throws Exception {
            Thread.sleep(3000);
            this.data.setName("李华");
            this.data.setSex("男");
            return this.data;
        }

    }
}

