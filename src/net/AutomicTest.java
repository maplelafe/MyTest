package net;

//vlatile不能保证原子性，volatile保证了可见性，　根源，自增操作不是原子性操作，lOCK， Sychronized，AtomicInteger 可以保证原子性
public class AutomicTest {
    public volatile int inc = 0;//
     
    public  synchronized void  increase() {
        inc++;
    }
     
    public static void main(String[] args) {
        final AutomicTest test = new AutomicTest();
        for(int i=0;i<10;i++){
            new Thread(){
                public void run() {
                    for(int j=0;j<1000;j++)
                        test.increase();
                };
            }.start();
        } 
        System.out.println(Thread.activeCount());
        while(Thread.activeCount()>1)  //保证前面的线程都执行完 , 返回当前线程的线程组中活动线程的数目
            Thread.yield();//暂停当前正在执行的线程对象，并执行其他线程
        System.out.println(test.inc);
    }
}