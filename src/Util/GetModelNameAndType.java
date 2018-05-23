package Util;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

class GetModelNameAndType {

	public static void testReflect(Object model) throws SecurityException, NoSuchMethodException,
			IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
		// ��ȡʵ������������ԣ�����Field����
		Field[] field = model.getClass().getDeclaredFields();
		// ��ȡ���Ե�����
		String[] modelName = new String[field.length];
		String[] modelType = new String[field.length];
		for (int i = 0; i < field.length; i++) {
			// ��ȡ���Ե�����
			String name = field[i].getName();//aaz308
			modelName[i] = name;
			// ��ȡ��������
			String type = field[i].getGenericType().toString();
			modelType[i] = type;

			// �ؼ��������ɷ���˽�б���
			field[i].setAccessible(true);			
			// ����������
			if (type.equals("class java.lang.Double")) {
				field[i].set(model, 0.0);
			}
			else if (type.equals("class java.lang.Integer")) {
				field[i].set(model, 0);
			}
			else if (type.equals("class java.lang.Long")) {
				field[i].set(model, 0L);
			} else if(type.equals("class java.lang.String")) {
				field[i].set(model, "0");
			}
			//field[i].set(model, field[i].getType().getConstructor(field[i].getType()).newInstance("kou"));


			// �����Ե�����ĸ��д
			name = name.replaceFirst(name.substring(0, 1), name.substring(0, 1).toUpperCase());

			if (type.equals("class java.lang.Long")) {
				// ���type�������ͣ���ǰ�����"class "�����������
				Method m = model.getClass().getMethod("get" + name);
				// ����getter������ȡ����ֵ
				Long value = (Long) m.invoke(model);
				if (value != null) {

					System.out.println("attribute value:" + value);
				}

			}
			if (type.equals("class java.lang.String")) {
				// ���type�������ͣ���ǰ�����"class "�����������
				Method m = model.getClass().getMethod("get" + name);
				// ����getter������ȡ����ֵ
				String value = (String) m.invoke(model);
				if (value != null) {

					System.out.println("attribute value:" + value);
				}

			}
			if (type.equals("class java.lang.Integer")) {
				Method m = model.getClass().getMethod("get" + name);
				Integer value = (Integer) m.invoke(model);
				if (value != null) {
					System.out.println("attribute value:" + value);
				}
			}
			if (type.equals("class java.lang.Short")) {
				Method m = model.getClass().getMethod("get" + name);
				Short value = (Short) m.invoke(model);
				if (value != null) {
					System.out.println("attribute value:" + value);
				}
			}
			if (type.equals("class java.lang.Double")) {
				Method m = model.getClass().getMethod("get" + name);
				Double value = (Double) m.invoke(model);
				if (value != null) {
					System.out.println("attribute value:" + value);
				}
			}
			if (type.equals("class java.lang.Boolean")) {
				Method m = model.getClass().getMethod("get" + name);
				Boolean value = (Boolean) m.invoke(model);
				if (value != null) {
					System.out.println("attribute value:" + value);
				}
			}
			if (type.equals("class java.util.Date")) {
				Method m = model.getClass().getMethod("get" + name);
				Date value = (Date) m.invoke(model);
				if (value != null) {
					System.out.println("attribute value:" + value.toLocaleString());
				}
			}
		}
	}

	public static void main(String[] args) {
		try {
			testReflect(new Kc25());
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		}
	}

}