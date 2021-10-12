package qqqcloud.cn.Pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class hacker_05_matcher_group {

    public static void main(String[] args) {

        Pattern p = Pattern.compile("\\d+");
        Matcher mat = p.matcher("我的QQ是:456456 我的电话是:0532214 我的邮箱是:aaa123@aaa.com");

        while(mat.find())
        {
            System.out.println(mat.group());
            System.out.println("SART:"+mat.start());
            System.out.println("END:"+mat.end());
        }



    }

}
