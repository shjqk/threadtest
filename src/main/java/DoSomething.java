/**
 * Created by qiangjiang on 2018/1/12.
 */
public class DoSomething implements Runnable {
    private String name;
    public DoSomething(String name)
    {
        this.name = name;
    }
    public void run()
    {
        System.out.println("线程:" + name);
        try {
        Thread.sleep(160000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
        for(int i=0;i<5;i++)
        {
            for(long k=0;k<100;k++);
            System.out.println(name + ": " + i);
        }

    }
}
