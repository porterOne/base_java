package qqqcloud.cn.Pattern;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.regex.Pattern;

public class hacker_02_matches {

    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\d");
        boolean mat = Pattern.matches("\\d", "12a");
        System.out.println(mat);

    }
}
