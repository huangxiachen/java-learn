package mapDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class mapDemo02 {
    public static void main(String[] args) {
        /**
         * 需求：
         * 创建一个HashMap集合，键是学生对象，值是籍贯
         * 存储三个键值对元素，并遍历
         * 要求：同姓名，同年龄认为是一个学生
         */

        Map<Student,String> students = new HashMap<>();
        students.put(new Student("张三",23), "重庆");
        students.put(new Student("李四",23), "湖北");
        students.put(new Student("王五",23), "浙江");
        //遍历
        Set<Map.Entry<Student, String>> entries = students.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            Student key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key.toString() + "="+value);

        }



    }
}
