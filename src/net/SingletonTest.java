package net;

class Singleton {
	/**
	 * 懒汉式单例模式，线程同步会出现实例化多个,加锁导致性能下降，volatile
	 */
	private static Singleton st;
	private Singleton() {
		System.out.println("线程"+Thread.currentThread().getName());
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
		
		new Thread(()->Singleton.getInstance(),"线程A").start();
		new Thread(()->Singleton.getInstance(),"线程B").start();
		new Thread(()->Singleton.getInstance(),"线程C").start();
		new Thread(new Runnable() {			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				Singleton.getInstance();
			}
		},"线程D");
		new Thread(()->Singleton.getInstance(),"线程E").start();
	}
}

