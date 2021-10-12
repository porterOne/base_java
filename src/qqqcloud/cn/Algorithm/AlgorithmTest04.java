package qqqcloud.cn.Algorithm;

public class AlgorithmTest04 {

    public static void main(String[] args) {
        /*
        * 1: 移动行头 行尾 home end键
        * 2：跳转单词 Ctrl + 方向键
        * 3：移动 shift 选中 Ctrl + X
        * 4: 自顶向下编程 （判断是否是回文串）
        *
        *
        * */
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

    public static boolean isPalindrome(String s) {
        // 1: filter not char or number 2:reverse and compara
        String filterdS = _filterNonNumberAndChar(s);
        String reversedS=_ReverseString(filterdS);

        return filterdS.equalsIgnoreCase(reversedS);
    }

    private static String _ReverseString(String filterdS) {
        return new StringBuilder(filterdS).reverse().toString();
    }

    private static String _filterNonNumberAndChar(String s) {
        return s.replaceAll("[^a-zA-Z0-9]","");
    }

}
