package fileWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * Writer
 */
public class WriterDemo01 {
    public static void main(String[] args) {
        //文件路径
        String fileName1 = "C:" + File.separator + "JAVA" + File.separator + "basicStudy" + File.separator + "stream" + File.separator + "text.txt";
        //文件对象
        File file = new File(fileName1);
        //字符流对象
        Writer fileWriter = null;
        try {

            fileWriter = new FileWriter(file,true);
            //输入到文件里的内容
            String content = "\r\n君不见高堂明镜悲白发";
            //写入数据
            fileWriter.write(content);
            //关闭文件
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
