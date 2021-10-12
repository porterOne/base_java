package qqqcloud.cn.Algorithm.Sort;

import java.lang.reflect.Array;

public class hacker_01_maopao {

    public static void main(String[] args) {
        int[] arr= {12,10,7,6,2,100};
        long start = System.currentTimeMillis();
        maopao(arr);
        long end=System.currentTimeMillis();

        System.out.println("冒泡排序执行时间为："+(end-start)+"ms");
        for (int i : arr) {
            System.out.println(i);
        }
    }
// 冒泡排序
    public static void maopao(int[] arr) {
        int length=arr.length-1;
        // 寻找长度-1次
        for (int j = arr.length-1; j >0; j--) {
            // 一次寻找最大值
            for (int i = 0; i < j; i++) {
                if(arr[i]>arr[i+1])
                {
                    int temp=arr[i+1];
                    arr[i+1]=arr[i];
                    arr[i]=temp;
                }
        }

        }



    }

}
