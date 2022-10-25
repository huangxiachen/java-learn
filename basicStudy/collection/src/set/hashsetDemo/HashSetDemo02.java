package set.hashsetDemo;

public class HashSetDemo02 {
    public static void main(String[] args) {

        /**
         * 哈希值：
         * 如果没有重写hashCode()方法，不同对象计算出的值是不同的
         * 如果重写了hashCode()方法，不同对象只要属性值一样，hashCode()值也一样
         * 如果没有重写hashCode()方法，不同对象计算出的值也可能相同hash碰撞
         */


        //创建对象
        Student s1 = new Student("张三",23);
        Student s2 = new Student("张三",23);


        //没有重写hashCode()方法
        System.out.println(s1.hashCode());//1163157884
        System.out.println(s2.hashCode());// 1956725890
        System.out.println("-------------------");
        //重写hashCode()方法
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        //hash碰撞
        System.out.println("abc".hashCode());
        System.out.println("acD".hashCode());




    }
}
