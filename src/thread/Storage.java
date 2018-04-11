package thread;

import java.util.LinkedList;

class Producer implements Runnable{
	private Storage storage; //建立仓库
	private int num;//设置数量
	
	
	public Storage getStorage() {
		return storage;
	}
	public void setStorage(Storage storage) {
		this.storage = storage;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	//构造函数
	public Producer(Storage storage){
		this.storage=storage;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		produce(num);
	}
	public void produce( int num){
		storage.pruduce(num);
	}
	
}

class Consumer implements Runnable{
	private Storage storage;
	private int num;
		
	public Storage getStorage() {
		return storage;
	}
	public void setStorage(Storage storage) {
		this.storage = storage;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	//构造函数
	public Consumer(Storage storage){
		this.storage=storage;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		consume(num);
	}
	public void consume( int num){
		storage.pruduce(num);
	}
	
}
public class Storage {
	/**
	 * 生产者消费者实现方式 
	 * 1.wait() notify() 实现 ,wait 持有该对象的线程把该对象的控制权交出去，然后处于等待状态 ,  notify() 通知某个正在等待这个对象的控制权的线程可以继续运行
	 * 	notifyAll方法就会通知所有等待这个对象控制权的线程继续运行 
	 */
	
	
	//设置仓库容量
	private final int MAX_SIZE=100;
	//设置仓库存储方式 Linklist
	private LinkedList<Object> list = new LinkedList<Object>();
	
	public LinkedList<Object> getList() {
		return list;
	}
	public void setList(LinkedList<Object> list) {
		this.list = list;
	}
	//生产方法
	
	public synchronized void pruduce( int num){
		while(list.size()+num>MAX_SIZE){
			System.out.println("仓库数量："+list.size()+", 生产数量"+ num +" ,最大容量!"+ MAX_SIZE);
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
		for (int i =0 ;i<num;i++){
			list.add(new Object());
		}
		 try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  System.out.println("生产了 : "+num+",剩余："+list.size());
		  this.notifyAll();		
	}
	
	//消费方法
	public synchronized void consume(int num){
			while (list.size()<num){
				System.out.println("无法消费！");
				try {
					this.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			while(num>0){
					list.remove();
					num --;
				}
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("消费后,剩余数量"+list.size());
			this.notifyAll();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Storage s = new Storage();
		Producer p1 = new Producer(s);
		p1.setNum(10);
		Thread t1 = new Thread(p1) ;
		Thread t2 = new Thread(p1) ;
		Thread t3 = new Thread(p1) ;
		
		Consumer p2 = new Consumer(s);
		p2.setNum(10);
		Thread a1 = new Thread(p2) ;
		Thread a2 = new Thread(p2) ;
		Thread a3 = new Thread(p2) ;
		t1.start();
		t2.start();
		t3.start();
		
		a1.start();
		a2.start();
		a3.start();
	}

}

