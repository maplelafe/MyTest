package thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class T1 implements Callable<String> {
	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		for ( int x= 0 ;x<5;x++){
			System.out.println("x:"+ x);
		}
		return "Æ±ÂòÍêÁË£¡";
	}
	
}
public class CallableDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		FutureTask<String> task = new FutureTask<String>(new T1());
		new Thread(task).start();
		System.out.println(task.get());
	}
	
}
