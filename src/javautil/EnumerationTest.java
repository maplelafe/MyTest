package javautil;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vector = new Vector<String>();
		vector.add("a");
		vector.add("b");
		vector.add("c");
		Enumeration<String> enu = vector.elements();
		while(enu.hasMoreElements()) {
			System.out.println(enu.nextElement());
		}
	}

}
