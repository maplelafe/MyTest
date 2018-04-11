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
			byte[] b = new byte[1024];//每次读取内容
			int k = in.read(b);
			/*1、 按值传递(by value)
			适用范围：8种基本数据类型、String对象
			特点：在内存中复制一份数据，把复制后的数据传递到方法内部
			作用：在方法内部改变参数的值，外部数据不会跟着发生改变
			2、 按址传递(by address)
			适用范围：数组、除String以外的其他所有类型的对象
			特点：将对象的地址传递到方法内部
			作用：在方法内部修改对象的内容，外部数据也会跟着发生改变*/
			System.out.println("读取["+new String(b,0,k)+"]");
			in.close();
		}

	}

}
