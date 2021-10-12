package qqqcloud.cn.Algorithm;

public class AlgorithmTest03 {


    public static void main(String[] args) {

        MergeArr(new int[]{1, 1, 2, 4, 5}, new int[]{1, 2, 3, 4});
    }

    /**
     * 求两个有序数组的合并结果
     */

    public static int[] MergeArr(int[]a,int[]b){

        int alen=a.length;
        int blen=b.length;
        int[] c=new int[alen+blen];

        int c_index=0;
        int a_index=0;
        int b_index=0;

        while((a_index<alen)&&(b_index<blen)) {
            // a小于等于b
            if(a[a_index]<=b[b_index])
            {
                c[c_index]=a[a_index];
                c_index+=1;
                a_index+=1;
                continue;

            }
            // a大于b
            else{
                c[c_index]=b[b_index];
                c_index+=1;
                b_index+=1;
                continue;
            }
        }
        while (a_index<alen)
        {
            c[c_index]=a[a_index];
            c_index+=1;
            a_index+=1;
        }
        while (b_index<blen)
        {
            c[c_index]=b[b_index];
            c_index+=1;
            b_index+=1;
        }

        // 遍历c
        for (int i : c) {
            System.out.println(i);
        }

        return null;
    }
    
}
