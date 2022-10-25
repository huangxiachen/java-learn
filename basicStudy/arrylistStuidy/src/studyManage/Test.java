
package studyManage;

import com.sun.xml.internal.org.jvnet.fastinfoset.sax.FastInfosetReader;
import studyManage.Student;

import java.util.ArrayList;
import java.util.NavigableMap;
import java.util.Scanner;
import java.util.logging.Level;

public class Test {
    public static ArrayList<Student> students = new ArrayList<>();
    //指令
    private static final String ADD_STUDENT = "1";
    private static final String DELETE_STUDENT = "2";
    private static final String UPDATE_STUDENT = "3";
    private static final String FIND_STUDENT = "4";
    private static final String EXIT = "5";

    public static void main(String[] args) {

        //登陆成功后显示功能界面
        funcShow();


    }


    public static void funcShow() {
        while (true) {
            System.out.println("-----------------欢迎来到黑马学生管理系统-----------------");
            System.out.print("1:添加学生  ");
            System.out.print("2:删除学生  ");
            System.out.print("3:修改学生  ");
            System.out.print("4:查询学生  ");
            System.out.println("5.退出  ");
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入您的选择:");
            String choose = sc.next();
            menu(choose);
        }
    }

    public static void menu(String choose) {
        //功能界面
        loop:
        switch (choose) {
            case ADD_STUDENT:
                addStu();
                traverse();
                break loop;
            case DELETE_STUDENT:
                deleteStu();
                traverse();
                break loop;
            case UPDATE_STUDENT:
                updateStu();
                break loop;
            case FIND_STUDENT:
                int index = findStu();
                if (index == -1){
                    System.out.println("查询失败，没有该学生");
                }
                break loop;
            case EXIT:
                System.exit(0);
            default:
                System.out.println("没有这个选项，请重新输入选择");
                funcShow();
        }
    }

    public static void addStu() {
        Student student = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生的id、姓名、年龄、家庭住址：");
        int id = sc.nextInt();
        while (true) {
            boolean flag = true;
            for (int i = 0; i < students.size(); i++) {
                if (id == students.get(i).getId()) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                student.setId(id);
                break;
            } else {
                System.out.println("该学生id已经存在请重新输入要添加的学生的姓名、年龄、家庭住址：");
                id = sc.nextInt();
            }
        }

        student.setName(sc.next());
        student.setAge(sc.nextInt());
        student.setAddress(sc.next());
        students.add(student);
        System.out.println("添加成功！！！");
    }

    public static Student deleteStu() {
        int index = findStu();
        if (index != -1) {
            Student student = students.get(index);
            students.remove(index);
            System.out.println("删除成功！");
            return student;
        }

        System.out.println("删除失败，没有该学生！！！");
        return null;

    }

    public static Student updateStu() {
        int index = findStu();
        if (index != -1) {
            System.out.println("请输入要修改的学生的姓名、年龄、家庭住址：");
            Scanner info = new Scanner(System.in);
            Student student = students.get(index);
            student.setName(info.next());
            student.setAge(info.nextInt());
            student.setAddress(info.next());
            System.out.println(student);
            return student;
        }
        System.out.println("修改失败，没有该学生！！！");
        return null;

    }

    public static int findStu() {
        System.out.println("请输入学生id：");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                Student student = students.get(i);
                int index = i;
                System.out.println(student);
                return index;
            }
        }
        return -1;
    }

    public static void traverse() {
        for (int i = 0; i < students.size(); i++) {
            String s = students.get(i).toString();
            System.out.println(s);
        }
    }
}


