package exercise;

import com.sun.deploy.ui.FancyButton;
import com.sun.org.apache.bcel.internal.generic.NEW;

import javax.swing.*;

/**
 * @description:生产者消费者问题
 * @author: Luck_chen
 * @date: 2022/11/13 9:30
 * @Version 1.0.0.0
 * 消费者步骤：
 * 1,判断桌子上是否有汉堡包
 * 2,如果没有就等待。
 * 3,如果有就开吃，汉堡包的总数量减一
 * 4,吃完之后，桌子上的汉堡包就没有了，叫醒等待的生产者继续生产
 *  生产者步骤：
 * 1.如果有就等待，如果没有才生产。
 * 2,把汉堡包放在桌子上。
 * 3,叫醒等待的消费者开吃。
 */
public class Consumer {
    public static void main(String[] args) {
        Foodie foodie = new Foodie();
        Chef chef = new Chef();
        foodie.start();
        chef.start();
    }
}
//厨师
class Chef extends Thread{
    @Override
    public void run() {
//        1.如果有就等待，如果没有才生产。
//        2,把汉堡包放在桌子上。
//        3,叫醒等待的消费者开吃。
        while (true) {
            synchronized (TableFood.lock) {
                if (TableFood.count == 0) {
                    break;
                }else {
                    if (TableFood.flag == false) {
                        //生产
                        System.out.println("生产汉堡");
                        TableFood.flag = true;
                        TableFood.lock.notifyAll();
                    }else {
                        try {
                            TableFood.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
        }
    }
}
//消费者
class Foodie extends Thread {

    @Override
    public void run() {
//            1,判断桌子上是否有汉堡包
//            2,如果没有就等待。
//            3,如果有就开吃，汉堡包的总数量减一
//            4,吃完之后，桌子上的汉堡包就没有了，叫醒等待的生产者继续生产
        while (true) {
            synchronized (TableFood.lock) {
                //            1,判断桌子上是否有汉堡包
                if (TableFood.count == 0) {
                    break;
                }else {
                    if (TableFood.flag) {
//                        3,如果有就开吃，汉堡包的总数量减一
                        System.out.println("吃汉堡");
                        TableFood.flag = false;
                        TableFood.lock.notifyAll();
                        TableFood.count--;
                    }else {
//                        2,如果没有就等待。
                        try {
                            TableFood.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }

        }

    }
}
//桌子上的食物
class TableFood{
    //食物的数量
    public static int count = 10;
    //执行哪个线程的标记
    public static boolean flag = false;
    //锁对象，不允许更改
    public static final Object lock = new Object();


}
