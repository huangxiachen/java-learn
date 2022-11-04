package fileExercise;

import java.io.File;
import java.io.IOException;

/**
 * @description:练习一：在当前模块下的aaa文件夹中创健一个a.txt文件
 * @author: Luck_chen
 * @date: 2022/11/3 21:34
 * @Version 1.0.0.0
 * 注意点
 *      如果路径中的文件夹不存在，就无法在那个文件夹中创建文件
 */
public class Exercise1 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\JAVA\\basicStudy\\File\\aaa");
        //如果文件不存在就先创建文件
        if (!file.exists()) {
            file.mkdir();
        }
        File file1 = new File(file, "a.txt");
        boolean rs = file1.createNewFile();
        System.out.println(rs);
    }

}
