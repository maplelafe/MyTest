package flect;
/**
 * 泛型的使用
 * @author acer
 *
 */
public class GenTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gen<String> s= new Gen<String>("1111");
		s.showType();
		System.out.println(s.getT()); ;
	}

}
class Gen <T>{
	private T t ;

	public Gen(T t) {
		super();
		this.t = t;
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	public void showType(){
		System.out.println("t的类型是"+t.getClass().getName());
		
	}
}
