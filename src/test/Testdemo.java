package test;

public class Testdemo {
	//jdk1.8新功能，接口加强，添加普通方法，default ，有方法体
	//static 接口名称可以直接调用改方法
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

//jdk1.8接口加强
