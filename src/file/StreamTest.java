package file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/**
 *  String json = "{\"id\":\"0001\",\"name\":\"С��\"}";\"��ʾ"��Ҫ����
 * \n���� \r�س�  \t �������� 
 * @author acer
 * @date 2018��6��10��
 */
public class StreamTest {
	//IO������Դ������Ҫ�ر�(close)
	// ����File�࣬�����ַ������ֽڵ�������󣬽������ݶ�ȡ����д�룬�ر���
	public static void main(String[] args) throws IOException {
		File file = new File ("d:"+File.separator+"test.txt");
		if(!file.exists()){
			file.createNewFile();
		}
		//InputStream��������ʵ����
		OutputStream os= new FileOutputStream(file,true) ;
		//OutputStream os= new FileOutputStream(file) ;
		String msg = "www.baidu.com\r\n";	
		os.write(msg.getBytes()); // 
		byte msg1 []={1,2,3,4,5,6,7};
		//os.write(msg1,1,3);
        os.write(msg.getBytes(),1,3); //�� 2��3��4д���ļ�,��ָ�� byte �����д�ƫ���� off ��ʼ�� len ���ֽ�д�������� 
        os.close(); 
	}
}
