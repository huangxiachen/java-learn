@SuppressWarnings("all")
public class AnnoDemo02 {
    @Override
    public String toString() {
        return super.toString();
    }

    @Deprecated
    public void show1() {
        System.out.println("过时方法");
    }

    public void show2() {
        System.out.println("优化方法");
    }
    public void demo() {
        show1();
    }
}
