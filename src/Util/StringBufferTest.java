package Util;

public class StringBufferTest {
//	String�����Ϊ���ɱ����һ�����޸���String�����ֵ���������´�����һ���µĶ����ͷ�ԭString����StringBuffer�����Ϊ���޸Ķ���
	//����ͨ��append()�������޸�ֵ
//	String����������Զ����StringBuffer�ࡣStringBuffer ֻ�з������Ӳ�������ʹ��StringBuffer
	//public final class java.lang.StringBuffer extends java.lang.AbstractStringBuilder implements java.io.Serializable, java.lang.CharSequence
	//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		sb.append("hello world!");
		System.out.println(sb.toString());
		System.out.println(sb.reverse());
		System.out.println(sb.delete(1, 2).insert(1, "d"));
		StringBuilder a= new StringBuilder(); //�첽�����̲߳���ȫ
		//StringBuffer ����ͬ�������̰߳�ȫ,synchronized
		
	}
	

}
