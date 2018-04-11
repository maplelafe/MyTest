package test;

import java.util.function.Function;
import java.util.function.IntFunction;

interface IMessage{
	public void print();
}
@FunctionalInterface
interface IMath{
	public int add( int x, int y);
}
public class Lambda {
	//����ʽ��̣���߱�����haskell ,scala ���������
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IMessage i = new IMessage(){

			@Override
			public void print() {
				// TODO Auto-generated method stub
				System.out.println("Lambda!");
			}			
		}; //�����ڲ���
//		i.print();
		
		IMath im =  (p1,p2) -> p1+p2;
		
//		System.out.println(im.add(1, 2));
		
		//4�ຯ���ǽӿ�
		//Interface Function<T,R>{R apply(T t);} �д��룬�д���
		//Interface Consumer<T>{void accept(T t)} �д��룬�޴���
		//Interface Supplier<T>{T get();} �޴��룬�д���
		//Interface Predicate<T>{boolean test(T t);}����
		//�����Ժ���ʽ�ӿ�
		Function <Integer,String> fun = String::valueOf;
		System.out.println(fun.apply(100));
		IntFunction <String> funint = String::valueOf;
		System.out.println(funint.apply(100));
//		
//		Consumer <Integer,String> con = String::valueOf;
//		System.out.println(con.accept(100));
	}

}
