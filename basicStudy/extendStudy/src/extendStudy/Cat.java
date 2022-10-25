package extendStudy;

public class Cat extends Animal{
    public Cat() {

    }

    public Cat(int age, String color) {
        super(age, color);
    }

    //逮老鼠catchMouse方法（无参数）
    public void catMouse() {
        System.out.println("捉老鼠");
    }



    //3岁的灰颜色的猫眯着眼睛侧着头吃鱼
    @Override
    public void eat(String something) {
        System.out.println(this.getAge()+"岁的"+this.getColor()+"的猫眯着眼睛侧着头吃"+something);
    }
}
