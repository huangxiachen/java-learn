import java.util.Scanner;

//输入一个整数判断是否为质数
public class basic01_4 {
    public static void main(String[] args) {
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入一个整数： ");
            int x = scanner.nextInt();
            int i = 0;
            for (i = 2; i <=Math.sqrt(x) ; i++) {
                if(x%i==0) {
                    System.out.println(x+" 不是质数");
                    break;
                }
            }
            if (i>Math.sqrt(x)) {
                System.out.println(x+" 是质数");
            }
        }
    }
}
