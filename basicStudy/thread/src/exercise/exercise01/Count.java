package exercise.exercise01;

/**
 * @author Luck_chen
 * @version 1.0.0
 * @date 2022年10月31日 11:07:38
 * @packageName exercise
 * @className Count
 * @describe TODO
 */
public class Count implements Runnable {
    private int count = 0;


    @Override
    public void run() {
        synchronized (this) {
            while (true){
                if (count < 3000) {
                    count += 1000;
                    System.out.println(Thread.currentThread().getName()+"  "+count);
                }else {
                    break;
                }
            }
        }

    }
}
