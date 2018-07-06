package reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 根据属性名称调用get,set方法
 * @author acer
 * @date 2018年6月10日
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
 * 负责调用getter方法
 * @param object 对象
 * @param atrribute 对象属性名称
 * @return
 * @throws Exception 
 * @throws NoSuchMethodException 
 */
	public static Object getObject(Object wrapobject,String atrribute) throws NoSuchMethodException, Exception {
		/**
		 * 模拟	
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
		 * * 获取成员变量并调用：
		 *  1.批量的 
 *      1).Field[] getFields():获取所有的"公有字段" 
 *      2).Field[] getDeclaredFields():获取所有字段，包括：私有、受保护、默认、公有； 
 *      2.获取单个的： 
 *      1).public Field getField(String fieldName):获取某个"公有的"字段； 
 *      2).public Field getDeclaredField(String fieldName):获取某个字段(可以是私有的)
		 */
		Field field = wrapobject.getClass().getDeclaredField(atrribute);
		if(field == null) {
			field= wrapobject.getClass().getField(atrribute);
			if (field==null) {
				return null;
			}
		}
		Method method = wrapobject.getClass().getMethod(methodname);
		Object obj=method.invoke(wrapobject);//执行get方法获取对象，可能获取的对象为空
		if (obj==null) {
			System.out.println(field.getType());			  
		   obj=field.getType().newInstance(); //得到实例化成员变量
		   setObject(wrapobject, atrribute, obj);		   
		}
		return  obj;
				
	}
}
