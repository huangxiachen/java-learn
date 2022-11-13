package exercise;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @description:案例：复制文件,使用数组(一次读len个字节，并写入len个字节，每读一次覆盖上一次读的，因为上次的已经写入了)
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
public class CopyFile2 {
    public static void main(String[] args) throws IOException {
        //字节输入流，读数据
        FileInputStream fis = new FileInputStream("C:\\JAVA\\basicStudy\\File\\io\\av.avi");
        //字节输出流，写数据
        FileOutputStream fos = new FileOutputStream("C:\\JAVA\\basicStudy\\File\\io\\copy2.avi");
        //变读边写
        byte[] bytes = new byte[1024];
        int len;//读的字节数
        while ((len = fis.read(bytes))!= -1){
            fos.write(bytes,0,len);
        }
        //关闭资源
        fis.close();
        fos.close();
    }

}
