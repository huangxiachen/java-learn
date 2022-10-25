package binarysearch;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BinarySearch {
    /**
     * 折半查找法
     * 1,min和max表示当前要查找的范围
     * 2,mid是在min和max中间的
     * 3,如果要查找的元素在mid的左边，
     * 缩小范围时，min不变，max等于mid减1
     */
    public static void main(String[] args) {
        int[] data = {23, 56, 78, 89, 90, 91, 109, 119, 120, 169, 173, 178, 199};

        //展示数据
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "\t");
        }
        //换行
        System.out.println();
        //输入要查找的数据
        int num;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入要查找的数据：");
            num = scanner.nextInt();
            binarySearch(data, num);
        }


    }

    public static void binarySearch(int[] data, int num) {
        //查找范围的起点下标，最初为0
        int starts = 0;
        //查找范围的结尾下标，最初为data.length - 1
        int end = data.length - 1;
        //查找范围的中点下标
        int middle;
        while (true) {
            //查找范围的中点下标为(starts + end) / 2
            middle = (starts + end) / 2;
            //如果min>max了，说明查找的数据不存在
            if (starts > end){
                System.out.println("没找到");
                break;
            }
            //如果查找的数据和data[middle]的数据相等，那么输出数据和数据所在下标，结束循环
            if (num == data[middle]) {
                System.out.println(data[middle] + ",索引:" + middle);
                break;
            }
            //如果查找的数据比data[middle]的数据小，那么end就为middle-1,starts 不变
            if (num < data[middle]) {
                end = middle - 1;
                continue;
            }
            //如果查找的数据比data[middle]的数据大，那么starts就为middle+1,end不变
            if (num > data[middle]) {
                starts = middle + 1;
                continue;
            }

        }

    }

}
