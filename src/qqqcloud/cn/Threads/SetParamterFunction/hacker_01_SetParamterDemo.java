package qqqcloud.cn.Threads.SetParamterFunction;

public class hacker_01_SetParamterDemo {

    public static void main(String[] args) throws InterruptedException {
        // 第一种构造函数的方式传参
        MyThread th1= new MyThread("hacker1");
        th1.start();
        // 第二种实例方法的方式传参
        MyThread th2= new MyThread();
        th2.setParamter("hacker2");
        th2.start();
        // 第三种利用回调的方式传参
        MyThread1 th3=new MyThread1(new CalculatorImp());
        th3.start();
        // join主线程等待子线程执行完，再执行
        th1.join();
        th2.join();
        th3.join();
        System.out.println("==========主线程结束==========");
    }
}


class MyThread extends Thread{
    
    private String paramter;

    public void setParamter(String paramter) {
        this.paramter = paramter;
    }
    public MyThread() {
    }

    @Override
    public void run(){
        System.out.println("传参成功："+this.paramter);
    }
    public MyThread(String paramter) {
        this.paramter = paramter;
    }

}

class MyThread1 extends Thread{
    private Calculator cal;

    public MyThread1(Calculator cal) {
        this.cal = cal;
    }

    public MyThread1() {
    }

    @Override
    public void run(){
        System.out.println("传参成功："+this.cal.process(2,3,4));
    }

}


// Calculator接口的一种实现方式
class CalculatorImp implements Calculator{

    @Override
    public int process(int... a) {
        int sub=0;
        for (int i = 0; i < a.length; i++) {
            sub+=a[i];
        }
        return sub;
    }
}
