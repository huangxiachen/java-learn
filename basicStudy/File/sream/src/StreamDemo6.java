import java.util.ArrayList;
import java.util.List;

/**
 * @description:Stream流的收集操作
 * @author: Luck_chen
 * @date: 2022/11/6 20:44
 * @Version 1.0.0.0
 * Stream流的收集操作
 * 需求：过滤元素并遍历集合
 * 定义一个集合，并添加一些整数1,2,3,4,5,6,7,8,9,10
 * 将集合中的奇数删除，只保留偶数。
 * 遍历集合得到2,4,6,8,10
 * 结论：在Stream流中无法直接修改集合，数组等数据源中的数据。
 */
public class StreamDemo6 {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();
        for (int i =1; i <= 10; i++) {
            list.add(i);
        }
        list.stream().filter(num->num%2==0).forEach(num-> System.out.print(num+"\t"));
        System.out.println();
        System.out.println("===============");
        list.stream().forEach(num-> System.out.print(num+"\t"));
        System.out.println();



    }

}
