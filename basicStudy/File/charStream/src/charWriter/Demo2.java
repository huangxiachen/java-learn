package charWriter;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @description:字符输出流一次写多个字符
 * @author: Luck_chen
 * @date: 2022/11/11 17:25
 * @Version 1.0.0.0
 */
public class Demo2 {
    public static void main(String[] args) {
        FileWriter fileWriter = null;
        try {
          fileWriter = new FileWriter("C:\\JAVA\\basicStudy\\File\\charStream\\a.txt");
            char [] chars = {97,98,99,100};
            fileWriter.write(chars,0,chars.length);
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
