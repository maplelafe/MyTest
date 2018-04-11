package flect;

import java.lang.reflect.Method;

public class ProxyTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		//invoke
//		Class<?> cls = Class.forName("flect.Person");
//		Object obj = cls.newInstance(); //Pserso
//		Method met[] = cls.getMethods();
//		Method m1 = cls.getMethod("set"+initCap("name"), String.class);//设置方法名称和方法参数类型 
//		Object msg = m1.invoke(obj,"abc");//Pserson.setName("abc");
//		Method m2 = cls.getMethod("get"+initCap("name"));
//		Object msg1 = m2.invoke(obj, args);//Person.getName
//		System.out.println(msg+","+msg1);	
		
		Class cls = Class.forName("flect.Person");
		Object obj = cls.newInstance();
		//Method[] m = cls.getMethods();
		Method m1 = cls.getMethod("set"+initCap("name"), String.class);
		Object o = m1.invoke(obj, "aaa");
		System.out.println(o);
		Method m2 = cls.getMethod("get"+initCap("name"));
		Object o2=m2.invoke(obj);
		System.out.println(o2.toString());
		
	}
	public static String initCap(String str){
		return str.substring(0,1).toUpperCase()+str.substring(1);		
	}

}
//通过反射调用类的方法
class Person{
	private String name;
	private String sex;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
}
