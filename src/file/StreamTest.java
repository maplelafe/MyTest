package file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/**
 *  String json = "{\"id\":\"0001\",\"name\":\"小样\"}";\"表示"需要保留
 * \n换行 \r回车  \t 横向跳格 
 * @author acer
 * @date 2018年6月10日
 */
public class StreamTest {
	//IO属于资源处理，需要关闭(close)
	// 创建File类，创建字符或者字节的子类对象，进行数据读取或者写入，关闭流
	public static void main(String[] args) throws IOException {
		File file = new File ("d:"+File.separator+"test.txt");
		if(!file.exists()){
			file.createNewFile();
		}
		//InputStream，抽象类实例化
		OutputStream os= new FileOutputStream(file,true) ;
		//OutputStream os= new FileOutputStream(file) ;
		String msg = "www.baidu.com\r\n";	
		os.write(msg.getBytes()); // 
		byte msg1 []={1,2,3,4,5,6,7};
		//os.write(msg1,1,3);
        os.write(msg.getBytes(),1,3); //将 2，3，4写入文件,将指定 byte 数组中从偏移量 off 开始的 len 个字节写入此输出流 
        os.close(); 
	}
}
