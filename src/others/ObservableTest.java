package others;
//观察者模式
import java.util.Observable;
import java.util.Observer;
//定义一个被观察者
class House extends Observable{
	private double privice;
	public House(double privice){
		this.privice=privice;
	}
	public void setPrivice(double price) {
		if(price > this.privice){
			super.setChanged();//关注内容改变
			super.notifyObservers(price);
		}
		this.privice=price;
	}
}
//观察者模式，定义一个观察者
class Person implements Observer{

	@Override
	public void update(java.util.Observable o, Object arg) {
		// TODO Auto-generated method stub
		if (o instanceof House){
			if (arg instanceof Double){
				System.out.println("价格上涨：" + arg);
			}
			
		}
	}	
}


public class ObservableTest {
	public static void main(String[] args) {
		Person a = new Person();
		Person b = new Person();
		Person c = new Person();
		House h = new House(8000);
		h.addObserver(a);
		h.addObserver(b);
		h.addObserver(c);
		h.setPrivice(150000.0);
	} 
}
