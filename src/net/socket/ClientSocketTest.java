package net.socket;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientSocketTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Socket socket = new Socket("127.0.0.1",9999);
			Scanner s = new Scanner(socket.getInputStream()) ;//ɨ�������ı�
			s.useDelimiter("\n");//����ɨ�����ķָ�ģʽ����Ϊָ��ģʽ
			if(s.hasNext()) {
				System.out.println(s.next());
			}
			s.close();
			socket.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
