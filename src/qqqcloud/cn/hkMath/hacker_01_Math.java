package qqqcloud.cn.hkMath;

public class hacker_01_Math {
    public static void main(String[] args) {

        //  Math工具类常用API
        System.out.println(Math.abs(-10.3));
        System.out.println(Math.ceil(-10.2));
        System.out.println(Math.floor(-10.2));
        System.out.println(Math.round(10.2));
        System.out.println(Math.round(10.6));
        // 查看某区间满足条件正整数
        countConditionNumber(-10.2,5.9);
    }

    private static void countConditionNumber(double a,double b) {

        for (int i = (int)a; i < Math.floor(b) ; i++) {
            int abs = Math.abs(i);
            if(abs>=6 || abs<2.1){
                System.out.println(i);
            }
        }



    }


}
