/**
 *定义一个方法，把int数组中的数据按照指定的格式拼接成一个字符串返回，
 * 调用该方法，并在控制台输出结果。
 * 例如：
 * 数组为int0arr={1,2,3}:
 * 执行方法后的输出结果为：[1,2,3]
 */

package connecStr;

import javax.xml.transform.Result;
import java.sql.Array;
import java.util.Scanner;

public class ConnectStr {
    public static void main(String[] args) {

        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        String s = connect(arr);
        System.out.println(s);

    }
    public static String connect(int arr[]) {
        if (arr == null) {
            return "";
        }
        if (arr.length == 0) {
            return "[]";
        }
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                result = result + arr[i];
                break;
            }
            result = result+arr[i]+',';
        }
        result = result + ']';
        return result;
    }
}
