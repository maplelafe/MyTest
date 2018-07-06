package annotation;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class annotationTest {

	public static void main(String[] args) throws Exception, Exception {
		// TODO Auto-generated method stub
		//取得类的annotation
		Annotation[] annotations = Member.class.getAnnotations();
		for (int x=0;x<annotations.length;x++) {
			System.out.println("annotations:"+annotations[x]);
		}
		
		//取得类的annotation
		Myannotation myannotation = Member.class.getDeclaredAnnotation(Myannotation.class);
		System.out.println(myannotation);

				
		//取得方法的annotation
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

};//@Deprecated”意在-----这个方法或类不再建议使用


/**
 * 自定义annotation
 * @author acer
 * @date 2018年6月14日
 */
@Retention(RetentionPolicy.RUNTIME) //表示运行时生效
@interface Myannotation{
	public String name() default "";//定义两个属性
	public String id() default "";
}

