package flect;
/**
 * ����(����������)
 * @author acer
 *
 */
public class GenTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gen<String> s= new Gen<String>("1111");
		s.showType();
		System.out.println(s.getT()); ;
	}

}
/**
 * JDK5�еķ����������Ա�ڱ�д���ϴ���ʱ�������Ƽ��ϵĴ������ͣ��Ӷ���ԭ����������ʱ���ܷ������⣬
 * ת��Ϊ����ʱ�����⣬�Դ���߳���Ŀɶ��Ժ��ȶ���(�����ڴ��ͳ����и�Ϊͻ��)
 * @author acer
 * @date 2018��6��10��
 * @param <T>
 */
class Gen <T>{
	private T t ;

	public Gen(T t) {
		super();
		this.t = t;
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	public void showType(){
		System.out.println("t��������"+t.getClass().getName());
		
	}
}
