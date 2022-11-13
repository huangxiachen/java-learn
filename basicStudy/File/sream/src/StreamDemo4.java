import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

/**
 * @description:Stream流的常见中间操作方法
 * @author: Luck_chen
 * @date: 2022/11/6 20:25
 * @Version 1.0.0.0
 */
public class StreamDemo4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张三丰", "张无忌", "张翠山", "王二麻子", "张良", "谢广坤");
//        Stream<T>limit(long maxSize):截取指定参数个数的数据
        list.stream().limit(3).forEach(s-> System.out.print(s+"\t"));
        System.out.println();
//        Stream<T>skip(long n):跳过指定参数个数的数据
        list.stream().skip(3).forEach(s-> System.out.print(s+"\t"));
        System.out.println();
//        static<T>Stream<T>concat(Stream a,Stream b)两个流合并为一个流
        Stream<String> strem2 = list.stream().limit(3);
        Stream.concat(list.stream(), strem2).forEach(s-> System.out.print(s+"\t"));
        System.out.println();
//        Stream<T>distinct():去除流中重复的元素。依赖(hashCode和equals方法)
        ArrayList<Integer> list1 = new ArrayList<>();
        Collections.addAll(list1, 1,1,1,2,4,563,747);
        list1.stream().distinct().forEach(s-> System.out.print(s+"\t"));
        System.out.println();

    }
}
