package fileDemo;

import java.io.File;
import java.io.IOException;

/**
 * @description:File类创建功能
 * @author: Luck_chen
 * @date: 2022/11/3 20:14
 * @Version 1.0.0.0
 * 1.public boolean createNewFile()创建一个新的空的文件
 *    注意点
 *      1.如果文件存在，那么创建失败
 *      2.如果文件不存在，那么创建成功
 *      3.只能创建文件，无论文件有没后缀名
 *  2.public boolean mkdir()创建一个单级文件夹
 *      注意点
 *      1.只能创建单击文件夹
 *      2.无论文件夹有没有后缀名只能创建单击文件夹
 *
 * 3.publicboolepn mkdirs()创建一个多级文件夹
 *      注意点
 *          1.只能创建文件夹
 *          2，既可以创建单级文件夹
 *          3.又可以创建多级文件夹
 */
public class CreateFile {
    public static void main(String[] args) throws IOException {
//        method1();
//        method2();
        //publicboolepn mkdirs()创建一个多级文件夹
        method3();

    }

    private static void method3() {
        File file1 = new File("C:\\JAVA\\basicStudy\\File\\test");
        //true
        boolean rs1 = file1.mkdirs();
        File file2 = new File("C:\\JAVA\\basicStudy\\File\\test1\\test1");
        //false
        boolean rs2 = file2.mkdirs();
        //true
        File file3 = new File("C:\\JAVA\\basicStudy\\File\\test2.txt");
        boolean rs3 = file3.mkdirs();
        System.out.println(rs1+" "+rs2+" "+rs3);
    }

    private static void method2() throws IOException {
        //public boolean mkdir()创建一个单级文件夹
        File file1 = new File("C:\\JAVA\\basicStudy\\File\\test");
        //true
        boolean rs1 = file1.mkdir();
        File file2 = new File("C:\\JAVA\\basicStudy\\File\\test1\\test1");
        //false
        boolean rs2 = file2.mkdir();
        //true
        File file3 = new File("C:\\JAVA\\basicStudy\\File\\test2.txt");
        boolean rs3 = file3.mkdir();
        System.out.println(rs1+" "+rs2+" "+rs3);
    }

    private static void method1() throws IOException {
        //public boolean createNewFile()创建一个新的空的文件
            /*注意点
                1.如果文件存在，那么创建失败
                2.如果文件不存在，那么创建成功
                3.只能创建文件，无论文件有没后缀名
             */
        File file1 = new File("C:\\JAVA\\basicStudy\\File\\test.txt");
        //false
        boolean result1 = file1.createNewFile();
        File file2 = new File("C:\\JAVA\\basicStudy\\File\\test1.txt");
        //true
        boolean result2 = file2.createNewFile();
        //没有后缀名的文件
        File file3 = new File("C:\\JAVA\\basicStudy\\File\\test2");
        boolean result3 = file3.createNewFile();
        System.out.println(result1+" "+result2+" "+result3);
    }
}
