package file;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("d:"+File.separator+"hello.txt"); //�����ļ����󣬳����е�\��Ҫʹ��˫\\
		try {
			if (!file.exists()){
				file.createNewFile();//�������ļ�
			}

			if(file.exists()){ //ɾ���ļ�
				file.delete();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
