package fileExercise;

import java.io.File;
import java.util.HashMap;

/**
 * @description:练习三：统计一个文件夹中每种文件的个数并打印。
 * @author: Luck_chen
 * @date: 2022/11/4 12:23
 * @Version 1.0.0.0
 * 打印格式如下：
 * txt3个
 * doc4个
 * jpg6个
 */
public class Exercise3 {
    public static void main(String[] args) {
        File file = new File("C:\\JAVA\\basicStudy\\File\\fileClass");
        //统计一个文件夹中，每种文件出现次数
        //1.使用HashMap来存储文件种类名和文件数量
        HashMap<String, Integer> hm = new HashMap<>();
        //2.递归统计
        getCount(hm,file);
        System.out.println(hm);


    }

    private static void getCount(HashMap<String, Integer> hm, File file) {
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isFile()) {
                String[] fileNameArr = f.getName().split("\\.");
                if (fileNameArr.length == 2) {
                    String fileEndName = fileNameArr[1];
                    if(hm.containsKey(fileEndName)) {
                        //已经存在
                        Integer count = hm.get(fileEndName);
                        count++;
                        hm.put(fileEndName, count);
                    }else {
                        //不存在表示文件第一次出现
                        hm.put(fileEndName, 1);
                    }
                }

            }else {

                getCount(hm,f);
            }
        }
    }
}
