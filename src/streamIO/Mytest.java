package streamIO;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Flushable;
import java.io.IOException;
import java.io.OutputStream;

public class Mytest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//OutputStream //public abstract class OutputStream implements Closeable, Flushable
		File f = new File("D:"+File.separator+"hello1.txt");
		if(!f.getParentFile().exists()){
			f.mkdirs();
		}
		//OutputStream os = new FileOutputStream(f);//�����������
		OutputStream os = new FileOutputStream(f,true);//׷���������
		os.write("www\r\n".getBytes()); //\r\n�������
		os.close();
	}

}
