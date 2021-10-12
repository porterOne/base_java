package qqqcloud.cn.Pattern;
import java.util.regex.Pattern;

public class hacker_01_split {

    public static void main(String[] args) {

        Pattern p = Pattern.compile("\\d");
        System.out.println(p.pattern());
        String[] sarr = p.split("我的QQ是:456456我的电话是:0532214我的邮箱是:aaa@aaa.com");

        for (int i = 0; i < sarr.length; i++) {
            System.out.print(sarr[i]);
        }



    }

}
