package flect;
/**
 * 泛型(参数化类型)
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
/**
 * JDK5中的泛形允许程序员在编写集合代码时，就限制集合的处理类型，从而把原来程序运行时可能发生问题，
 * 转变为编译时的问题，以此提高程序的可读性和稳定性(尤其在大型程序中更为突出)
 * @author acer
 * @date 2018年6月10日
 * @param <T>
 */
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
