package others;
//�۲���ģʽ
import java.util.Observable;
import java.util.Observer;
//����һ�����۲���
class House extends Observable{
	private double privice;
	public House(double privice){
		this.privice=privice;
	}
	public void setPrivice(double price) {
		if(price > this.privice){
			super.setChanged();//��ע���ݸı�
			super.notifyObservers(price);
		}
		this.privice=price;
	}
}
//�۲���ģʽ������һ���۲���
class Person implements Observer{

	@Override
	public void update(java.util.Observable o, Object arg) {
		// TODO Auto-generated method stub
		if (o instanceof House){
			if (arg instanceof Double){
				System.out.println("�۸����ǣ�" + arg);
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
