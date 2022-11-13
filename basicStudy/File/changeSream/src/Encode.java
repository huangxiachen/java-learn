import java.io.*;
import java.nio.charset.Charset;


/**
 * @description:解决乱码
 * @author: Luck_chen
 * @date: 2022/11/12 18:39
 * @Version 1.0.0.0
 */
public class Encode {
    public static void main(String[] args) throws IOException {
//        method1();
        method2();
//        FileReader fr = new FileReader("C:\\JAVA\\a.txt",Charset.forName("GBK"));//JDK11之后才能用


    }

    private static void method2() throws IOException {
        InputStreamReader ip = new InputStreamReader(new FileInputStream("C:\\JAVA\\a.txt"));
        int ch;
        while ((ch = ip.read())!= -1) {
            System.out.print((char)ch);
        }
        ip.close();
        OutputStreamWriter os = new OutputStreamWriter(new FileOutputStream("C:\\JAVA\\a.txt"),"GBK");
        os.write("今天天气好晴朗");
        os.close();
    }

    private static void method1() throws IOException {
        FileReader fr = new FileReader("C:\\JAVA\\a.txt");
        int ch;
        while ((ch = fr.read())!= -1) {
            System.out.print((char)ch);
        }
        fr.close();
    }
}
