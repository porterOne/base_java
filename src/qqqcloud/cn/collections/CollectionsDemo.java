package qqqcloud.cn.collections;

//import org.junit.Test;

import java.util.ArrayList;
import java.util.Random;

public class CollectionsDemo {

    //    随机数选择最大值,放入list
    public static void top(){
        ArrayList<Integer> list = new ArrayList<>();

        int arr[] = new int[10];

        Random ra = new Random();

        for (int i = 0; i < arr.length; i++) {

            arr[i] = ra.nextInt(100) + 1;

            if (arr[i] > 10){
                list.add(arr[i]);
            }

        }
        System.out.println(list);
        System.out.println(arr);



    }

    //list中查找指定数字
    public static int listTest(ArrayList<Integer> al , Integer s){


        for (int i = 0; i < al.size() ; i++) {
            if(al.get(i) == s){
                return i;
            }
        }
        return -1;


    }

//     重复值删除
//    @Test
    public static void listTest1 (){
        ArrayList<String> list = new ArrayList<String>();

        String[] str = {"12345","67891","12347809933","98765432102","67891","12347809933"};   // 树组的第一种构建
//        String[] str1 = new String[10];   数组的第二种方式构建

//        StringBuilder str2 = new StringBuilder();
//        StringBuffer str3 = new StringBuffer();
//        可变字符序列
//        https://www.cnblogs.com/tz346125264/p/7624907.html



        // list 添加strs 解决数组不能被操作
        for (int i = 0; i <str.length ; i++) {
            list.add(str[i]);
        }



        for (int i = 0; i <list.size() ; i++) {
            for (int j = i+1; j <list.size() ; j++) {
                if(list.get(i).equals(list.get(j))){
                    list.remove(j);
                }
            }
        }
        System.out.println(list.toString());

    }



    public static void main(String[] args) {
//        top();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(7);


//        int index = listTest(list, 7);
        System.out.println(list);
        list.clear();
        System.out.println(list.size());
//        listTest1();


//数组的两种表述方式
//        char[] value = new char[5];
//        char value[] = new char[5];
//
//        System.out.println("开始执行");
//        System.out.println(value.toString());
    }
}
