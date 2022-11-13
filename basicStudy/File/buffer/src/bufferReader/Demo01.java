package bufferReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @description:字符缓冲输入流
 * @author: Luck_chen
 * @date: 2022/11/12 16:09
 * @Version 1.0.0.0
 */
public class Demo01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\JAVA\\basicStudy\\File\\charStream\\a.txt"));
        int len;
        char [] chars = new char[1024];
        while ((len = br.read(chars))!= -1) {
            System.out.println(new String(chars,0,len));
        }
        br.close();

    }
}
