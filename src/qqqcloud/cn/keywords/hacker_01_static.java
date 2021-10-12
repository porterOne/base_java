package qqqcloud.cn.keywords;


// static 方法中的局部变量是不是共享的？   结果 static修饰的方法与一般的方法一样，局部变量在jvm方法栈执行完后gc掉

// static修饰的方法，可以通过类.的方式直接调用方法，这样做的好处是减少new()对象调用方法带来的资源浪费


//当前线程为：Thread-0当前局部变量a为：1
//        当前线程为：Thread-1当前局部变量a为：1
//        当前线程为：Thread-2当前局部变量a为：1
//        当前线程为：Thread-3当前局部变量a为：1
//        当前线程为：Thread-4当前局部变量a为：1
//        当前线程为：Thread-6当前局部变量a为：1
//        当前线程为：Thread-5当前局部变量a为：1
//        当前线程为：Thread-8当前局部变量a为：1
//        当前线程为：Thread-7当前局部变量a为：1

public class hacker_01_static {
    static String a="124";

    public static void main(String[] args) {
        // 定义一个线程数组
        Thread threads[] = new Thread[10];
        // 每个线程执行静态方法
        for(int i=1;i<10;i++){
            threads[i]=new MyThread();
            threads[i].start();
        }
    }

    static void static_method(String s){
        // static 方法中的局部变量是不是共享的？
        int a =1;
        System.out.println("当前线程为："+s+"当前局部变量a为："+a);
        a+=1;
    }
}




class MyThread extends Thread{
        @Override
        public void run() {
            hacker_01_static.static_method(Thread.currentThread().getName());
        }
    }



