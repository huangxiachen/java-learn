import javax.lang.model.element.VariableElement;
import java.io.File;

/**
 * @description:访问文件和目录
 * @author: Luck_chen
 * @date: 2022/11/3 17:35
 * @Version 1.0.0.0
 * 1.访问文件相关方法
 * String getName():返回此File对象所表示的文件名或路径名（如果是路径则返回最后一级子路径名）
 *
 *
 *
 */

public class FileAndDictionary {
    public static void main(String[] args) {
        //以当前路径创建一个File对象
        File file = new File("abc");
        System.out.println(file.getName());

    }

}
