package file;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
/**
 * 文件合并操作
 * @author acer
 * @date 2018年6月10日
 */
public class CombineFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String patha = "D:"+File.separator+"a.txt";
		String pathb = "D:"+File.separator+"b.txt";
		File[] flist=  new File []{
				new File(patha),
				new File(pathb)
				};
//		System.out.println("start time:"+new Date(System.currentTimeMillis()));
//		System.out.println(readFile(flist[0]));
//		System.out.println("end time:"+new Date(System.currentTimeMillis()));
		String[] slist = new String[2];
		for ( int x = 0 ;x<flist.length;x++){
			slist[x]=readFile(flist[x]);
		}
		String[] a = slist[0].split(" ");
		String[] b = slist[1].split(" ");
		StringBuffer sb = new StringBuffer();
		for (int x=0;x<a.length;x++){
			sb.append(a[x]);
		}
		for(int x= 0;x<b.length;x++){
			sb.append(b[x]);
		}
		File outf= new File("D:"+File.separator+"c.txt");
		if(!outf.exists()){
			outf.createNewFile();
		}
		OutputStream os = new FileOutputStream(outf);
		os.write(sb.toString().getBytes());
		os.close();
		
	}
	/**
	 * 此类实现了一个输出流，其中的数据被写入一个 byte 数组。缓冲区会随着数据的不断写入而自动增长。可使用 toByteArray() 和 toString() 获取数据。 
	 * 关闭 ByteArrayOutputStream 无效。此类中的方法在关闭此流后仍可被调用，而不会产生任何 IOException
	 * read下一个数据字节；如果已到达文件末尾，则返回 -1。
	 * @param file
	 * @return
	 * @throws IOException
	 */
	public static String readFile(File file) throws IOException{
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		InputStream is = new FileInputStream(file);
		byte[] b = new byte[10];
		int temp =0;
		while((temp=is.read(b))!=-1){
			bos.write(b, 0, temp);
		}
		is.close();
		bos.close();
		bos.toByteArray();
		return new String(bos.toByteArray());//
		
	}

}
