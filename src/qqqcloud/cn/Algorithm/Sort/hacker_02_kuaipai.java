package qqqcloud.cn.Algorithm.Sort;

public class hacker_02_kuaipai {


    public static void main(String[] args) {
        int[] arr= {12,10,7,6,2,100};
        long start = System.currentTimeMillis();
        kuaipai(arr,0,arr.length-1);
        long end=System.currentTimeMillis();

        System.out.println("快速排序执行时间为："+(end-start)+"ms");

        for (int i : arr) {
            System.out.println(i);
        }


    }
// 快速排序
    public static void kuaipai(int[] arr,int first,int last)
    {
        int low=first;
        int high=last;

        // 递归出口
        if(high<low)
        {
            return;
        }
        int med_value=arr[low];
        //一次快排
        while(low<high)
        {
            // 寻找右边，相比中间值小、等的值
            while((low<high)&&(arr[high]>=med_value))
            {
                high--;
            }
            arr[low]=arr[high];
            // 寻找左边，相比中间值大的值
            while((low<high)&&(arr[low]<med_value))
            {
                low++;
            }
            arr[high]=arr[low];
        }

        arr[low]=med_value;

        // 左边快排
        kuaipai(arr, first, low - 1);
        // 右边快排
        kuaipai(arr,low+1,last);

    }
}
