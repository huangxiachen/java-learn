package printStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintWriter {
    //打印流
    public static void main(String[] args) {
        //文件路径
        String fileName = "C:" + File.separator + "JAVA" + File.separator + "basicStudy" + File.separator + "stream" + File.separator + "text2.txt";
        File file = new File(fileName);
        try {
            PrintStream printStream = new PrintStream(new FileOutputStream(file));
            printStream.println("yuo are beautiful！");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
