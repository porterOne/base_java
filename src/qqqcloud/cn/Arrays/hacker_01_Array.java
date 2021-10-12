package qqqcloud.cn.Arrays;

public class hacker_01_Array {

    public static void main(String[] args) {
        System.out.println(climbStairs(10));
    }


    public static int climbStairs(int n) {
        // 没思路，归纳法
        // 1个台阶，1中方法
        // 2个台阶，2中方法
        // 3个台阶，第1个台阶方法个数+第二个台阶方法个数
        // .......
        int a1=1;
        int a2=2;
        int a3=3;

        if(n==1) return 1;
        else if(n==2) return 2;
        else if(n==3) return 3;
        else{
            int sum=0;
            for(int i=4;i<n+1;i++){
                sum=a2+a3;
                a2=a3;
                a3=sum;
            }
            return sum;
        }
    }

}
