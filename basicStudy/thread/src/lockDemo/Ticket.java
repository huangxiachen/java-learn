package lockDemo;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @description:lock
 * @author: Luck_chen
 * @date: 2022/11/12 22:07
 * @Version 1.0.0.0
 */
public class Ticket {
    public static void main(String[] args) {
        Tiket tiket = new Tiket();
        Thread t1 = new Thread(tiket);
        Thread t2 = new Thread(tiket);

        t1.setName("窗口一");
        t2.setName("窗口二");

        t1.start();
        t2.start();

    }
}
class Tiket implements Runnable{
    private int count = 100;
    private ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            lock.lock();
            try {
                if (count <= 0) {
                    //买完了
                    break;
                }else {
                  Thread.sleep(100);
                    count--;
                    System.out.println(Thread.currentThread().getName()+"在卖票"+"还剩"+count+"张票");
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }
        }
    }
}
