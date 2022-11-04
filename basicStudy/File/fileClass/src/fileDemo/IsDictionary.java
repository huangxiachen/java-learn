package fileDemo;

import java.io.File;

/**
 * @description:File类判断和获取功能
 * @author: Luck_chen
 * @date: 2022/11/3 20:57
 * @Version 1.0.0.0
 * 1.public boolean isDirectory()测试此抽象路径名表示的File是否为目录
 * 2.public boolean isFile()测试此抽象路径名表示的File是否为文件
 * 3.public boolean exists()测试此抽象路径名表示的File是否存在
 * 4.public String getName()返回由此抽象路径名表示的文件或目录的名称
 *  注意点
 *      1.如果路径是文件，那么获取的是文件的名字
 *      2.如果路径是文件夹，那么获取的是文件夹的名字
 *      3.即使文件不存在，但是也能获取名字
 */
public class IsDictionary {
    public static void main(String[] args) {
        //public boolean isDirectory()测试此抽象路径名表示的File是否为目录
//        method1();
//        method2();
//        method3();
        method4();
    }

    private static void method4() {
        //public String getName()返回由此抽象路径名表示的文件或目录的名称
        File file1= new File("C:\\JAVA\\basicStudy\\File\\test1");
        String name1 = file1.getName();
        File file2= new File("C:\\JAVA\\basicStudy\\File\\test1\\test.txt");
        String name2 = file2.getName();
        File file3 = new File("C:\\JAVA\\basicStudy\\File\\tes3");
        String name3 = file3.getName();
        System.out.println(name1+" "+name2+" " +name3);
    }

    private static void method3() {
        //public boolean exists()测试此抽象路径名表示的File是否存在
        File file = new File("C:\\JAVA\\basicStudy\\File\\test1");
        //true
        boolean rs = file.exists();
        boolean rs2 = file.isAbsolute();
        System.out.println(rs+ " "+rs2);
    }

    private static void method2() {
        //public boolean isFile()测试此抽象路径名表示的File是否为文件
        File file = new File("C:\\JAVA\\basicStudy\\File\\test1");
        //true
        boolean rs1 = file.isDirectory();
        //false
        boolean rs2 = file.isFile();
        System.out.println(rs1+" "+rs2);
    }

    private static void method1() {
        File file = new File("C:\\JAVA\\basicStudy\\File\\test1");
        //false
        boolean rs1 = file.isFile();
        //true
        boolean rs2 = file.isDirectory();
        System.out.println(rs1+" "+rs2);
    }
}
