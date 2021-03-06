package others;

/**
 * 每一个ThreadLocal能够放一个线程级别的变量，可是它本身能够被多个线程共享使用，并且又能够达到线程安全的目的，且绝对线程安全。
 * 定义一个message对象，定义一个Util对象 ，定义两个线程（将对象放到同一个threadlocal中）
 * @author acer
 * @date 2018年6月10日
 */
class Message{
	private String message;
	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
}
class MessageComsumer{
	public void print(){
		System.out.println(MyUtil.get().getMessage());
	}
	
}
class MyUtil{
	private static ThreadLocal <Message> threadlocal= new ThreadLocal<Message>();
	public static void set(Message msg){
		threadlocal.set(msg);
	}
	public  static  Message get (){
		return threadlocal.get();
	}
}
class A implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Message msg = new Message();
		msg.setMessage("aaaaa");
		MyUtil.set(msg);
		try {
			Thread.currentThread().sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		new MessageComsumer().print();
	}
	
} 
class B implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Message msg = new Message();
		msg.setMessage("bbbbb");
		MyUtil.set(msg);
		try {
			Thread.currentThread().sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		new MessageComsumer().print();
	}
	
} 
//该类提供了线程局部 (thread-local) 变量。这些变量不同于它们的普通对应物，因为访问某个变量（通过其 get 或 set 方法）的每个线程都有自己的局部变量，它独立于变量的初始化副本。ThreadLocal 实例通常是类中的 private static 字段，
//它们希望将状态与某一个线程（例如，用户 ID 或事务 ID）相关联
public class ThreadLocalTest {
	public static void main(String[] args) {
		new Thread(new A()).start();
		new Thread(new B()).start();
	}
}
