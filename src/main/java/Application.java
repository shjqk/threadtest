import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by qiangjiang on 2018/1/12.
 */
public class Application {
    public static void main(String[] args) {
        System.out.println("test");
        /*
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            final int index = i;
            try {
                Thread.sleep(index * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            cachedThreadPool.execute(new Runnable() {


                public void run() {
                    System.out.println(index);
                }
            });
        }
        */
        for(int j=0;j<5;j++)
        {
            DoSomething doSomething = new DoSomething("thread_qq_"+j);
            doSomething.run();
        }

    /*
        Thread th = new Thread( new Runnable() {

            public void run(){
                System.out.println("test");
            }
        });
        th.start();


*/
        /*
        System.out.println("please press any key to exit...");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.exit(1);
        */
    }
}
