package Util;

public class SystemTest  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long time =System.currentTimeMillis(); //ȡ���������������ѵ�ʱ��
		String x=null;
		for (int i=0;i<10000;i++){
			  x= x +i ;
		}
		long time1 =System.currentTimeMillis(); //ȡ���������������ѵ�ʱ��
		System.out.println(time1-time);
		Person p =new Person();
		p=null;
		System.gc();
		//
		Person1 p1= new Person1();
		try {
			Person1 p2 =(Person1)p1.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
class Person {
	Person(){
		System.out.println("aaaa");
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("bbb");
		throw new Exception("ccc!");		
	}//����������׼���ͷ��ڴ��ʱ�򣬻��ȵ���Object ���finalize()��
}

//ʹ����������������ʵ��java.lang.Cloneable�ӿڣ�������׳�CloneNotSupportedException�쳣����ʾ��¡������
class Person1  implements Cloneable {
	Person1(){
		System.out.println("Person1");
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	//����ģʽֻ���õ���ʱ�����ų�ʼ��������ģʽ�������õ���񣬶��ȳ�ʼ��
} 

