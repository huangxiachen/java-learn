package extendStudy01;

public class Lecturer extends Teacher{
    public Lecturer() {
    }

    public Lecturer(String id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        System.out.println("我是"+this.getName()+"老师，我负责上课！");
    }
}
