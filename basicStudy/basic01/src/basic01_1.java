import java.util.Scanner;
//输入一个数字，依次输出他每个位置的数字
public class basic01_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        System.out.println("输入一个三位数n：");
        n = scanner.nextInt();

        getEachBitFromHighestBit(n);
    }

    //统计数字的位数
    static int countNumbersOfBit(int n) {
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        return count;
    }

    //计算最高位的基数
    static int cardinalNumber(int count) {
        int tens = 1;
        for (int i = 0; i < count - 1; i++) {
            tens *= 10;
        }
        return tens;
    }

    static void getEachBitFromHighestBit(int n) {
        int tens = cardinalNumber(countNumbersOfBit(n));
        int firstbit = 0;
        do {    //缓存最后一位
            firstbit = n / tens;//除以最高位的基数就取得最高位
            System.out.println(firstbit);
//			System.out.println("nn="+nn);
            n = n - firstbit * tens;//减去最高位
            tens = tens / 10;//减去最高位后基数在减少10倍
        } while (n > 0);
    }


}