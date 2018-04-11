package thread;

import java.util.concurrent.TimeUnit;

public class DaemonsDontRunFinally {
	public static void main(String[] args) {
		
		Thread t = new Thread( new Darmon());
		t.setDaemon(true);
		t.start();
	}
}
class Darmon implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		 System.out.println("start ADaemon...");
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("Exiting via InterruptedException");
		}finally{
			System.out.println("This shoud be always run ?");//�����еķ��ػ��߳̽���ʱ������Ҳ����ֹ�ˣ�ͬʱ��ɱ�������е������ػ��߳�,���Բ�ִ��
		}
	}
	
}

