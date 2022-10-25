package bublleSort;

import java.util.Random;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[4];
        //随机一组数据
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(101);
        }
        //排序前输出
        traverse(arr);
        bubbleSort(arr);
        //排序后输出
        traverse(arr);


    }

    private static void traverse(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static void bubbleSort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j + 1] < arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
    }
}
