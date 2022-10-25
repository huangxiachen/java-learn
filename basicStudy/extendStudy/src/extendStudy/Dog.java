package extendStudy;

public class Dog extends Animal{
    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }

    //看家LookHome方法（无参数）
    public void lookHome() {
        System.out.println("看家");
    }

    //2岁的黑颜色的狗两只前腿死死的抱住骨头猛吃
    @Override
    public void eat(String something) {
        System.out.println(this.getAge()+"岁的"+this.getColor()+"的狗两只前腿死死地抱住"+something+"猛吃");
    }
}
