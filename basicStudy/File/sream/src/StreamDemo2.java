import java.util.*;
import java.util.stream.Stream;

/**
 * @description:Stream流思想
 * @author: Luck_chen
 * @date: 2022/11/4 15:35
 * @Version 1.0.0.0
 * Stream流的三类方法
 * 获取Stream流
 * (1)单列集合
 *      可以使用Collection接口中的默认方法stream()生成流
 * default Stream<E>stream()
 * (2)双列集合
 *      间接的生成流
 * 可以先通过keySet或者entrySet获取一个Set集合，再获取Stream流
 * (4)数组
 *      Arrays中的静态方法stream生成流
 * (5)同种数据类型的多个数据

 */
public class StreamDemo2 {
    public static void main(String[] args) {
        //(1)单列集合
        // *      可以使用Collection接口中的默认方法stream()生成流
        method1();
        System.out.println();
//        (2)双列集合
//        间接的生成流
//        可以先通过keySet或者entrySet获取一个Set集合，再获取Stream流
        method2();
        System.out.println();
//        (4)数组
//           Arrays中的静态方法stream生成流
        method3();
        System.out.println();
//        (5)同种数据类型的多个数据Strem.of()
        Stream.of(1,2,3,4).forEach(s-> System.out.print(s+"\t"));
        System.out.println();


    }

    private static void method3() {
        int [] arr = {1,2,3,3};
        Arrays.stream(arr).forEach(s-> System.out.print(s+"\t"));
    }

    private static void method2() {
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("zhangsan", 23);
        hashMap.put("lisi", 22);
        hashMap.put("wangwu", 21);
        hashMap.keySet().stream().forEach(s-> System.out.print(s+"\t"));
        hashMap.entrySet().stream().forEach(s-> System.out.print(s+"\t"));
    }

    private static void method1() {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "aaa","bbb","ccc");
        list.stream().forEach(s-> System.out.print(s+"\t"));


    }

}
