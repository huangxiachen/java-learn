package basicArrayList;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 添加数字并遍历
 * 需求：定义一个集合，添加数字，并进行遍历。
 * 遍历格式参照：[元素1，元素2，元素3]。
 */
public class Study02 {
    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字：");
        for (int i = 0; i < 3 ; i++) {
            ints.add(sc.nextInt());
        }
        //输出
        String s = ints.toString();
        System.out.println(s);
    }
}
