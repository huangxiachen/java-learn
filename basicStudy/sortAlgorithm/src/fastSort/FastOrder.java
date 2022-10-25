package fastSort;

import java.util.Random;

public class FastOrder {
    //快速排序
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(101);
        }
        //排序前
        traverse(arr);
        fastOrder(arr, 0, arr.length - 1);
        //排序后
        traverse(arr);

    }

    private static void fastOrder(int[] arr, int i, int j) {
        //排序起始下标
        int start = i;
        //排序结尾下标
        int end = j;
        if (end < start) {
            return;
        }
        //基数
        int baseNum = arr[i];

        //寻找基数的位置
        while (start != end) {
            //把右边的小于基数的数换到左边
            while (true) {
                if (end <= start || arr[end] < baseNum) {
                    break;
                }
                end--;
            }

            //把左边的大于基数的数换到右边
            while (true) {
                if (end <= start || arr[start] > baseNum) {
                    break;
                }
                start++;
            }
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        //基数归位
        int temp = arr[i];
        arr[i] = arr[end];
        arr[end] = temp;

        //右边调用自己继续寻找基数，前后交换
        fastOrder(arr, i, start - 1);
        //左边调用自己继续寻找基数，前后交换
        fastOrder(arr, start + 1, j);

    }

    private static void traverse(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
