package fileDemo;

import java.io.File;

/**
 * @description:删除文件夹
 * @author: Luck_chen
 * @date: 2022/11/3 20:49
 * @Version 1.0.0.0
 * 删除文件
 * public boolean delete()
 *      注意点
 *          1.只能删除空文件夹和文件
 *          2.删除的文件不走回收站直接删除
 *          3.如果删除的是有内容的文件夹，需要先删除文件夹下的文件，再删除文件夹
 *
 */
public class DeleteFile {
    public static void main(String[] args) {
        File file1 = new File("C:\\JAVA\\basicStudy\\File\\test");
        //true
        boolean rs1 = file1.delete();
        File file2 = new File("C:\\JAVA\\basicStudy\\File\\test1");
        //false
        boolean rs2 = file1.delete();
        System.out.println(rs1+" " + rs2);
    }
}
