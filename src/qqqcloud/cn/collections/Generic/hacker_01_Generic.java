package qqqcloud.cn.collections.Generic;

import jdk.nashorn.internal.ir.CallNode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class hacker_01_Generic {

    public static void main(String[] args) {
        ArrayList<String> arrlist = new ArrayList<>();
        demo1(arrlist);
    }


    public static void demo1(List<String> list) {

        list.add("1");
        list.add("2");
        list.add("3");
        // 迭代器
        Iterator<String> iterator = list.iterator();
        long l = System.currentTimeMillis();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        long last = System.currentTimeMillis();
        System.out.println("耗时：" + (last - l));
    }
}


