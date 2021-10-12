package qqqcloud.cn.Algorithm;

import java.lang.reflect.Array;
import java.util.*;

public class AlgorithmTest05 {


    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(1, 2, 3);
        System.out.println(integers.toString());

        String str=" abc =b\\n  ;c=\\x61d;d=234;t=\\n;d=\"test;yes\";";
        String[] strArr = str.split(";");
        Map<String,String> map =new HashMap<>();
        for (int i=0;i<strArr.length;i++) {
            String[] splitMap = strArr[i].split("=");
            for (int j = 0; j < splitMap.length; j++) {
                System.out.println(splitMap[j]);
            }
        }


    }


}
