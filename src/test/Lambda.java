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
	//函数式编程，最具表现性haskell ,scala 面向对象编程
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IMessage i = new IMessage(){

			@Override
			public void print() {
				// TODO Auto-generated method stub
				System.out.println("Lambda!");
			}			
		}; //匿名内部类
//		i.print();
		
		IMath im =  (p1,p2) -> p1+p2;
		
//		System.out.println(im.add(1, 2));
		
		//4类函数是接口
		//Interface Function<T,R>{R apply(T t);} 有传入，有传出
		//Interface Consumer<T>{void accept(T t)} 有传入，无传出
		//Interface Supplier<T>{T get();} 无传入，有传出
		//Interface Predicate<T>{boolean test(T t);}断言
		//功能性函数式接口
		Function <Integer,String> fun = String::valueOf;
		System.out.println(fun.apply(100));
		IntFunction <String> funint = String::valueOf;
		System.out.println(funint.apply(100));
//		
//		Consumer <Integer,String> con = String::valueOf;
//		System.out.println(con.accept(100));
	}

}
