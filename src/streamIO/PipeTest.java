package streamIO;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * 多线程之间管道通信
 * @author acer
 * @date 2018年7月11日
 */
public class PipeTest {
	public static void main(String[] args) throws IOException {
     final PipedOutputStream output = new PipedOutputStream();
      final PipedInputStream  input  = new PipedInputStream(output);
		
		Thread t1=new Thread(()->{
			try {
				output.write( "Hello world,pipe!".getBytes());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		Thread t2=new Thread(()->{
			try {
              int data = input.read();
              while( data != -1){
                  System. out.print(( char) data);
                  data = input.read();
				}
			} catch (IOException e) {
				
			}finally {
				try {
					 input.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		t1.start();
		t2.start();		
}
}
