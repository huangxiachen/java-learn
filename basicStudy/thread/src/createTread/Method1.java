package createTread;

/**
 * @description:创建线程的方式一
 * 继承Tread类
 * 重写run()方法
 * 创建thread子类实例
 * 调用start()方法启动线程
 * @author: Luck_chen
 * @date: 2022/11/12 20:54
 * @Version 1.0.0.0
 */
public class Method1 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            //获取当前线程的名字
            System.out.println(Thread.currentThread().getName());
            if (i == 20) {
                MyThread myThread1 = new MyThread();
                myThread1.start();
                MyThread myThread2 = new MyThread();
                myThread2.start();
            }
        }

    }
}
class MyThread extends Thread{
    private int i;
    @Override
    public void run() {
        for (; i <= 20; i++) {
            System.out.println(getName()+" " + i);
        }
    }
}
