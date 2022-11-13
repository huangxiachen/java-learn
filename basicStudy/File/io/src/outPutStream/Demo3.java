package outPutStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @description:字节流写数据加try..catch异常处理
 * @author: Luck_chen
 * @date: 2022/11/7 11:03
 * @Version 1.0.0.0
 */
public class Demo3 {
    public static void main(String[] args) throws FileNotFoundException {
        //1.创建字节输出流对象,设置可以往后写入数据
        FileOutputStream fop = new FileOutputStream("C:\\JAVA\\basicStudy\\File\\io\\a.txt",true);
        //2.写数据

        try {
            int a = 3/0;
            byte[] bytes1 = {97,98,99,100,101,102};
            fop.write(bytes1,0,3);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                //判断fop不为空才关闭资源
                if (fop!=null){
                    fop.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
