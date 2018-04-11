package thread;

import java.util.LinkedList;

class Producer implements Runnable{
	private Storage storage; //�����ֿ�
	private int num;//��������
	
	
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
	//���캯��
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
	//���캯��
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
	 * ������������ʵ�ַ�ʽ 
	 * 1.wait() notify() ʵ�� ,wait ���иö�����̰߳Ѹö���Ŀ���Ȩ����ȥ��Ȼ���ڵȴ�״̬ ,  notify() ֪ͨĳ�����ڵȴ��������Ŀ���Ȩ���߳̿��Լ�������
	 * 	notifyAll�����ͻ�֪ͨ���еȴ�����������Ȩ���̼߳������� 
	 */
	
	
	//���òֿ�����
	private final int MAX_SIZE=100;
	//���òֿ�洢��ʽ Linklist
	private LinkedList<Object> list = new LinkedList<Object>();
	
	public LinkedList<Object> getList() {
		return list;
	}
	public void setList(LinkedList<Object> list) {
		this.list = list;
	}
	//��������
	
	public synchronized void pruduce( int num){
		while(list.size()+num>MAX_SIZE){
			System.out.println("�ֿ�������"+list.size()+", ��������"+ num +" ,�������!"+ MAX_SIZE);
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
		  System.out.println("������ : "+num+",ʣ�ࣺ"+list.size());
		  this.notifyAll();		
	}
	
	//���ѷ���
	public synchronized void consume(int num){
			while (list.size()<num){
				System.out.println("�޷����ѣ�");
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
			System.out.println("���Ѻ�,ʣ������"+list.size());
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

