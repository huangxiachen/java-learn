package charWriter;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @description:字符输出流一次写一个字符串的一部分
 * @author: Luck_chen
 * @date: 2022/11/11 17:25
 * @Version 1.0.0.0
 */
public class Demo4 {
    public static void main(String[] args) {
        FileWriter fileWriter = null;
        try {
          fileWriter = new FileWriter("C:\\JAVA\\basicStudy\\File\\charStream\\a.txt");
            String s = "今天天气好晴朗\n，处处好风光\n";
            fileWriter.write(s,0,11);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if (fileWriter!=null){
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
