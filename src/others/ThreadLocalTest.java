package others;

/**
 * ÿһ��ThreadLocal�ܹ���һ���̼߳���ı����������������ܹ�������̹߳���ʹ�ã��������ܹ��ﵽ�̰߳�ȫ��Ŀ�ģ��Ҿ����̰߳�ȫ��
 * ����һ��message���󣬶���һ��Util���� �����������̣߳�������ŵ�ͬһ��threadlocal�У�
 * @author acer
 * @date 2018��6��10��
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
//�����ṩ���ֲ߳̾� (thread-local) ��������Щ������ͬ�����ǵ���ͨ��Ӧ���Ϊ����ĳ��������ͨ���� get �� set ��������ÿ���̶߳����Լ��ľֲ��������������ڱ����ĳ�ʼ��������ThreadLocal ʵ��ͨ�������е� private static �ֶΣ�
//����ϣ����״̬��ĳһ���̣߳����磬�û� ID ������ ID�������
public class ThreadLocalTest {
	public static void main(String[] args) {
		new Thread(new A()).start();
		new Thread(new B()).start();
	}
}
