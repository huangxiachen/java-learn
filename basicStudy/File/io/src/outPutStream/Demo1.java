package outPutStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @description:字节流写数据
 * @author: Luck_chen
 * @date: 2022/11/7 8:58
 * @Version 1.0.0.0
 *
 * ①创建字节输出流对象。
 * 注意事项：
 * 如果文件不存在，就创健。
 * 如果文件存在就清空。
 * ② 写数据
 * 注意事项：
 * 写出的整数，实际写出的是整数在码表上对应的字母。
 * 释放资源
 * 注意事项：
 * 每次使用完流必须要释放资源。
 */
public class Demo1 {
    public static void main(String[] args) throws FileNotFoundException {
        //1.创建字节输出流的对象
        FileOutputStream fop = new FileOutputStream("C:\\JAVA\\basicStudy\\File\\io\\a.txt");
        //2.写数据
        String str = "春江水暖鸭先知";
        byte[] bytes = str.getBytes();
        try {
            fop.write(bytes);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                fop.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
