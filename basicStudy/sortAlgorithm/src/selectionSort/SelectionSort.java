package selectionSort;

import java.util.Random;

public class SelectionSort {
    //选择排序
    public static void main(String[] args) {
        int[] arr = new int[5];
        //随机一组数据
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(101);
        }
        //排序前输出
        traverse(arr);
        selectionSort(arr);
        //排序后输出
        traverse(arr);
    }
    private static void traverse(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static void selectionSort(int[] arr) {
        int index;
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }

        }
    }
}
