package exercise;

import exercise.exercise01.Count;

/**
 * @description:同步方法
 * @author: Luck_chen
 * @date: 2022/11/13 8:52
 * @Version 1.0.0.0
 *同步方法
 * 同步方法：就是把synchronized关键字加到方法上
 * 格式：
 * 修饰符synchronized返回值类型方法名方法参数{}
 * 同步代码块和同步方的区别：
 * 同步代码块可以锁住指定代码同步方法是锁住方法中所有代码
 * ·同步代码块可以指定锁对象同步方法不能指定锁对像
 * 同步方法的锁对象是什么呢？
 * this
 */
public class Ticket2{
    public static void main(String[] args) {
        CountTicket ct = new CountTicket();
        new Thread(ct,"窗口二").start();
        new Thread(ct,"窗口一").start();
    }
}
class CountTicket implements Runnable{
    private int count = 100;
    @Override
    public void run() {
        while (true) {
            if (Thread.currentThread().getName().equals("窗口一")) {
                //同步方法
                boolean b = ticketCount();
                if (b){
                    break;
                }

            }
            if (Thread.currentThread().getName().equals("窗口二")) {
                //同步代码块
                synchronized (this) {
                    if (count <= 0) {
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

    private synchronized boolean ticketCount() {
        if (count <= 0){
            return true;
        }else {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            count--;
            System.out.println(Thread.currentThread().getName()+"在卖票"+"还剩"+count+"张票");
            return false;
        }
    }
}
