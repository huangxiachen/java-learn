package bufferWriter;

import java.io.*;

/**
 * @description:字符缓冲输出流
 * @author: Luck_chen
 * @date: 2022/11/12 16:09
 * @Version 1.0.0.0
 */
public class Demo01 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\JAVA\\basicStudy\\File\\charStream\\a.txt"));
        //一次写一个字符
        bw.write(43);
        bw.write("\r\n");
        //一次写一个字符数组
        int [] arr = {97,98,99,100};
        for (int i = 0; i < arr.length; i++) {
            bw.write(arr[i] +" ");
            bw.flush();
        }
        bw.write("\r\n");
        //一次写一个字符串
        bw.write("乱我心者昨日之日不可留\r\n");
        bw.flush();

        bw.close();

    }
}
