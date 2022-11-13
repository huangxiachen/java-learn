import java.util.ArrayList;
import java.util.Collections;

/**
 * @description:Stream流的常见终结操作方法
 * @author: Luck_chen
 * @date: 2022/11/6 20:35
 * @Version 1.0.0.0
 * Stream流的常见终结操作方法
 * void forEach(Consumer action):对此流的每个元素执行操作
 * Consumer接口中的方法
 * void accept(T t):对给定的参数执行此操作
 * long count():返回此流中的元素数
 */
public class StreamDemo5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张三丰", "张无忌", "张翠山", "王二麻子", "张良", "谢广坤");
        long count = list.stream().count();
        System.out.println(count);
    }
}
