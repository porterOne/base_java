package qqqcloud.cn.Threads;

public class hacker_03_RunableImpl2 implements Runnable {
    private int ticket=10000;

    @Override
    public void run() {
        SaleTicket();
    }
    // 第二种保证同步，同步方法
    private  /*synchronized*/ void SaleTicket(){
        if(this.ticket>0){
            System.out.println("现在正在卖第"+ticket);
            this.ticket=--this.ticket;
        }
    }

}
