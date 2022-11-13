package charReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @description:字符输入流 读一个字符
 * @author: Luck_chen
 * @date: 2022/11/12 15:50
 * @Version 1.0.0.0
 */
public class Demo01 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("C:\\JAVA\\basicStudy\\File\\charStream\\a.txt");
        int ch;
        while ((ch = fileReader.read())!= -1) {
            System.out.println((char)ch);
        }
        fileReader.close();
    }
}
