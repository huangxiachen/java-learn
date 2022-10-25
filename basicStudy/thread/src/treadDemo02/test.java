package treadDemo02;

import treadDemo01.MyThread;

public class test {
    public static void main(String[] args) {
        //创建了一个参数对象
        MyRunnable mr = new MyRunnable();
        //创建了一个线程，并把参数对象传递给这个线程
        Thread t1 = new Thread(mr);
        //开启线程后执行的就是参数对象里的方法
        t1.start();
        Thread t2 = new Thread(mr);
        t2.start();
    }
}
