package file;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("d:"+File.separator+"hello.txt"); //创建文件对象，程序中的\，要使用双\\
		try {
			if (!file.exists()){
				file.createNewFile();//创建空文件
			}

			if(file.exists()){ //删除文件
				file.delete();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
