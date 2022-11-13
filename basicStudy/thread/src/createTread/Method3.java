package createTread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @description:使用Callable和FUture创建线程
 * @author: Luck_chen
 * @date: 2022/11/12 21:24
 * @Version 1.0.0.0
 * 多线程的实现方式
 * 方式3：Callablei和Future
 * 定义一个类MyCallable实现Callable接口
 * 在MyCallable类中重写calO方法
 * 创建M小Callable类的对象
 * 创建Future的实现类FutureTask对像，把MyCallable对象作为构造方法知的参数
 * 创建Thread类的对象，把FutureTask对象作为构造方法的参数
 * 启动线程
 */
public class Method3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Mythread3 mt = new Mythread3();
        FutureTask<String> st = new FutureTask<>(mt);
        new Thread(st,"表白").start();
        String s = st.get();
        System.out.println(s);


    }
}
class Mythread3 implements Callable<String>{

    @Override
    public String  call() throws Exception {
        for (int i = 0; i < 100; i++) {
            System.out.println("跟女孩表白"+i);
            System.out.println(Thread.currentThread().getName()+i);
        }
        return "答应";
    }
}

