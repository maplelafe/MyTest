package reflect;

/**
 * 字符串操作
 * @author acer
 * @date 2018年6月10日
 */
public class StringUtil {
	private StringUtil() {};
	public static String init(String var) {		
		return var.substring(0,1).toUpperCase()+var.substring(1);
	}
}
