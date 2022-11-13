package outPutStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @description:字节流写数据的3种方式
 * @author: Luck_chen
 * @date: 2022/11/7 9:05
 * @Version 1.0.0.0
 * void write(int b)一次写一个字节数据
 * void write(byte[] b)一次写一个字节数组数据
 * void write(byte[]b,int off,int len)一次写一个字节数组的部分数据
 */
public class Demo2 {
    public static void main(String[] args) throws FileNotFoundException {
        //1.创建字节输出流对象,设置可以往后写入数据
        FileOutputStream fop = new FileOutputStream("C:\\JAVA\\basicStudy\\File\\io\\a.txt",true);
        //2.写数据

        try {
            fop.write(97);
//            1.void write(int b)一次写一个字节数据
//            void write(byte[] b)一次写一个字节数组数据
            byte[] bytes = "\n红豆生南国,春来发几枝\n".getBytes();

            fop.write(bytes);
//            void write(byte[]b,int off,int len)一次写一个字节数组的部分数据
            byte[] bytes1 = {97,98,99,100,101,102};
            fop.write(bytes1,0,3);
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
