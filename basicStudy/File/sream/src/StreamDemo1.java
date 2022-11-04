import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * @description:体验Stream流
 * @author: Luck_chen
 * @date: 2022/11/4 15:10
 * @Version 1.0.0.0
 * <p>
 * 需求：按照下面的要求完成集合的创建和遍历
 * 创建一个集合，存储多个字符串元素
 * “张三丰"，“张无忌”，"张翠山“，“王二麻子"，"张良“，“谢广坤"
 * 把集合中所有以"张"开头的元素存储到一个新的集合
 * 把"张"开头的集合中的长度为3的元素存储到一个新的集合
 * 遍历上一步得到的集合
 */
public class StreamDemo1 {
    public static void main(String[] args) {
        //集合方法
        method1();
        //stream流
        method2();


    }

    private static void method2() {
        //stream流
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张三丰", "张无忌", "张翠山", "王二麻子", "张良", "谢广坤");
        list.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).forEach(s -> System.out.println(s));
    }

    private static void method1() {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张三丰", "张无忌", "张翠山", "王二麻子", "张良", "谢广坤");
        //把集合中所有以"张"开头的元素存储到一个新的集合
        ArrayList<String> list2 = new ArrayList<>();
        for (String s : list) {
            if (s.startsWith("张")) {
                list2.add(s);
            }
        }
        //把"张"开头的集合中的长度为3的元素存储到一个新的集合
        ArrayList<String> list3 = new ArrayList<>();
        for (String s : list2) {
            if (s.length() == 3) {
                list3.add(s);
            }
        }
        System.out.println(list3);
    }

}
