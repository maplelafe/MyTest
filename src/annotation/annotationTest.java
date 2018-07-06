package annotation;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class annotationTest {

	public static void main(String[] args) throws Exception, Exception {
		// TODO Auto-generated method stub
		//ȡ�����annotation
		Annotation[] annotations = Member.class.getAnnotations();
		for (int x=0;x<annotations.length;x++) {
			System.out.println("annotations:"+annotations[x]);
		}
		
		//ȡ�����annotation
		Myannotation myannotation = Member.class.getDeclaredAnnotation(Myannotation.class);
		System.out.println(myannotation);

				
		//ȡ�÷�����annotation
		Annotation[] methodannotation = Member.class.getMethod("toString").getAnnotations();
		for (int x=0;x<methodannotation.length;x++) {
			System.out.println("annotations:"+methodannotation[x]);
		}
	}

}
@SuppressWarnings("serial")
@Deprecated
@Myannotation(id = "10", name = "ffb")
class Member implements Serializable{
	
	@Override
	public String toString() {
		System.out.println("tostring()");
		return null;
	}

};//@Deprecated������-----����������಻�ٽ���ʹ��


/**
 * �Զ���annotation
 * @author acer
 * @date 2018��6��14��
 */
@Retention(RetentionPolicy.RUNTIME) //��ʾ����ʱ��Ч
@interface Myannotation{
	public String name() default "";//������������
	public String id() default "";
}

