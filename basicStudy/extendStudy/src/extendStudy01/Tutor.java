package extendStudy01;

public class Tutor extends Teacher{
    public Tutor() {
    }

    public Tutor(String id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        System.out.println("我是"+this.getName()+"助教，我负责为学生解答疑问！");
    }
}
