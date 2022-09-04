import java.util.Random;
import java.util.Scanner;

//猜数字小游戏(随机1-100)
public class basic01_5 {
    public static void main(String[] args) {
        Random r = new Random();
        int a = r.nextInt(100)+1;
        System.out.println("a = "+a);
        int count = 1;
        while(count<=3){
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入猜的数字：");
            int x = sc.nextInt();
            if(x>a){
                System.out.println("猜大了！");

            }else if(x<a){
                System.out.println("猜小了！");

            }else if(x==a){
                System.out.println("猜中了！");
                break;
            }
            count ++;
        }
        if (count>3){
            System.out.println("次数用完了！");
        }

    }
}
