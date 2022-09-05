package qqqcloud.cn.hkSingleton;

public class hkSingleton {

    /**
     * holder方式实现延迟加载单例，内部类静态变量只加载一次
     */
    public static class hkSingletonHolder {
        public final static hkSingleton INSTANCE=new hkSingleton();
    }

    public static hkSingleton getInstance(){
        return hkSingletonHolder.INSTANCE;
    }


    public static void main(String[] args) {
        System.out.println(getInstance());
        System.out.println(getInstance());
    }

}
