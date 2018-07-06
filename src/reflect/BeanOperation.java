package reflect;

/**
 * 实现自动VO匹配处理操作，不实例化操作
 * @author acer
 * @date 2018年6月10日
 */
public class BeanOperation {
	public BeanOperation() {};
	/**
	 * <p>Title: setBeanValue</p>  
	 * <p>Description: 负责属性操作</p>  
	 * @param object
	 * @param msg
	 * @throws Exception 
	 * @throws NoSuchMethodException 
	 */
	public static void setBeanValue(Object actionobject,String msg) throws NoSuchMethodException, Exception {
		String result[]= msg.split("\\|");
		for ( int x=0;x<result.length;x++) {
			String temp[] = result[x].split(":");
			String attibute = temp[0]; //属性名称
			String value = temp[1];//属性值
			String fields[] = attibute.split("\\.");
			Object currentobject  = ObjectUtil.getObject(actionobject, fields[0]);	//获取emp对象
			ObjectUtil.setObject(currentobject, fields[1], value);//将emp对象field赋值
		}
	
	}
	public static void setMutiBeanValue(Object actionobject,String msg) throws NoSuchMethodException, Exception {
		String result[]= msg.split("\\|");
		for ( int x=0;x<result.length;x++) {
			String temp[] = result[x].split(":");
			String attibute = temp[0]; //属性名称
			String value = temp[1];//属性值
			String fields[] = attibute.split("\\.");
			if (fields.length>2) {
				//attibute一层一层去获取最后那个vo的对象名叫什么,找到company，dept,赋值给currentobject
				//  String var1 = "emp.dept.company.companyname:apple|emp.dept.deptname:developer";
				Object currentobject  = actionobject;;
				for (int i=0;i<fields.length-1;i++) {
					String fieldstring =fields[i] ;

					currentobject  = ObjectUtil.getObject(currentobject, fieldstring);
				}
				ObjectUtil.setObject(currentobject, fields[fields.length-1], value);//将emp对象field赋值

			}else {				
				Object currentobject  = ObjectUtil.getObject(actionobject, fields[0]);	//获取emp对象
				ObjectUtil.setObject(currentobject, fields[1], value);//将emp对象field赋值
			}
			
		}
	
	}

}
