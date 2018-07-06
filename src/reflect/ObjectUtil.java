package reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * �����������Ƶ���get,set����
 * @author acer
 * @date 2018��6��10��
 */
public class ObjectUtil {
	private ObjectUtil() {};
	
	public static void setObject(Object wrapobject,String atrribute,Object value) throws NoSuchMethodException, Exception {
		String methodname= "set"+StringUtil.init(atrribute);
		Field field = wrapobject.getClass().getDeclaredField(atrribute);
		if(field == null) {
			field= wrapobject.getClass().getField(atrribute);
			if (field==null) {
				return ;
			}
		}
		Method method = wrapobject.getClass().getMethod(methodname,field.getType());		
		method.invoke(wrapobject, value);
	}
/**
 * �������getter����
 * @param object ����
 * @param atrribute ������������
 * @return
 * @throws Exception 
 * @throws NoSuchMethodException 
 */
	public static Object getObject(Object wrapobject,String atrribute) throws NoSuchMethodException, Exception {
		/**
		 * ģ��	
		 * private Emp emp =new Emp();	
	public Emp getEmp() {
		return emp;
	}
	public void setEmp(Emp emp) {
		this.emp = emp;
	}
		 */
		String methodname= "get"+StringUtil.init(atrribute);
		/**
		 * * ��ȡ��Ա���������ã�
		 *  1.������ 
 *      1).Field[] getFields():��ȡ���е�"�����ֶ�" 
 *      2).Field[] getDeclaredFields():��ȡ�����ֶΣ�������˽�С��ܱ�����Ĭ�ϡ����У� 
 *      2.��ȡ�����ģ� 
 *      1).public Field getField(String fieldName):��ȡĳ��"���е�"�ֶΣ� 
 *      2).public Field getDeclaredField(String fieldName):��ȡĳ���ֶ�(������˽�е�)
		 */
		Field field = wrapobject.getClass().getDeclaredField(atrribute);
		if(field == null) {
			field= wrapobject.getClass().getField(atrribute);
			if (field==null) {
				return null;
			}
		}
		Method method = wrapobject.getClass().getMethod(methodname);
		Object obj=method.invoke(wrapobject);//ִ��get������ȡ���󣬿��ܻ�ȡ�Ķ���Ϊ��
		if (obj==null) {
			System.out.println(field.getType());			  
		   obj=field.getType().newInstance(); //�õ�ʵ������Ա����
		   setObject(wrapobject, atrribute, obj);		   
		}
		return  obj;
				
	}
}
