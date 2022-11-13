package exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @description:案例：复制文件
 * 需求：把"C.Witheimal\a.avi”复制到当前模块下
 * @author: Luck_chen
 * @date: 2022/11/10 17:44
 * @Version 1.0.0.0
 * 分析：
 * ①复制文件，其实就把文件的内容从一个文件中读取出来数据源，然后写入到另一个文件中（目的地）
 * ②数据源：
 * C.\Aitheima\a.avi--读数据--FilelnputStream
 * 目的地：
 * 模块名称\copy.avi--写数据--FileOutputStream
 */
public class CopyFile {
    public static void main(String[] args) throws IOException {
        //字节输入流，读数据
        FileInputStream fis = new FileInputStream("C:\\JAVA\\basicStudy\\File\\io\\av.avi");
        //字节输出流，写数据
        FileOutputStream fos = new FileOutputStream("C:\\JAVA\\basicStudy\\File\\io\\copy.avi");
        //变读边写
        int b;
        while ((b = fis.read())!= -1){
            fos.write(b);
        }
        //关闭资源
        fis.close();
        fos.close();
    }

}
