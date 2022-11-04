package fileExercise;

import java.io.File;

/**
 * @description:练习二：删除一个多级文件夹
 * @author: Luck_chen
 * @date: 2022/11/3 21:51
 * @Version 1.0.0.0
 */
public class Exercise2 {
    public static void main(String[] args) {
        File file = new File("C:\\JAVA\\basicStudy\\File\\aaa\\bbb");
        //创建父路径对象
        deleteDictionary(file);



    }

    private static void  deleteDictionary(File parentFile) {
        //先删除文件里面的内容
        //判断子文件夹下是否有内容
        File[] files = parentFile.listFiles();
        //有内容
        if (files!=null) {
            for (File file : files) {
                //2.判断子文件是文件夹还是文件，是文件直接删除
                if (file.isFile()) {
                    file.delete();
                }else {
                    deleteDictionary(file);
                }
            }

        }
        //没有内容或是文件了就直接删除
        parentFile.delete();
    }
}
