package fileDemo;

import java.io.File;

/**
 * @description:File类高级获取功能
 * @author: Luck_chen
 * @date: 2022/11/3 21:17
 * @Version 1.0.0.0
 * public File[] ListFiles()返回此抽象路径名表示的目录中的文件和目录的File对象数组
 *  注意点
 *      listFiles方法注意事项：
 *      当调用者不存在时，返回null
 *      当调用者是一个文件时，返回null
 *      当调用者是一个空文件夹时，返回一个长度为0的数组
 *      当调用者是一个有内容的文件夹时，将里面所有文件和文件夹的路径放在Fi数组中返回
 */
public class AccessFile {
    public static void main(String[] args) {
        //public File]listFiles()返回此抽象路径名表示的目录中的文件和目录的Fi引对象数组
        method1();
        method2();
        method3("C:\\JAVA\\basicStudy\\File\\test1\\test");
        method4();

    }

    //获取子文件名
    private static void method4() {
        File file = new File("C:\\JAVA\\basicStudy\\File");
        File[] files = file.listFiles();
        for (File f : files) {
            System.out.println(f);
        }
    }

    private static void method3(String pathname) {
        File file = new File(pathname);
        File[] files = file.listFiles();
        //null
        System.out.println(files);
    }

    private static void method2() {
        File file = new File("C:\\JAVA\\basicStudy\\File\\test1\\test.txt");
        File[] files = file.listFiles();
        //null
        System.out.println(files);
    }

    private static void method1() {
        File file = new File("C:\\JAVA\\basicStudy\\File");
        String[] list = file.list();
        for (String f : list) {
            System.out.println(f);
        }
    }
}
