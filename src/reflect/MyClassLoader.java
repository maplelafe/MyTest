package reflect;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class MyClassLoader extends ClassLoader{
	/**
	 * 实现一个自定义类加载器，传入类名，通过制定文件路径加载
	 * @param classname
	 * @return
	 * @throws IOException 
	 */
	public  Class<?> loadData(String classname) throws IOException{
			byte[] classdata = this.loadclassData();
		return super.defineClass(classname, classdata,0, classdata.length);

		
	}
	/**
	 * 二进制读取，返回类的字节码
	 * @return
	 * @throws IOException
	 */
	private byte[] loadclassData() throws IOException{
		//创建一个读取流
		InputStream is = new FileInputStream(new File("D:"+File.separator+"Member.class"));
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		//定义缓冲区
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
