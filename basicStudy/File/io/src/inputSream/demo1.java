package inputSream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

/**
 * @description:字节输入流读数据
 * @author: Luck_chen
 * @date: 2022/11/7 11:08
 * @Version 1.0.0.0
 */
public class demo1 {
    public static void main(String[] args) throws IOException {
        //创建字节输入流读取数据
        FileInputStream fip = new FileInputStream("C:\\JAVA\\basicStudy\\File\\io\\a.txt");
        //读取数据，读多个数据
        int result;
        int i = 0;
        byte [] bytes = new byte[1024];
        int read = fip.read(bytes);
        System.out.println(new String(bytes));
        fip.close();

    }
}
