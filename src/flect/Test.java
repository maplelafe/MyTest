package flect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Date;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, Exception, IllegalAccessException {
		// TODO Auto-generated method stub
		//��ȡclass�������ַ�ʽ
		//1.Class<?> cls = new Date().getClass();
		//2.Class<?> cls = Date.class;
		Class<?> cls = Class.forName("java.util.Date");
		System.out.println(cls.getName());
		
		//����ʵ��������
		System.out.println(cls.newInstance()); // new java.util.Date();
		//��ȡ���췽��
		Constructor<?>[] ct = cls.getConstructors();
		for(int x=0;x<ct.length;x++){
		//	System.out.println(ct[x]);
		}
		//��ȡ��ͨ����
		Method met[] = cls.getMethods();
		for(int x=0;x<met.length;x++){
			System.out.println(met[x]);		
		}

	}

}
//interface Fruit{};
//interface Imessage{};
//class ClassDemo implements Fruit,Imessage{
//	
//};
