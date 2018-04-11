package streamIO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f= new File("D:"+File.separator+"test.txt");
		if (!f.getParentFile().exists()){
			f.getParentFile().mkdirs();
		}
		Writer w = new FileWriter(f);
		w.write("111111");
		w.close();
	}

}
