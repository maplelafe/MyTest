package Util;

public class SystemTest  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long time =System.currentTimeMillis(); //取得摸个操作所花费的时间
		String x=null;
		for (int i=0;i<10000;i++){
			  x= x +i ;
		}
		long time1 =System.currentTimeMillis(); //取得摸个操作所花费的时间
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
	}//垃圾回收器准备释放内存的时候，会先调用Object 类的finalize()。
}

//使用这个方法的类必须实现java.lang.Cloneable接口，否则会抛出CloneNotSupportedException异常。表示克隆的能力
class Person1  implements Cloneable {
	Person1(){
		System.out.println("Person1");
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	//懒汉模式只有用到的时候对象才初始化，饿汉模式是无论用到与否，都先初始化
} 

