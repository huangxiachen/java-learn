import java.io.*;

/**
 * @description:对象操作流
 * @author: Luck_chen
 * @date: 2022/11/12 19:01
 * @Version 1.0.0.0
 * 对象操作流
 * 用对象序列化流序列化了一个对象后，假如我们修改了对像所属的)vabean类，读取数据会不会出问题呢？
 * 。会出问题，会抛出InvalidClassException.异常
 * 如果出问题了，如何解决呢？
 * ·给对象所属的类加一个serialVersionUID
 * private static final long serialVersionUlD 42L;
 * 如果一个对象中的某个成员变量的值不想被序列化，又该如何实现呢？
 * ·给该成员变量加transient关键字修饰，该关键字标记的成员变量不参与序列化过程
 * 6
 */
public class Demo1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        method1();
        ObjectInputStream or = new ObjectInputStream(new FileInputStream("a.txt"));
        User user =(User) or.readObject();
        System.out.println(user);
        or.close();

    }

    private static void method1() throws IOException {
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("a.txt"));
        User user = new User("zhangsan","123");
        os.writeObject(user);
        os.close();
    }
}
