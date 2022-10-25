package fileWriter;

import java.io.*;

public class ReaderDemo02 {
    //单个字符的读
    public static void main(String[] args) {
        //文件路径
        String fileName = "C:" + File.separator + "JAVA" + File.separator + "basicStudy" + File.separator + "stream" + File.separator + "text.txt";
        //文件对象
        File file = new File(fileName);
        //字符对象
        Reader fileReader = null;
        //字符数组
        char[] chars = new char[1024];
        try {
            fileReader = new FileReader(file);
            int temp = 0;
            int len = 0;
            while ((temp = fileReader.read()) != -1) {
                chars[len++] = (char)temp;
            }
            System.out.println(new String(chars,0,len));
            //关闭流资源
            fileReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
