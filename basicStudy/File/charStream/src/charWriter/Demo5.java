package charWriter;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @description:
 * flush()
 * 刷新流，还可以继续写数据
 * close()
 * 关闭流，释放资源，但是在关闭之前会先刷新流。一旦关闭，就不能再写数据
 * @author: Luck_chen
 * @date: 2022/11/12 15:45
 * @Version 1.0.0.0
 */
public class Demo5 {
    public static void main(String[] args) throws IOException {

        FileWriter fileWriter = new FileWriter("C:\\JAVA\\basicStudy\\File\\charStream\\a.txt");
        fileWriter.write("天青色等烟雨\n");
        fileWriter.flush();
        fileWriter.write("而我在等你\n");
        fileWriter.close();

    }
}
