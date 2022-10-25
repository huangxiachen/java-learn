package basicArrayList;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 添加字符串
 */
public class Sudy01 {
    public static void main(String[] args) {
        //添加字符串
        ArrayList<String> strs = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        for (int i = 0; i < 3 ; i++) {
            strs.add(sc.next());
        }
        //输出
        System.out.print("[");
        for (int i = 0; i < strs.size(); i++) {
            if (i == strs.size() - 1){
                System.out.print(strs.get(i));
                break;
            }
            System.out.print(strs.get(i)+",");
        }
        System.out.print("]"+"\n");



    }
}
