
import java.util.Random;
import java.util.concurrent.ForkJoinPool;


//1.求最值 2.求和 3.交换数据 4.排序
public class arrayStu01 {
    public static final int len = 10;
    public static void main(String[] args) {
        //定义一个数组
        int []array = new int[len];
        //随机产生数据
        int i;
        Random random = new Random();
        for ( i = 0; i < len; i++) {
            array[i] = random.nextInt(100);
        }
        //遍历数组
        System.out.print("原数组是：");
        traverse(array);
        //求最大值
        System.out.println("最大值是："+max(array));
        //求最小值
        System.out.println("最小值是："+min(array));

       //求和
        System.out.println("和："+sum(array));
        //交换数据
        System.out.print("倒置后的数组是：");
        reverse(array);
        //排序
        System.out.print("排序后的数组是：");
        oder(array);
    }



    //遍历数组
    public static  void traverse(int[] array){
        for(int item:array){
            System.out.print(" "+item);
        }
        System.out.print("\n");
    }
    //求最大值
    public static int max(int[] array){
        int maxItem = array[0];
        for (int i = 0; i < len; i++) {
            if(array[i]>maxItem)
                maxItem = array[i];
        }
        return maxItem;

    }
    //求最小值
    public static int min(int[] array){
        int minItem = array[0];
        for (int i = 0; i < len; i++) {
            if(array[i]<minItem)
                minItem = array[i];
        }
        return minItem;

    }
    //求和
    public static int sum(int []array){
        int sumArray = 0;
        for (int i = 0; i < len; i++) {
            sumArray+=array[i];
        }
        return sumArray;
    }
    //数组倒置
    public static void reverse(int []array){
        int middle = len/2;
        int temp;
        for (int i = 0; i < middle; i++) {
            temp = array[i];
            array[i] = array[len-1-i];
            array[len-1-i] = temp;
        }
        traverse(array);
        System.out.println("\n");
    }
    //排序(选择)
    private static void oder(int[] array) {
        int k ,temp;
        for (int i = 0; i < len-1; i++)
        {
            k = i;
            for (int j = i+1; j < len; j++) {
                if(array[j]<array[k]){
                    k = j;
                }

            }
            if (k!=i) {
                temp = array[k];
                array[k] = array[i];
                array[i] = temp;
            }

        }
       traverse(array);

    }

}