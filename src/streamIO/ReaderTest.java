package streamIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderTest {
	public static void main(String[] args) throws IOException {
		File f= new File("D:"+File.separator+"test.txt");
		if(f.exists()){
			 Reader r = new FileReader(f);
			 char[] c = new char[512];
			int k = r.read(c);
			System.out.println(new String(c,0,k));
			r.close();
		}
	}
}
