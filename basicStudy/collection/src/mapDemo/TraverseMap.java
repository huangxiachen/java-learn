package mapDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class TraverseMap {
    public static void main(String[] args) {
        /**
         * 遍历map集合的方法
         * (1)键找值map.keySet()
         * 通过迭代器/增强for 获得key,在通过get方法用key获得元素的value
         * (2)键值对map.set<entry<String,String>>
         * (3)Lambda表达式
         *
         */
        //通过迭代器/增强for 获得key,在通过get方法用key获得元素的value
        //创建map对象
        Map<String,Integer> map = new HashMap<>();
        //添加数据
        map.put("Mike", 23);
        map.put("Mary", 18);
        map.put("Kangkang", 21);
        Set<String> keys = map.keySet();
        //Iterator
        Iterator<String> iterator = keys.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            int value = map.get(key);
            System.out.println("key = " +key +","+"value =" + value);
        }
        System.out.println("---------------------------------------------");
        //增强for
        for (String key : keys) {
            int value = map.get(key);
            System.out.println(key + " "+ value);
        }
        System.out.println("---------------------------------------------");
        //Lambda表达式
        keys.forEach((String key)->{
            int value = map.get(key);
            System.out.println(key + " "+ value);
            }
        );

        //(2)键值对map.set<entry<String,String>>
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "="+value);

        }


    }
}
