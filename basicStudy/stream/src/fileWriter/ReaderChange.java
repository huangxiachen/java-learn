package fileWriter;


import java.io.*;

public class ReaderChange {
    public static void main(String[] args) {
        //文件路径
        String fileName = "C:" + File.separator + "JAVA" + File.separator + "basicStudy" + File.separator + "stream" + File.separator + "text1.txt";
        //文件对象
        File file = new File(fileName);
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file));
            //一行全部读完
            char[] chars = new char[1024];

            int len = inputStreamReader.read(chars);

            System.out.println(new String(chars,0,len));
            inputStreamReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
