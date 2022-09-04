import java.util.Scanner;

/**
 键盘录入一个大于2的整数x，计算并返回 x的平方根，结果只保留整数部分(自己实现)
 */
public class basic01_3 {
    public static void main(String[] args) {
        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入一个大于2的整数：");
            double x = scanner.nextDouble();
            if (x>2){
                for (int i = 1; i < x  ; i++) {
                    if(i*i==x) {
                        System.out.println(x + "的平方根是：" + i);
                        break;
                    }
                    if(i*i>x){
                        System.out.println(x + "的平方根是：" + (i-1));
                        break;
                    }

                }
            }else {
                System.out.println("输入错误，请重新输入！");
            }

        }


    }
}
