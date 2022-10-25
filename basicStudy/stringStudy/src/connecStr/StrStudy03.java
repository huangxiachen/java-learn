/**
 * 转换罗马数字
 * 键盘录入一个字符串，
 * 要求1：长度为小于等于9
 * 要求2：只能是数字
 * 将内容变成罗马数字
 * 下面是阿拉伯数字跟罗马数字的对比关系：
 * 1-1、IⅡ-2、川-3、V-4、V-5、V1-6、VIl-7、VlⅧ-8、IX-9
 * 注意点：
 * 罗马数字里面是没有0的
 * 如果键盘录入的数字包含0，可以变成””（长度为0的字符串）
 */
package connecStr;

import java.util.Scanner;

public class StrStudy03 {

    public static void main(String[] args) {
        //键盘录入一个字符串，长度为小于等于9
        String str = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个长度小于9的数字字符串：");
        while (true) {
            str = sc.next();
            boolean flag = true;
            if (str.length() > 9) {
                System.out.println("输入的成字符串长度错误请重新输入！！！");
                continue;
            }
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (c - '0' < 0 || c - '0' > 9) {
                    flag = false;
                    System.out.println("输入的字符串不全是数字请重新输入！！");
                }
            }
            if (flag) {

                break;
            }
        }
        //将内容变成罗马数字,如果键盘录入的数字包含0，可以变成””（长度为0的字符串）(Ⅰ-1、Ⅱ-2 Ⅲ-3、Ⅳ-4、V-5、Ⅵ-6、Ⅶ-7、Ⅷ-8、Ⅸ-9)
        String roman[] = {"Ⅰ ","Ⅱ","Ⅲ ","Ⅳ ","Ⅴ ","Ⅵ ","Ⅶ ","Ⅷ ","Ⅸ "};
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c - '0' == 0) {
                break;
            }
            if (c -'0' == (i+1)) {
                newStr = newStr.append(roman[i]);
            }
        }
        System.out.println(str);
        System.out.println(newStr);

    }

}
