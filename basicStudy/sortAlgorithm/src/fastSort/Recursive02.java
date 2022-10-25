package fastSort;

public class Recursive02 {
    //求5的阶层
    public static void main(String[] args) {
        int num = 5;
        int result;
        result = recursive(num);
        System.out.println(result);

    }

    public static int recursive(int num) {
        if (num == 1)
            return 1;
        return num * recursive(num - 1);
    }
}
