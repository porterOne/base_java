package qqqcloud.cn.hkCallbacek;

public class hacker_02_ServiceImpl implements hacker_01_Service{
    private hacker_03_Customer customer;
    public hacker_02_ServiceImpl(hacker_03_Customer customer) {
        this.customer = customer;
    }
    @Override
    public void leave() {
        System.out.println("包裹已经取走");
    }

    public void call(){
        System.out.println("打电话or发送消息给客户");
        this.customer.getPackage(this);

        /*
         * 自己去做其它事
         */
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("A want to do another thing!");
                try {
                    Thread.sleep(1000*4);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }

    public static void main(String[] args) {

        hacker_02_ServiceImpl service = new hacker_02_ServiceImpl(new hacker_03_Customer());
        service.call();

    }
}
