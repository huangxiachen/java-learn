package fileWriter;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.io.*;

public class WriterChange {
    //字符流转为字节流
    public static void main(String[] args) {
        //文件路径
        String fileName = "C:" + File.separator + "JAVA" + File.separator + "basicStudy" + File.separator + "stream" + File.separator + "text1.txt";
        //文件对象
        File file = new File(fileName);

        try {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file,true));

            String content = "弃我去者昨日之日不可留，乱我心者今日之日多烦忧";
            outputStreamWriter.write(content);
            outputStreamWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
