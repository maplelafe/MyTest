package thread;
//class Th extends Thread {
//	private String i;
//	public Th (String i){
//		this.i=i;
//	}
//	public void run(){
//		for ( int x= 0 ;x<5;x++){
//			System.out.println(this.i+",x="+x);
//			try {
//				Thread.sleep(1000); //�߳�����
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//	}
//	
//}
class Th implements Runnable{
	int ticket = 30;
	@Override
	public void run() {
		// TODO Auto-generated method stub
//		while (ticket >0){
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			System.out.println(Thread.currentThread().getName()+" :" +this.ticket--);			
//		}
//		
//		while (ticket >0){
//			System.out.println(Thread.currentThread().getName()+" :" +this.ticket--);			
//		}
		//һ��ͬ������飬����һ����������ticket
//		for ( int x= 0 ;x<20;x++){
//			synchronized(this){
//			if (ticket >0){								
//					try {
//						Thread.sleep(10);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//					System.out.println(Thread.currentThread().getName()+" :" +this.ticket--);			
//				}
//			}
//		}	
		this.sale();
	}

	//��:ͬ����������������ticket
	public synchronized  void sale(){
		for ( int x= 0 ;x<20;x++){
			if (ticket >0){								
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+" :" +this.ticket--);			
			}			
		}
	}
	
}
public class MyThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Th mt = new Th();
		Thread t1= new Thread (mt,"A");
		Thread t2= new Thread (mt,"B");
		Thread t3= new Thread (mt,"C");
		t1.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t2.start();
		t3.start();		
	}
	//�̲߳���ִ�У�������̲߳�ͬ�������Ǵ����ٶȿ�,Synchronized����ͬ������ͬ������Ҫ��������	
}
