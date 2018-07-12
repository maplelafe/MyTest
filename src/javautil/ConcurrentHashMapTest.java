package javautil;

import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> m = new ConcurrentHashMap<Integer, String>();
		// int b=11;
		// System.out.println(b>>=1);
		// System.out.println(b);

		for (int x = 0; x < 10; x++) {
			new Thread(() -> {
				Random rand = new Random();
				int temp = rand.nextInt(1000);
				int result = temp % 3;
				switch (result) {
				case 0:
					System.out.println("0 Ͱ" + temp);
					break;
				case 1:
					System.out.println("1 Ͱ" + temp);
					break;
				case 2:
					System.out.println("2 Ͱ" + temp);
					break;
				}
			}).start();
		}

	}

}
