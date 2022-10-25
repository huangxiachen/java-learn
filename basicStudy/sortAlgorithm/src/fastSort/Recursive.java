package fastSort;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.Scanner;

public class Recursive {
    public static void main(String[] args) {
        //递归计算1~100之间的和
        int num = 100;
        int result = recursive(num);
        System.out.println(result);
    }

    private static int recursive(int num) {
        if (num == 1)
            return 1;
        return num + recursive(num -1);
    }
}
