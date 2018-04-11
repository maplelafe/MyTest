package thread;

import java.util.concurrent.ExecutionException;

class MyThread1 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for ( int x= 0 ;x<5;x++){
			System.out.println(Thread.currentThread().getName()+":"+ x);
		}
	}
	
}
public class PriorityDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		MyThread1 mt = new MyThread1();
		Thread t1 = new Thread(mt,"线程A");
		Thread t2 = new Thread(mt,"线程B");
		Thread t3 = new Thread(mt,"线程C");
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
	}
	
}
