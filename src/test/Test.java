package test;

class Point <T> {  //T表示参数，是一个站位标记，描述里面的参数
	private T x;
	private T y;
	public T getX() {
		return x;
	}
	public void setX(T x) {
		this.x = x;
	}
	public T getY() {
		return y;
	}
	public void setY(T y) {
		this.y = y;
	}
		
}
public class Test {
	//泛型，通配符？用在参数上
	public static void main(String[] args) {
		Point<Integer> p = new Point<Integer> ();
		p.setX(20);
		p.setY(10);
		int x = (int) p.getX();
		int y = (int) p.getY();
		System.out.print(x+y);
		fun(p);
	}
	public  static void fun(Point<?> p){
		System.out.println(p.getX());
	}
	
}
