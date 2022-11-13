package charWriter;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @description:字符输出流
 * @author: Luck_chen
 * @date: 2022/11/11 17:25
 * @Version 1.0.0.0
 */
public class Demo1 {
    public static void main(String[] args) {
        FileWriter fileWriter = null;
        try {
          fileWriter = new FileWriter("C:\\JAVA\\basicStudy\\File\\charStream\\a.txt");
            fileWriter.write(97);
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
