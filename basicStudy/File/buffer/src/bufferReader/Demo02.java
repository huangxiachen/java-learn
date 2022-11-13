package bufferReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @description:一次读一行
 * @author: Luck_chen
 * @date: 2022/11/12 16:09
 * @Version 1.0.0.0
 */
public class Demo02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\JAVA\\basicStudy\\File\\charStream\\a.txt"));
       String line;
       while((line = br.readLine())!=null) {
           System.out.println(line);
       }
        br.close();
    }
}
