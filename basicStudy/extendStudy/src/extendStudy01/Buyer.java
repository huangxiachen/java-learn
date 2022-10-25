package extendStudy01;

public class Buyer extends AdminStaff{
    public Buyer() {
    }

    public Buyer(String id, String name) {
        super(id, name);
    }
    @Override
    public void work() {
        System.out.println("我是采购专员："+this.getName()+",我负责采购工作");
    }
}
