/**
 * 属性：姓名，年龄
 * 行为：keepPet(Dogdog,String something)方法
 * 功能：喂养宠物狗，something表示喂养的东西
 * 行为：keepPet(Catcat,String something)方法
 * 功能：喂养宠物猫，something表示喂养的东西
 * 生成空参有参构造，set和get方法
 */

package extendStudy;

import java.security.DigestException;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Person{name = " + name + ", age = " + age + "}";
    }

    //喂养宠物狗，something表示喂养的东西
    public void keepPet(Animal animal,String something){

        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            System.out.println("年龄为"+this.getAge()+"岁的"+this.name+"养了一只"+dog.getColor()+"的"+dog.getAge()+"岁的狗");
            dog.eat(something);
        }else if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            System.out.println("年龄为"+this.getAge()+"岁的"+this.name+"养了一只"+cat.getColor()+"的"+cat.getAge()+"岁的猫");
            cat.eat(something);
        }
    }

}
