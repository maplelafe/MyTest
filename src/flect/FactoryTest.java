package flect;
/**
 * 工厂类+泛型
 * @author acer
 *
 */
class  Factory{
	public static <T> T getInstance(String name) throws Exception{
		T f = null;
		f = (T) Class.forName(name).newInstance();
		//工厂方法获取对象实例，方便扩充子类的功能
		return f;
	}
}

public class FactoryTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Fruit f = Factory.getInstance("flect.Apple");
			f.eat();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
interface Fruit{
	public void eat();
};
class Apple implements Fruit{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("eat apple!");
	}
}
class Orange implements Fruit{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("eat Orange!");
	}
}

