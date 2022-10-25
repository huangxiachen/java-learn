package fileWriter;

import java.io.*;

public class ReaderDemo01 {
    //一行全部读完
    public static void main(String[] args) {
        //文件路径
        String fileName = "C:" + File.separator + "JAVA" + File.separator + "basicStudy" + File.separator + "stream" + File.separator + "text.txt";
        //文件对象
        File file = new File(fileName);
        //字符对象
        Reader fileReader = null;
        try {
            fileReader = new FileReader(file);
            //一行全部读完
            char[] chars = new char[1024];

            int len = fileReader.read(chars);

            System.out.println(new String(chars,0,len));
            fileReader.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
