package qqqcloud.cn.Threads;

public class hacker_02_MyThreadDemo {

    public static void main(String[] args) {

        for (int i=0;i<100;i++)
        {

            hacker_01_MyThread thread = new hacker_01_MyThread("线程" + i);
            thread.start();
        }

        new Thread(new Runnable() {
            @Override
            public void run() {

                    System.out.println(Thread.currentThread().getName());

            }
        }).start();

        System.out.println("主线程结束。。。");

    }
}
