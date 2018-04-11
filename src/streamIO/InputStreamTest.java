package streamIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamTest {
	public static void main(String[] args) throws IOException {
		File f= new File("D:"+File.separator+"test.txt");
		if(f.exists()){
			InputStream in = new FileInputStream(f);
			byte[] b = new byte[1024];//ÿ�ζ�ȡ����
			int k = in.read(b);
			/*1�� ��ֵ����(by value)
			���÷�Χ��8�ֻ����������͡�String����
			�ص㣺���ڴ��и���һ�����ݣ��Ѹ��ƺ�����ݴ��ݵ������ڲ�
			���ã��ڷ����ڲ��ı������ֵ���ⲿ���ݲ�����ŷ����ı�
			2�� ��ַ����(by address)
			���÷�Χ�����顢��String����������������͵Ķ���
			�ص㣺������ĵ�ַ���ݵ������ڲ�
			���ã��ڷ����ڲ��޸Ķ�������ݣ��ⲿ����Ҳ����ŷ����ı�*/
			System.out.println("��ȡ["+new String(b,0,k)+"]");
			in.close();
		}

	}

}
