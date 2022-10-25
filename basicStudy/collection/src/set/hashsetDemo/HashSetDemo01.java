package set.hashsetDemo;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

public class HashSetDemo01 {
    public static void main(String[] args) {

        /**
         * set集合的特点 :无序不重复无索引
         * 遍历set集合的方式
         * 迭代器
         * 增强for
         * Lambda表达式
         */

        //多态创建
        Set<String> s = new HashSet<>();
        s.add("张三");//成功
        s.add("张三");//失败，不能添加重复的
        s.add("李四");
        s.add("王五");
        //打印集合(无序)
        System.out.println(s);
        //迭代器
        Iterator<String> iterator = s.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.print(next +" ");
        }
        System.out.println();
        System.out.println("----------------------------------");

        //增强for
        for (String s1 : s) {
            System.out.print(s1+" ");
        }
        System.out.println();
        System.out.println("----------------------------------");
        //lambda表达式
        s.forEach((String str) ->{
            System.out.print(str+" ");
            }
        );


    }
}
