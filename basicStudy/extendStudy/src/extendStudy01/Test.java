/**
 * 带有继承结构的标准Javabean类
 * 在黑马程序员中有很多员工(Employee)。
 * 按照工作内容不同分教研部员工(Teacher)和行政部员工(AdminStaff)
 * 1.教研部根据教学的方式不同又分为讲师(Lecturer)和助教(Tutor)
 * 2.行政部根据负责事项不同，又分为维护专员(Maintainer),采购专员(Buyer)
 * 3.公司的每一个员工都有编号，姓名和其负责的工作
 * 4.每个员工都有工作的功能，但是具体的工作内容又不一样。
 */

package extendStudy01;
public class Test {
    public static void main(String[] args) {
        String s;
        //Teacher
        Teacher lecturer = new Lecturer("teacher001","张小花");
        s = lecturer.toString();
        System.out.println(s);
        lecturer.work();

        //Tutor
        Teacher tutor = new Tutor("Tutor001","李虎");
        s = tutor.toString();
        System.out.println(s);
        tutor.work();

        //Maintainer
        AdminStaff maintainer = new Maintainer("Maintainer001","李四");
        s = maintainer.toString();
        System.out.println(s);
        maintainer.work();

        //Buyer
        AdminStaff buyer = new Buyer("Buyer001","张三");
        s = buyer.toString();
        System.out.println(s);
        buyer.work();

    }
}
