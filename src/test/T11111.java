package test;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class T11111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num=8.8888888342349E10;
		String str=new DecimalFormat("0.00").format(num);//ע�⣬���ַ�ʽ�Ǳ�����λС��
		System.out.println(str);
//		Double d = new Double("1234567890.12");   
//		System.out.println("d:="+d);  
//		java.text.NumberFormat NF = java.text.NumberFormat.getInstance();   
//		NF.setGroupingUsed(false);//ȥ����ѧ��������ʾ
//		System.out.println("d:="+NF.format(d));
//		System.out.println("d:="+d); 
	}

}
