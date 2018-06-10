package file;

import java.io.File;
import java.text.SimpleDateFormat;
/**
 * ����ָ��Ŀ¼�е������ļ���Ϣ
 * @author acer
 * @date 2018��6��10��
 */
public class FileInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File ("D:"+File.separator+"msg.png");
		if(file.exists()&&file.isFile()){
			System.out.println("�ļ���С (K) :"+Math.round(  (file.length()/(double)1024) * Math.pow(10, 2)    )/Math.pow(10, 2));//��ȡ�ļ���С
			//System.out.println(file.length()/(double)1024);
			System.out.println("�ļ�����޸����ڣ�"+ new SimpleDateFormat("yyyy-mm-dd HH:mm:ss").format(file.lastModified()));
			//��ȡȨ�ޣ�����Ȩ��
		}
		

		//�г�Ŀ¼�е����м���Ϣ
		File filepathall = new File("F:"+File.separator+"��������");
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
		System.out.println("����������................"); //ListDir������Ȼ����������
	}
	public static void ListDir(File file){
		if(file.exists()&&file.isDirectory()){
			File[]  files= file.listFiles();
			if (files!=null){
				for (int x=0;x<files.length;x++){
					ListDir(files[x]);//����ִ��	�����һ��			
				}
			}
		}
		System.out.println(file.getName());//���ִ�У�������
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
					ListDir(files[x]);//����ִ��	�����һ��,�޷���Ȩ����ᱨ��			
				}
		}
	}


}
