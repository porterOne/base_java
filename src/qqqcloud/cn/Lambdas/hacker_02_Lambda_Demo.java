package qqqcloud.cn.Lambdas;

public class hacker_02_Lambda_Demo {

    public static int sum(int a, int b,hacker_02_Lambda_AbstractClass ab)
    {
        return ab.sum(a,b);
    }


    public static void main(String[] args) {
        System.out.println(sum(1,2,(int a,int b)->{return a+b;}));
    }

}
