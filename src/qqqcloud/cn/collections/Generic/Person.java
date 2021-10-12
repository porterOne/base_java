package qqqcloud.cn.collections.Generic;

public class Person {

    // 定义接收任何类型的方法（泛型实现）
    public static <S> S tranPro(S s){
        return s;
    }

}
