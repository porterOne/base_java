package qqqcloud.cn.Threads;

public class hacker_01_MyThread extends Thread  {

    public hacker_01_MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(this.getName()+"正在执行。。。");
        try {
            Thread.sleep(3000);
} catch (InterruptedException e) {
        e.printStackTrace();
        }

        System.out.println(this.getName()+"执行完成。。。");
        }

}
