package qqqcloud.cn.Threads;

public class hacker_03_RunableImpl4_join implements Runnable {

    private Person per;

    public hacker_03_RunableImpl4_join(Person per) {
        this.per = per;
    }

    @Override
    public void run() {
        per.setName("zhansan");
        per.setAge(12);
    }

}
