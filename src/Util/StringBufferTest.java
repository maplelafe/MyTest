package Util;

public class StringBufferTest {
//	String类对象为不可变对象，一旦你修改了String对象的值，隐性重新创建了一个新的对象，释放原String对象，StringBuffer类对象为可修改对象，
	//可以通过append()方法来修改值
//	String类对象的性能远不如StringBuffer类。StringBuffer 只有反复链接操作，才使用StringBuffer
	//public final class java.lang.StringBuffer extends java.lang.AbstractStringBuilder implements java.io.Serializable, java.lang.CharSequence
	//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		sb.append("hello world!");
		System.out.println(sb.toString());
		System.out.println(sb.reverse());
		System.out.println(sb.delete(1, 2).insert(1, "d"));
		StringBuilder a= new StringBuilder(); //异步处理，线程不安全
		//StringBuffer 采用同步处理，线程安全,synchronized
		
	}
	

}
