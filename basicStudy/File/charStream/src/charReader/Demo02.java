package charReader;

import java.io.FileReader;
import java.io.IOException;

/**
 * @description:字符输入流 读一行
 * @author: Luck_chen
 * @date: 2022/11/12 15:50
 * @Version 1.0.0.0
 */
public class Demo02 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("C:\\JAVA\\basicStudy\\File\\charStream\\a.txt");
        int len;
        char [] chars = new char[1024];
        while ((len = fileReader.read(chars))!= -1) {
            System.out.println(new String(chars,0,len));
        }
        fileReader.close();
    }
}
