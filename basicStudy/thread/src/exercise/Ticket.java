package exercise;

import exercise.exercise01.Count;
import sun.awt.windows.ThemeReader;

/**
 * @description:卖票
 * @author: Luck_chen
 * @date: 2022/11/12 22:07
 * @Version 1.0.0.0
 */
public class Ticket {
    public static void main(String[] args) {
        Tiket tiket = new Tiket();
        Thread t1 = new Thread(tiket);
        Thread t2 = new Thread(tiket);
        Thread t3 = new Thread(tiket);
        t1.setName("窗口一");
        t2.setName("窗口二");
        t3.setName("窗口三");
        t2.start();
        t1.start();
        t3.start();
    }
}
class Tiket implements Runnable{
    private int count = 100;
    private Object object = new Object();
    @Override
    public void run() {
        while (true) {
            synchronized (object) {
                if (count <= 0) {
                    //买完了
                    break;
                }else {
                    try {
                        Thread.sleep(100);

                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    count--;
                    System.out.println(Thread.currentThread().getName()+"在卖票"+"还剩"+count+"张票");
                }
            }
        }
    }
}
