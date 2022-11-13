import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @description:对象操作流练习
 * @author: Luck_chen
 * @date: 2022/11/12 19:42
 * @Version 1.0.0.0
 */
public class Demo2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("a.txt"));
        Student s1 = new Student("zhangsan",16);
        Student s2 = new Student("lisi",16);
        Student s3 = new Student("wangwu",16);
        ArrayList<Student> list = new ArrayList<>();
        Collections.addAll(list, s1,s2,s3);
        os.writeObject(list);
        os.close();
        ObjectInputStream or = new ObjectInputStream(new FileInputStream("a.txt"));

        ArrayList<Student> Studentlist = (ArrayList<Student>) or.readObject();
        for (Student student : Studentlist) {
            System.out.println(student);

        }
        or.close();


    }
}
