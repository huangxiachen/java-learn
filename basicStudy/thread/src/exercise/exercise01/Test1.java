package exercise.exercise01;

/**
 * @author Luck_chen
 * @version 1.0.0
 * @date 2022年10月31日 11:07:04
 * @packageName exercise
 * @className Text1
 * @describe TODO
 */
public class Test1 {
    public static void main(String[] args) {
        Count count = new Count();
        new Thread(count,"count1").start();
        new Thread(count,"count2").start();

    }

}
