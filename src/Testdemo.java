
public class Testdemo {
	
	@SuppressWarnings({ "rawtypes", "unused" }) //ע��ѹ�ƾ���
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p =new Person();
		p.fun();
	}

}
class Person<T>{
	@Override  //ע���ʾ��д����
	public String  toString(){
		return "person";
	}
	@Deprecated   //ע�����ע��
	public void fun(){
	}	 
	 public void a(){		 }
}

//jdk1.8�ӿڼ�ǿ
