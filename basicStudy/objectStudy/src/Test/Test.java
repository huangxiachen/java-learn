package Test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("enter：");
        int [] arr = new int[6];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("原数组：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println("\n");
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] + 5)%10;
            System.out.print(arr[i]);
        }
        System.out.println("\n");
        for (int i = 0; i < arr.length/2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;

        }

        System.out.print("新数组：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println("\n");
    }

}
