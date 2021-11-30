package qqqcloud.cn.collections.Generic;

import jdk.nashorn.internal.ir.CallNode;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayList;

public class hacker_03_Generic {

    public static void main(String[] args) {
//        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
//        hacker_03_GenericClass<String> str = new hacker_03_GenericClass<>();
//        str.setElement("123");
//        System.out.println(str.getElement());
//
//        hacker_03_GenericClass<Integer> in = new hacker_03_GenericClass<>();
//        in.setElement(12);
//        System.out.println(in.getElement());

        String str2 = new hacker_03_GenericMethod().getElement("123");
        System.out.println(str2);
        new hacker_03_GenericMethod().printElement(1);
        new hacker_03_GenericMethod().printElement(true);
        new hacker_03_GenericMethod().printElement(new Double("1.2"));

        String str3 = new hacker_03_GenericInterfaceImpl().getElement("123");
        Integer in3 = new hacker_03_GenericInterfaceImpl2<Integer>().getElement(1);
        System.out.println(str3);
        System.out.println(in3);

        ArrayList<String> strings = new ArrayList<>();
        strings.add("1");
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        ArrayList<BigDecimal> bigDecimals = new ArrayList<>();
        BigDecimal bigDecimal = new BigDecimal("12");
        bigDecimals.add(bigDecimal);

        printElement2(bigDecimals);
        printElement2(integers);

    }

    // 泛型通配符上限 extend  泛型通配符下限 super
    public static void printElement(ArrayList<? super Integer> lists){
        for (int i = 0; i < lists.size(); i++) {
            System.out.println(lists.get(i));
        }

    }
    public static void printElement2(ArrayList<? extends Number> lists){
        for (int i = 0; i < lists.size(); i++) {
            System.out.println(lists.get(i));
        }

    }
}
