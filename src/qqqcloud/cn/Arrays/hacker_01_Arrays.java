package qqqcloud.cn.Arrays;

import java.util.Arrays;

public class hacker_01_Arrays {

    public static void main(String[] args) {

        // Arrays 工具常用API
        String a="reureprq";
        char[] chars = a.toCharArray();

        String s = Arrays.toString(chars);
        System.out.println(s);
        Arrays.sort(chars);
        System.out.println(Arrays.toString(chars));

        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.println(chars[i]);
        }

    }
}
