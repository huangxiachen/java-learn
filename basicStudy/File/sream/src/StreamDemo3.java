import java.util.ArrayList;
import java.util.Collections;

/**
 * @description:Stream流的常见中间操作方法
 * @author: Luck_chen
 * @date: 2022/11/6 20:20
 * @Version 1.0.0.0
 * Stream流的常见中间操作方法
 * Stream<T>filter(Predicate predicate):用于对流中的数据进行过滤
 * Predicate接口中的方法
 * boolean test(T t):对给定的参数进行判断，返回一个布尔值
 */
public class StreamDemo3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张三丰", "张无忌", "张翠山", "王二麻子", "张良", "谢广坤");
        list.stream().filter(s->s.startsWith("张")).forEach(s-> System.out.println(s));

    }
}
