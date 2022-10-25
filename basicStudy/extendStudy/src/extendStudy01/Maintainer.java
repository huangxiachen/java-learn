package extendStudy01;

public class Maintainer extends AdminStaff{
    public Maintainer() {
    }

    public Maintainer(String id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        System.out.println("我是维护专员："+this.getName()+",我负责维护工作");
    }
}
