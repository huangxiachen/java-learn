import com.sun.deploy.util.Property;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Properties;

/**
 * @description:将本地文件中的键值对读取到集合中
 * @author: Luck_chen
 * @date: 2022/11/12 20:26
 * @Version 1.0.0.0
 */
public class Demo1 {
    public static void main(String[] args) throws IOException {
        Properties pro = new Properties();
        FileWriter fw = new FileWriter("C:\\JAVA\\basicStudy\\File\\properties\\pro.properties");
        fw.write("zhangsan = 123\n");
        fw.flush();
        fw.write("lisi = lisi123");
        fw.close();
        FileReader fr = new FileReader("C:\\JAVA\\basicStudy\\File\\properties\\pro.properties");
        //保存到集合中
        pro.load(fr);
        fr.close();
        System.out.println(pro);

    }
}
