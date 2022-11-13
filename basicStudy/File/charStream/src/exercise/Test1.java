package exercise;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @description:案例：保存键盘录入的数据
 * @author: Luck_chen
 * @date: 2022/11/12 16:01
 * @Version 1.0.0.0
 * 需求：将用户键盘录入的用户名和密码保存到本地实现永久化存储。
 * 要求用户名独占一行，密码独占一行。
 * 步骤：
 * ①用户键盘录入用户名和密码
 * ②将用户名和密码写到本地文件中
 */
public class Test1 {
    public static void main(String[] args) throws IOException {
        //录入数据
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = sc.next();
        System.out.println("请输入密码：");
        String password = sc.next();
        //写入
        FileWriter fileWriter = new FileWriter("C:\\JAVA\\basicStudy\\File\\charStream\\a.txt");
        fileWriter.write(username+"\n");
        fileWriter.write(password);
        fileWriter.flush();
        fileWriter.close();

    }
}
