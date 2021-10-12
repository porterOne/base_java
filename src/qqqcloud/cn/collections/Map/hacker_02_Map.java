package qqqcloud.cn.collections.Map;

import java.util.HashMap;

public class hacker_02_Map {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram","nagaram"));
    }
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        // map
        HashMap<Character,Integer> map=new HashMap<>();
        char[] arrayA=s.toCharArray();
        char[] arrayB=t.toCharArray();

        for(int i=0;i<arrayA.length;i++){
            if(map.get(arrayA[i])==null){
                map.put(arrayA[i],1);
            }
            else{
                int value=map.get(arrayA[i]);
                map.put(arrayA[i],value+1);
            }
        }
        for(int i=0;i<arrayB.length;i++){
            if(map.get(arrayB[i])!=null){
                int value=map.get(arrayB[i]);
                value--;
                map.put(arrayB[i],value);     // 跟新map
                if(value==0) map.remove(arrayB[i]);
            }
        }
        return map.isEmpty();
    }

}
