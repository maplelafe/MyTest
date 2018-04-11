package others;

import java.util.Base64;

public class Base64Test {
	//数据加密算法
	public static void main(String[] args) {
		String src = "www.baidu.com";
		String mMsg = Base64.getEncoder().encodeToString(src.getBytes());
		System.out.println(mMsg);
		byte[] oMsg = Base64.getDecoder().decode(mMsg); //返回新分配的字节数组
		System.out.println(new String(oMsg));
	}
}
