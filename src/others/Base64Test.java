package others;

import java.util.Base64;

public class Base64Test {
	//���ݼ����㷨
	public static void main(String[] args) {
		String src = "www.baidu.com";
		String mMsg = Base64.getEncoder().encodeToString(src.getBytes());
		System.out.println(mMsg);
		byte[] oMsg = Base64.getDecoder().decode(mMsg); //�����·�����ֽ�����
		System.out.println(new String(oMsg));
	}
}
