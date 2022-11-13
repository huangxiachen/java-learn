package exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

/**
 * @description:Stream流的练习
 * @author: Luck_chen
 * @date: 2022/11/6 20:49
 * @Version 1.0.0.0
 *
 * 现在有两个ArrayList集合，分别存储6名男演员和6名女演员，要求完成如下的操作
 * 男演员只要名字为3个字的前两人
 * 女演员只要姓杨的，并且不要第一个
 * 把过滤后的男演员姓名和女演员姓名合并到一起
 * 把上一步操作后的元素作为构造方法的参数创建演员对象遍历数据
 * 演员类Actor,里面有一个成员变量，一个带参构造方法，以及成员变量对应的get/set方法
 */
public class Demo1 {
    public static void main(String[] args) {
        ArrayList<String> actress = new ArrayList<>();
        Collections.addAll(actress,"杨幂","杨紫","郑爽","周雨彤","周冬雨","杨馥宇" );
        ArrayList<String> actor= new ArrayList<>();
        Collections.addAll(actor,"杨洋","林一","张彬彬","汪东城","吴尊","刘宇宁" );
        Stream<String> act1 = actress.stream().filter(name -> name.startsWith("杨")).skip(1);
        Stream<String> act2 = actor.stream().filter(name -> name.length() == 3).limit(2);
        Stream.concat(act1, act2).forEach(name-> {
            Actor actor1 = new Actor(name);
            System.out.println(actor1);

        });
    }
}
