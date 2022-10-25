/**
 * 用户登录
 * 需求：已知正确的用户名和密码，请用程序实现模拟用户登录。
 * 总共给三次机会，登录之后，给出相应的提示
 */

package string01;

import javax.lang.model.element.NestingKind;
import java.util.Objects;
import java.util.Scanner;

public class Log {
    public static void main(String[] args) {
        String uName = "mike";
        String uPassw = "guoyitao123";
        //输入用户名密码
        Scanner name = new Scanner(System.in);
        Scanner passW = new Scanner(System.in);
        int i ;
        for ( i = 1; i <= 3 ; i++) {
            System.out.println("请输入用户名：");
            String s1 = name.next();
            System.out.println("请输入用户密码：");
            String s2 = passW.next();
            //判断输入次数
            if (i==3) {
                System.out.println("输入错误超过三次，登陆失败！！！");
                break;
            }
            //判断输入内容
            if (uName.equals(s1)&&uPassw.equals(s2)) {
                System.out.println("log in successful!!!");
                break;
            }else {
                System.out.println("用户名或密码输入错误，请再次输入！！！");
            }
        }

    }

}
