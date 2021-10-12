package qqqcloud.cn.Pattern;

import java.util.regex.Pattern;

public class hacker_04_matcher_find {

    // find 对字符串进行匹配，匹配的字符串可以在任何位置

    public static void main(String[] args) {

        System.out.println(Pattern.compile(".?\\d{2}").matcher("a12").find());

    }




}
