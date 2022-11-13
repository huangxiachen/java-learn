package exercise;

import java.io.*;
import java.util.Arrays;

/**
 * @description: 案例：读取文件中的数据排序后再次写到本地
 * 需求：读取文件中的数据，排序后再次写到本地文件
 * 步骤：
 * 读取数据
 * 将数据排序
 * @author: Luck_chen
 * @date: 2022/11/12 16:42
 * @Version 1.0.0.0
 */
public class Demo3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\JAVA\\basicStudy\\File\\buffer\\src\\sort.txt"));
        String line = br.readLine();
        System.out.println(line);
        br.close();
        int arr[];
        String[] s = line.split(" ");
        arr = new int[s.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        //排序
        for (int i = 0; i < arr.length -1; i++) {
            for (int j = 0; j < arr.length - i -1; j++) {
                if (arr[j+1] < arr[j]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\JAVA\\basicStudy\\File\\buffer\\src\\sort.txt"));
        for (int i = 0; i < arr.length; i++) {
            bw.write(arr[i]+" ");
            bw.flush();
        }
        bw.close();

    }
}
