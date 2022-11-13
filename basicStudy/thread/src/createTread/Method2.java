package createTread;

/**
 * @description:实现Runnable接口
 * @author: Luck_chen
 * @date: 2022/11/12 21:06
 * @Version 1.0.0.0
 */
public class Method2 {
    public static void main(String[] args) {
        MyThread2 myThread2 = new MyThread2();
        MyThread2 myThread2_1 = new MyThread2();
        for (int i = 0; i < 100; i++) {
            if (i == 20) {
                new Thread(myThread2,"thread2").start();

            }
            if (i == 30) {
                new Thread(myThread2_1,"myThread2_1").start();

            }
        }



    }
}
class MyThread2 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {

            System.out.println(Thread.currentThread().getName()+i);
        }
    }
}
