package extendStudy;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Person person = new Person();
        //年龄为30岁的老王养了一只黑颜色的2岁的狗
        //2岁的黑颜色的狗两只前腿死死的抱住骨头猛吃
        person = new Person("老王",30);
        animal = new Dog(2,"黑颜色");
        person.keepPet(animal, "骨头");

        //年龄为25岁的老李养了一只灰颜色的3岁的猫
        //3岁的灰颜色的猫眯着眼睛侧着头吃鱼
        person = new Person("老李",25);
        animal = new Cat(3,"灰颜色");
        person.keepPet(animal, "鱼");

    }
}
