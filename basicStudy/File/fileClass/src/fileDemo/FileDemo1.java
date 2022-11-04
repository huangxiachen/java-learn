package fileDemo;

import java.io.File;

/**
 * @description:File类概述和构造方法
 * @author: Luck_chen
 * @date: 2022/11/3 18:09
 * @Version 1.0.0.0
 * question为什么要把字符串表示形式的路径转换成File对象？
 * 因为要通过file对象的方法操作文件
 * <p>
 * 1.File(String pathname) 通过将给定的路径名字符串转换为抽象路径名来创建新的File实例
 * 2.File(String parent,String child)从父路径名字符串和子路径名字符串创健新的File实例
 * 3.File(File parent,String child)从父抽象路径名和子路径名字符串创建新的File实例
 */
public class FileDemo1 {
    public static void main(String[] args) {
        // 1.File(String pathname) 通过将给定的路径名字符串转换为抽象路径名来创建新的File实例

        methd1();
        //2.File(String parent,String child)从父路径名字符串和子路径名字符串创健新的File实例
        method2();
        //3.File(File parent,String child)从父抽象路径名和子路径名字符串创建新的File实例
        method3();
    }

    private static void method3() {
        //3.File(File parent,String child)从父抽象路径名和子路径名字符串创建新的File实例
        File parent = new File("C:\\JAVA\\basicStudy\\File");
        String child = "\\test.txt";
        //File 和 String 拼接
        File file = new File(parent, child);
        System.out.println(file);
    }

    private static void method2() {
        //2.File(String parent,String child)从父路径名字符串和子路径名字符串创健新的File实例
        String path1 = "C:\\JAVA\\basicStudy\\File";
        String path2 = "test.txt";
        //拼接父路径和子路径String 和 String
        File file = new File(path1, path2);
        System.out.println(file);
    }

    private static void methd1() {
        // 1.File(String pathname) 通过将给定的路径名字符串转换为抽象路径名来创建新的File实例
        String path = "C:\\JAVA\\basicStudy\\File\\test.txt";
        File file = new File(path);
        System.out.println(file);
    }
}
