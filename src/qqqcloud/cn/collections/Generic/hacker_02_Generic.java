package qqqcloud.cn.collections.Generic;

import java.util.HashMap;

public class hacker_02_Generic {


    public static void main(String[] args) {

        /// 定义的泛型方法
        String s = Person.tranPro("1");
        Integer integer = Person.tranPro(1);
        Person person = Person.tranPro(new Person());

    }

}
