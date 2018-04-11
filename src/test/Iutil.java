package test;

interface A <R,P>{
	public R bj(P p1, P p2);
};

public class Iutil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//方法引用，取别名 ,给String compare 方法取个别名bj
		A <Integer,String> iu = String :: compareTo;
		System.out.println(iu.bj("H", "h"));
		
	}

}
