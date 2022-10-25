/**
 * 调整字符串
 * 给定两个字符串，A和B。
 * A的旋转操作就是将A最左边的字符移动到最右边。
 * 例如，若A='abcde',在移动一次之后结果就是'bcdea'。
 * 如果在若干次调整操作之后，A能变成B,那么返回True。
 * 如果不能匹配成功，则返回false
 */

package connecStr;

import java.util.Scanner;

public class StrStudy04 {
    public static void main(String[] args) {
        //给定两个字符串，A和B。
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个字符串：");
        String str1 = sc.next();
        String str2 = sc.next();
        boolean flag = changeStr(str1, str2);
        if (flag){
            System.out.println("匹配成功！！！");
        }else {
            System.out.println("匹配失败！！！");
        }
    }
    public static boolean changeStr(String str1,String str2) {

        //例如，若A='abcde',在移动一次之后结果就是'bcdea'。
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(0);
            String end = str1.substring(1);
            str1 = end+c;
//            System.out.println(str1);
            if (str2.equals(str1)) {
                return true;
            }
        }
        return false;
    }
}
