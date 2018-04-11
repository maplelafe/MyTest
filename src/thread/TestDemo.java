package thread;

class T implements Runnable {
	private String i;
	public T(String i){
		this.i=i;
	}
	public void run(){
		for ( int x= 0 ;x<5;x++){
			System.out.println(this.i+",x="+x);
		}
	}
	
}
public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		T t1= new T("A");
		T t2= new T("B");
		T t3= new T("C");
		new Thread(t1).start();
		new Thread(t2).start();
		new Thread(t3).start();//start只存在Thread类中
		new Thread(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("hello world");
			}
			
		}).start();;
		new Thread(() -> System.out.println("hello world1")).start();
	}
	
//Runnable 比Thread有更好的数据共享方式
}
