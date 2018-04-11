package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService p = Executors.newCachedThreadPool();
		ScheduledExecutorService p1 = Executors.newScheduledThreadPool(1);
//		for ( int x=0;x<10;x++){
//			p.submit(new Runnable(){
//
//				@Override
//				public void run() {
//					// TODO Auto-generated method stub
//					System.out.println(Thread.currentThread().getName());
//				}});
//		}
		for ( int x=0;x<10;x++){
			p1.scheduleAtFixedRate(new Runnable(){

				@Override
				public void run() {
					// TODO Auto-generated method stub
						System.out.println(Thread.currentThread().getName());			
				}
				
			}, 3, 2, TimeUnit.SECONDS);
		} //从第三秒开始，每两秒执行一次
		p.shutdown();
	}

}
