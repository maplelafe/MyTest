package test;

interface A <R,P>{
	public R bj(P p1, P p2);
};

public class Iutil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�������ã�ȡ���� ,��String compare ����ȡ������bj
		A <Integer,String> iu = String :: compareTo;
		System.out.println(iu.bj("H", "h"));
		
	}

}
