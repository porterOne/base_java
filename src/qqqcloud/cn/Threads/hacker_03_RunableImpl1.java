package qqqcloud.cn.Threads;

public class hacker_03_RunableImpl1 implements Runnable{

    private  int ticket=100;
    //锁对象
    private  Object obj=new Object();

    @Override
    public void run() {
        // 第一种保证同步，synchronized同步代码块
        synchronized(obj){

            if (ticket >0){
            --ticket;
            System.out.println("现在正在卖"+ticket+"张");
            }

        }


    }
}
