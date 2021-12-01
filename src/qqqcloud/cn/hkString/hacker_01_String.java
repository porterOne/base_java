package qqqcloud.cn.hkString;

public class hacker_01_String {
    private static String b;

    public static void main(String[] args) {
        // 创建string对象
        String a="aaa";
        String b;
        byte[] bytes = a.getBytes();

        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }

        // String对象的API
        char c = a.charAt(1);
        int i = a.indexOf("1");
        String[] split = a.split("");
        String replace = a.replace("a", "b");
        char[] chars = a.toCharArray();

        System.out.println(split);
        System.out.println(replace);
        System.out.println(chars);


    }
}
