package reflect;

/**
 * �ַ�������
 * @author acer
 * @date 2018��6��10��
 */
public class StringUtil {
	private StringUtil() {};
	public static String init(String var) {		
		return var.substring(0,1).toUpperCase()+var.substring(1);
	}
}
