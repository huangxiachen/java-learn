package arrayObject01;

public class Main {
    public static void main(String[] args) {
        GameObject c1 = new GameObject("乔峰",100);
        GameObject c2 = new GameObject("鸠摩智",100);
        while (true){
            c1.hit(c2);
            if (c2.getBlood()==0) {
                System.out.println(c1.getC_Name()+"KO了"+c2.getC_Name()+"！");
                break;
            }
            c2.hit(c1);
            if (c1.getBlood()==0) {
                System.out.println(c2.getC_Name()+"KO了"+c1.getC_Name()+"！");
                break;
            }
        }


    }
}
