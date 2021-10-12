package qqqcloud.cn.Exceptions;

public class hacker_02_throw {

    public static void main(String[] args) {
        //int[] arr = null;
        int[] arr = new int[3];
        int e = getElement(arr,-1);
        System.out.println(e);
    }
    /*
        定义一个方法,获取数组指定索引处的元素
        参数:
            int[] arr
            int index
        以后(工作中)我们首先必须对方法传递过来的参数进行合法性校验
        如果参数不合法,那么我们就必须使用抛出异常的方式,告知方法的调用者,传递的参数有问题
        注意:
            NullPointerException是一个运行期异常,我们不用处理,默认交给JVM处理
            ArrayIndexOutOfBoundsException是一个运行期异常,我们不用处理,默认交给JVM处理
     */
    public static int getElement(int[] arr,int index){
        /*
            我们可以对传递过来的参数数组,进行合法性校验
            如果数组arr的值是null
            那么我们就抛出空指针异常,告知方法的调用者"传递的数组的值是null"
         */
        if(arr == null){
            throw new NullPointerException("传递的数组的值是null");
        }

        /*
            我们可以对传递过来的参数index进行合法性校验
            如果index的范围不在数组的索引范围内
            那么我们就抛出数组索引越界异常,告知方法的调用者"传递的索引超出了数组的使用范围"
         */
        if(index<0 || index>arr.length-1){
            throw new ArrayIndexOutOfBoundsException("传递的索引超出了数组的使用范围");
        }

        int ele = arr[index];
        return ele;
    }
}
