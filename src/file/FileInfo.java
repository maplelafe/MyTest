package file;

import java.io.File;
import java.text.SimpleDateFormat;
/**
 * 便利指定目录中的所有文件信息
 * @author acer
 * @date 2018年6月10日
 */
public class FileInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File ("D:"+File.separator+"msg.png");
		if(file.exists()&&file.isFile()){
			System.out.println("文件大小 (K) :"+Math.round(  (file.length()/(double)1024) * Math.pow(10, 2)    )/Math.pow(10, 2));//获取文件大小
			//System.out.println(file.length()/(double)1024);
			System.out.println("文件最后修改日期："+ new SimpleDateFormat("yyyy-mm-dd HH:mm:ss").format(file.lastModified()));
			//获取权限，设置权限
		}
		

		//列出目录中的所有级信息
		File filepathall = new File("F:"+File.separator+"绝地求生");
		//ListDir(filepathall);
		//ListDirError(filepathall);
		//ListDir(filepathall);
		new Thread(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				ListDir(filepathall);
			}
			
		}).start();
		System.out.println("正在输出结果................"); //ListDir出错仍然可以输出结果
	}
	public static void ListDir(File file){
		if(file.exists()&&file.isDirectory()){
			File[]  files= file.listFiles();
			if (files!=null){
				for (int x=0;x<files.length;x++){
					ListDir(files[x]);//反复执行	到最后一层			
				}
			}
		}
		System.out.println(file.getName());//最后执行，输出结果
	}
/**
 * 
 * @author acer
 * @param file
 */
	public static void ListDirError(File file){
		if(file.exists()&&file.isDirectory()){
			File[]  files= file.listFiles();
				for (int x=0;x<files.length;x++){
					ListDir(files[x]);//反复执行	到最后一层,无访问权限则会报错			
				}
		}
	}


}
