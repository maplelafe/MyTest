package Util;

import java.math.BigDecimal;
import java.util.Random;

public class MathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Math.random());//大于等于 0.0 且小于 1.0。
		System.out.println(Math.round(1.5));
		System.out.println(Math.round(-1.5));
		System.out.println(Math.abs(-1.1));
		System.out.println(MyMath.round(10.234, 2));
		
		char[] s = new char[]{'a','b','c','d','e'};
		Random r= new Random();
		for(int x=0;x<3;x++){
			System.out.print(s[r.nextInt(s.length)]);
		}
		double dd = 2323432412323233.23;
		BigDecimal bd = new BigDecimal(dd).pow(12);//占用资源
		System.out.println(bd);
	}

}
class MyMath{
	public static double round(double s,int scale){		
		return Math.round(s*Math.pow(10, scale))/Math.pow(10, scale);
	}
}
