package qqqcloud.cn.collections.Map;

import java.util.HashMap;

public class hacker_03_Map {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("name", "cookie");
        map.put("age", "18");
        map.put("sex", "女");
        String name = map.getOrDefault("name", "random");
        System.out.println(name);// cookie，map中存在name,获得name对应的value
        String score = map.getOrDefault("score", "80");
        System.out.println(score);// 80，map中不存在score,使用默认值80
    }

}
