package javautil;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {

	public static void main(String[] args) throws IOException, IOException {
		// TODO Auto-generated method stub
		/**
		 * 输出属性信息idao文件
		 */
		Properties p = new Properties();
		p.setProperty("bj", "beijing");
		p.setProperty("tj", "tianjing");
		System.out.println(p.getProperty("tj"));
		System.out.println(p.getProperty("j"));
		p.store( new FileOutputStream("D:"+File.separator+"area.properties"), "area info");
		//读取属性文件
		Properties p1 = new Properties();
		p1.load(new FileInputStream("D:"+File.separator+"area.properties"));
		System.out.println(p1.getProperty("bj"));
	}

}
