package qqqcloud.cn.Pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class hacker_03_matcher_matches {

    public static void main(String[] args) {
        Pattern p = Pattern.compile("a\\d+");
        Matcher matcher = p.matcher("a112");
        boolean flag = matcher.matches();
        System.out.println(flag);

        System.out.println(Pattern.compile("\\d?").matcher("1").matches());


    }
}
