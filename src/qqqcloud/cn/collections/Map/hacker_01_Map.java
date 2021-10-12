package qqqcloud.cn.collections.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class hacker_01_Map {

    public static void main(String[] args) {
        show02();
    }


    private static void show02(){
        HashMap<Person, String> map = new HashMap<>();
        map.put(new Person("女王",18),"英国");
        map.put(new Person("女王",19),"美国");
        map.put(new Person("女王",18),"意大利");

        /// 1：itrator 遍历
        Set<Map.Entry<Person, String>> entries = map.entrySet();

        Iterator<Map.Entry<Person, String>> iterator = entries.iterator();

        while (iterator.hasNext()){

            Map.Entry<Person,String> entry=iterator.next();
            Person key = entry.getKey();
            String value=entry.getValue();
            System.out.println("key:"+key.toString()+"value:"+value);
        }
        /// 2：entry对象遍历
        for (Map.Entry<Person, String> entry : entries) {
            Person key=entry.getKey();
            String value=entry.getValue();
            System.out.println("key:"+key.toString()+"value:"+value);
        }

    }




}
