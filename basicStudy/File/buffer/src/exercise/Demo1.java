package exercise;

import java.io.*;

/**
 * @description:利用缓冲流复制文件
 * @author: Luck_chen
 * @date: 2022/11/10 21:18
 * @Version 1.0.0.0
 */
public class Demo1 {
    public static void main(String[] args) throws IOException {
        //创建字节缓冲输入流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\JAVA\\basicStudy\\File\\buffer\\av.avi"));
        //创建字节缓冲输出流
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\JAVA\\basicStudy\\File\\buffer\\copy.avi"));

        int b;
        while((b = bis.read())!= -1) {
            bos.write(b);
        }
        bis.close();
        bos.close();
    }
}
