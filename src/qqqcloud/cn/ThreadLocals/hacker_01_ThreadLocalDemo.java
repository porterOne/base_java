package qqqcloud.cn.ThreadLocals;

import java.util.concurrent.TimeUnit;

public class hacker_01_ThreadLocalDemo {


    public static ThreadLocal<User> th=new ThreadLocal<>();


    public static void main(String[] args) throws InterruptedException {

        // 第一个线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                User user = new User();
                user.setName("小凯");
                user.setAge(1);
                // set user data
                th.set(user);

                // get user data
                User getUser=th.get();
                // set threadLocal object null
//                th=null;
                // in order to remove value refrence 
//                if (th.get()==null){
                    // clean key is null [entry]
//                    th.remove();
//                }

                System.out.println("第一个线程："+getUser);

            }
        }).start();

        // wait second thread run
//        TimeUnit.MILLISECONDS.sleep(1000);

        // 第二个线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                // get user data
                User user=th.get();
                System.out.println("第二个线程："+user);
            }
        }).start();

    }





}
