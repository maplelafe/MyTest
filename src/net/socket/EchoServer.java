package net.socket;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServer {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ServerSocket server = new ServerSocket(8888);
		Socket client = server.accept();
		Scanner scan = new Scanner(client.getInputStream());//���ܿͻ�����
		scan.useDelimiter("\n");
		PrintStream out = new PrintStream(client.getOutputStream());//�Կͻ��˵Ļ�Ӧ��Ϣ
		boolean flag = true;
		while(flag) {
			if (scan.hasNext()) {
				String str=scan.next().trim();
				if ("byebye".equals(str)) {
					System.out.println("BYEBYE!");
					flag=false;
					break;
				}				
			}
		}
		out.close();
		scan.close();
	}

}
