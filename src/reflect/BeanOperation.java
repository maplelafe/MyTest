package reflect;

/**
 * ʵ���Զ�VOƥ�䴦���������ʵ��������
 * @author acer
 * @date 2018��6��10��
 */
public class BeanOperation {
	public BeanOperation() {};
	/**
	 * <p>Title: setBeanValue</p>  
	 * <p>Description: �������Բ���</p>  
	 * @param object
	 * @param msg
	 * @throws Exception 
	 * @throws NoSuchMethodException 
	 */
	public static void setBeanValue(Object actionobject,String msg) throws NoSuchMethodException, Exception {
		String result[]= msg.split("\\|");
		for ( int x=0;x<result.length;x++) {
			String temp[] = result[x].split(":");
			String attibute = temp[0]; //��������
			String value = temp[1];//����ֵ
			String fields[] = attibute.split("\\.");
			Object currentobject  = ObjectUtil.getObject(actionobject, fields[0]);	//��ȡemp����
			ObjectUtil.setObject(currentobject, fields[1], value);//��emp����field��ֵ
		}
	
	}
	public static void setMutiBeanValue(Object actionobject,String msg) throws NoSuchMethodException, Exception {
		String result[]= msg.split("\\|");
		for ( int x=0;x<result.length;x++) {
			String temp[] = result[x].split(":");
			String attibute = temp[0]; //��������
			String value = temp[1];//����ֵ
			String fields[] = attibute.split("\\.");
			if (fields.length>2) {
				//attibuteһ��һ��ȥ��ȡ����Ǹ�vo�Ķ�������ʲô,�ҵ�company��dept,��ֵ��currentobject
				//  String var1 = "emp.dept.company.companyname:apple|emp.dept.deptname:developer";
				Object currentobject  = actionobject;;
				for (int i=0;i<fields.length-1;i++) {
					String fieldstring =fields[i] ;

					currentobject  = ObjectUtil.getObject(currentobject, fieldstring);
				}
				ObjectUtil.setObject(currentobject, fields[fields.length-1], value);//��emp����field��ֵ

			}else {				
				Object currentobject  = ObjectUtil.getObject(actionobject, fields[0]);	//��ȡemp����
				ObjectUtil.setObject(currentobject, fields[1], value);//��emp����field��ֵ
			}
			
		}
	
	}

}
