package treadDemo02;

public class MyRunnable  implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("实现Runnable接口来实现多线程"+ i);
        }
    }
}
