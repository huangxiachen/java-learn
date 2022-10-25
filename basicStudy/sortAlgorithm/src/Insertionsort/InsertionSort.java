package Insertionsort;

import java.util.Random;

public class InsertionSort {
    //插入排序
    public static void main(String[] args) {
        int[] arr = new int[10];
        //随机一组数据
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(101);
        }
        //排序前输出
        traverse(arr);
        insertSort(arr);
        //排序后输出
        traverse(arr);

    }

    private static void traverse(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static void insertSort(int[] arr) {
        int index;
        int temp;
        for (int i = 1; i < arr.length; i++) {
            index = i;
            while (index > 0 && arr[index] < arr[index - 1]) {
                temp = arr[index];
                arr[index] = arr[index - 1];
                arr[index - 1] = temp;
                index--;
            }

        }
    }
}
