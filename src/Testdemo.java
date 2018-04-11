
public class Testdemo {
	
	@SuppressWarnings({ "rawtypes", "unused" }) //注解压制警告
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p =new Person();
		p.fun();
	}

}
class Person<T>{
	@Override  //注解表示重写方法
	public String  toString(){
		return "person";
	}
	@Deprecated   //注解过期注解
	public void fun(){
	}	 
	 public void a(){		 }
}

//jdk1.8接口加强
