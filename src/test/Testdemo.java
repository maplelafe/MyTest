package test;

public class Testdemo {
	//jdk1.8�¹��ܣ��ӿڼ�ǿ�������ͨ������default ���з�����
	//static �ӿ����ƿ���ֱ�ӵ��øķ���
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person1 p =new Person1();
		p.fun();
	}

}
interface Person{
//	public default void  fun2(){		
//	};
	public void fun();	 
}
class Person1 implements Person{
	 //The type Person1 must implement the inherited abstract method Person.fun()
	public  void  fun1(){};

	@Override
	public void fun() {
		// TODO Auto-generated method stub
		
	}
}

//jdk1.8�ӿڼ�ǿ
