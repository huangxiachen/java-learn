/**
 * 定义一个长度为3的数组，数组存储1~3名学生对象作为初始数据，学生对象的学号，姓名各不相同。
 * 学生的属性：学号，姓名，年龄。
 * 要求1：再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。
 * 要求2：添加完毕之后，遍历所有学生信息。
 * 要求3：通过id删除学生信息
 * 如果存在，则删除，如果不存在，则提示删除失败。
 * 要求4：删除完毕之后，遍历所有学生信息。
 * 要求5：查询数组id为"heima002”的学生，如果存在，则将他的年龄+1岁
 */

package arrayObject04;

import arrayObject03.Phone;
import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        //定义一个长度为3的数组，数组存储1~3名学生对象作为初始数据，学生对象的学号，姓名各不相同。
        Student students[] = new Student[20];
        for (int i = 0; i < 3; i++) {
            students[i] = addStudent();
        }
        //traverse(students);

        //要求1：再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。
        Student student = uniqueId(students, addStudent());
        oderStudent(students,student);
        traverse(students);

        //要求3：通过id删除学生信息
        delete(students);
        traverse(students);

    }


    //遍历
    public static void traverse(Student students[]) {
//        Student student = new Student();
        for (int i = 0; i < students.length; i++) {
//            student = students[i];
            //判空
            if (students[i]!= null){
//                String s = student.toString();
//                System.out.println(s);
                String s = students[i].toString();
                System.out.println(s);
            }
        }
    }

    //添加单个
    public static Student addStudent() {
        Student addStudent = new Student();
        System.out.println("请输入学生的学号、姓名、年龄：");
        Scanner id = new Scanner(System.in);
        addStudent.setId(id.nextInt());
        Scanner name = new Scanner(System.in);
        addStudent.setName(name.next());
        Scanner age = new Scanner(System.in);
        addStudent.setAge(age.nextInt());
        return addStudent;
    }

    //依次添加在后面
    public static void oderStudent(Student students[],Student addStudent) {

        //判断数组前面元素是否为空，不为空就加在前一个元素后面
        Student student;
        for (int i = 0; i < students.length; i++) {
            student = students[i];
            if (student == null){
                students[i+1] = addStudent;
                break;
            }
        }

    }

    //添加的时候进行学号的唯一性判断
    public static Student uniqueId(Student students[],Student addStudent) {

        //获得已有学生的学号
        Student student = new Student();
        for (int i = 0; i < students.length; i++) {
            student = students[i];
            if (student != null) {
                int id = student.getId();
                if (addStudent.getId() == id){
                    //提示学号相同
                    System.out.println("学号与前面的学生学号相同，添加失败！！！" );
                    //相同返回null
                    return null;
                }
            }
        }
        //不相同返回要添加的学生
        return addStudent;
    }

    //要求3：通过id删除学生信息
    public static void delete(Student students[]) {

        //输入要删除的学生学号
        System.out.println("请输入要删除的学生的学号：");
        Scanner idScanner = new Scanner(System.in);
        int id = idScanner.nextInt();
        //先查找数组里面有没有要删除的学生的id
        Student student = new Student();
        for (int i = 0; i < students.length; i++) {
            student = students[i];
            if (students[i].getId() == id) {
                student = null;
                students[i] = student;
                break;
            }else {
                System.out.println("删除失败！！！");
            }
        }

    }

    //查询






}
