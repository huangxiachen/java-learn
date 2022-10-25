package mapDemo;

import java.util.HashMap;
import java.util.Map;

public class MapDemo01 {
    public static void main(String[] args) {
        //创建map对象
        Map<String,Integer> map = new HashMap<>();
        //添加数据
        map.put("Mike", 23);
        map.put("Mary", 18);
        map.put("Kangkang", 21);
        System.out.println(map);

        //是否包含键containsKey()方法
        boolean keyResult = map.containsKey("Mary");
        System.out.println(keyResult);//true
        //是否包含value值
        boolean valueResult = map.containsValue(23);
        System.out.println(valueResult);//true

        //删除一对键值对
        map.remove("Mike");
        System.out.println(map);
        //清空所有元素
        map.clear();
        System.out.println(map);

    }
}
