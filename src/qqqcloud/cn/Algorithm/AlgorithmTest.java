package qqqcloud.cn.Algorithm;

public class AlgorithmTest {
    /**
     * 编写一个函数来查找字符串数组中的最长公共前缀。
     * 如果不存在公共前缀，返回空字符串 ""
     *
     * 分析：
     *    定义第一个字符串为最大长串，第一个字符串与后面字符串比较，
     *    更新最大长串
     * */

    public static void main(String[] args) {
        String[] str=new String[]{"dfsf","dfst","dns"};
        System.out.println(Solution(str));
    }

    public static String Solution(String[] str)
    {
        String temp=str[0];
        for (int i = 1; i < str.length; i++) {
            int j=0;
            // 字符串比较
            for(;(j<temp.length())&&(j<str[i].length());j++){

                // 最大长串与字符串进行比较，更新最大长串
                if(temp.charAt(j)!=str[i].charAt(j))
                {
                    break;
                }
            }
            temp=str[i].substring(0,j);
            if("".equals(temp)) return temp;
        }
        return temp;

    }




}
