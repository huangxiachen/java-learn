package treadDemo01;

public class MyThreadTest {
    public static void main(String[] args) {
        //创建线程对象1
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();

        //只是表示创建对象，用对象去调用了run()方法，没有开启线程
        myThread1.run();
        myThread2.run();

            //只能调用一次start()，再次调用会发生异常
//        //开启线程，交替执行，随机执行
//        myThread1.start();
//        myThread2.start();
    }
}
