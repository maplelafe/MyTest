package net;

class Singleton {
	/**
	 * ����ʽ����ģʽ���߳�ͬ�������ʵ�������,�������������½���volatile
	 */
	private static Singleton st;
	private Singleton() {
		System.out.println("�߳�"+Thread.currentThread().getName());
	};
	public static synchronized  Singleton getInstance() {
		if (st==null) {
			st=new Singleton();
		}
		return st;
	}
}
public class SingletonTest{
	public static void main(String[] args) {
		
		new Thread(()->Singleton.getInstance(),"�߳�A").start();
		new Thread(()->Singleton.getInstance(),"�߳�B").start();
		new Thread(()->Singleton.getInstance(),"�߳�C").start();
		new Thread(new Runnable() {			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				Singleton.getInstance();
			}
		},"�߳�D");
		new Thread(()->Singleton.getInstance(),"�߳�E").start();
	}
}

