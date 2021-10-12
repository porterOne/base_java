package qqqcloud.cn.Algorithm.Find;

import static qqqcloud.cn.Algorithm.Sort.hacker_02_kuaipai.kuaipai;

public class hacker_01_zheban {

    public static void main(String[] args) {
        int[] arr= {12,10,7,6,2,100};
        kuaipai(arr,0,arr.length-1);

        for (int i : arr) {
            System.out.println(i);
        }

        // 有序折半查找
        System.out.println(zheban(arr,12,0,arr.length-1));

    }


    public static boolean zheban(int[] arr, int number,int first,int last)
    {
        // 递归出口
        if(first>=last){
            return false;
        }
        // 中间值下标
        int med_index=(first+last)/2;
        // 查找到值
        if(arr[med_index] == number){
            return true;
        }
        // 所查询number较大，右查
        else if(arr[med_index]<number)
        {
            // 方法中调用有返回值的，需要return返回
            return zheban(arr,number,med_index+1,last);
        }
        // 所查询number较小，左查
        else if(arr[med_index]>number)
        {
            // 方法中调用有返回值的，需要return返回
            return zheban(arr,number,first,med_index-1);
        }
        return false;
    }



}
