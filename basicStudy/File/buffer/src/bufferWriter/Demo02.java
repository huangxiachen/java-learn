package bufferWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @description:一次写一行
 * @author: Luck_chen
 * @date: 2022/11/12 16:22
 * @Version 1.0.0.0
 */
public class Demo02 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\JAVA\\basicStudy\\File\\charStream\\a.txt"));
        bw.write("今天天气好晴朗");
        bw.newLine();
        bw.write("出处处好风光");
        bw.newLine();
        bw.flush();
        bw.close();

    }
}
