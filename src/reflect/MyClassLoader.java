package reflect;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class MyClassLoader extends ClassLoader{
	/**
	 * ʵ��һ���Զ����������������������ͨ���ƶ��ļ�·������
	 * @param classname
	 * @return
	 * @throws IOException 
	 */
	public  Class<?> loadData(String classname) throws IOException{
			byte[] classdata = this.loadclassData();
		return super.defineClass(classname, classdata,0, classdata.length);

		
	}
	/**
	 * �����ƶ�ȡ����������ֽ���
	 * @return
	 * @throws IOException
	 */
	private byte[] loadclassData() throws IOException{
		//����һ����ȡ��
		InputStream is = new FileInputStream(new File("D:"+File.separator+"Member.class"));
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		//���建����
		byte[] data = new byte[20];
		int temp=0;
		while((temp=is.read(data))!=-1) {
			baos.write(data, 0, temp);
		}
		byte[] ret = baos.toByteArray();
		baos.close();
		is.close();
		return ret;
		
	}
}
