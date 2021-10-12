package qqqcloud.cn.Algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AlgorithmTest02 {

    // 方案一
   public static boolean valid(String word, String abbr)
   {
       // 存储数字及对应下标
       HashMap<Integer, String> maps = new HashMap<>();
       char[] abbrs = abbr.toCharArray();

        // 记录数字
       String numberTemp="";
       // 记录字符
       String stringTemp="";
       // 记录偏移量
       int index=0;

       // 遍历寻找数字
       for (int i=0;i<abbrs.length;i++) {
           if (Character.isDigit(abbrs[i])) {
               // 判断为数字
               numberTemp += abbrs[i];
               continue;
           } else {
               // 判断为字母
               stringTemp+=abbrs[i];
               // 偏移量+1
               index+=1;
               if (numberTemp !="")
               {
                   maps.put(index-1,numberTemp);
                   numberTemp="";
               }
           }
       }
        System.out.println("标记下标："+maps.toString());
        System.out.println("abbr:"+stringTemp);

       // word值精简
       StringBuilder sb = new StringBuilder(word);
       for(Map.Entry<Integer, String> map:maps.entrySet())
       {
           Integer key = map.getKey();
           String value = map.getValue();

           sb.replace(key,Integer.parseInt(value)+key,"");
       }
       System.out.println(sb.toString());

       // 判断是否相同
       return sb.length()==stringTemp.length();

   }

   // 方案二
    static boolean valid1(String word, String abbr) {
        char[] words = word.toCharArray();
        char[] abbrs = abbr.toCharArray();
        //1:数字，统计偏移数字量
        //2：英文，字符串数组中匹配
        // 记录数字
        String numberTemp = "";
        // 记录abbrs遍历下标
        int abbrsIndex = 0;
        for (char temp : abbrs) {
            if (Character.isDigit(temp)) {
                numberTemp += temp;
                continue;
            } else {
                //numberTemp中有记录
                if (!"".equals(numberTemp)) {
                    //  更新abbrs下标
                    abbrsIndex += Integer.parseInt(numberTemp);
                    numberTemp = "";
                }
                if (abbrsIndex >= words.length) {
                    return false;
                }
                // abbrs与word进行字符比较
                if (temp == words[abbrsIndex]) {
                    abbrsIndex++;
                    continue;
                } else {
                    return false;
                }
            }
        }
        return abbrsIndex == words.length;
    }

    // 方案三
    public static Boolean valid2(String word, String abbr) {
        StringBuilder sB = new StringBuilder(word);

        // abbr中的数字及下标
        Pattern p = Pattern.compile("\\d+");
        Matcher matcher = p.matcher(abbr);

        while (matcher.find()) {
            String group = matcher.group();
            int start=matcher.start();
            int end=Integer.parseInt(group)+start;


//            System.out.println("开始下标：" + start);
//            System.out.println("结束下标："+end);
//            System.out.print("要替换长度:");
//            System.out.println(group);
            sB.replace(start,end,group);
        }
        try {
            return abbr.equals(sB.toString());
        }catch (Throwable e){
            return false;
        }
    }

    public static void main(String[] args)  {
        System.out.println(valid2("internationalizati", "i12iz4n"));
    }


}
