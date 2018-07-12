package javautil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub Vector,LinkedList,Set
//		List<String> l = new ArrayList<String>(); //有序可重复
//		l.add("hello");
//		l.add("world");
//		l.add("!");
//		Iterator it = l.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
//		System.out.println(l.contains("!"));
		
		List<Person> pl = new ArrayList<Person>();
		pl.add(new Person("Alice",11));
		pl.add(new Person("bob",12));
		pl.remove(new Person("bob",12));
		for (int x=0;x<pl.size();x++) {
			System.out.println(pl.get(x));
		}
		System.out.println(pl.contains(new Person("bob",12)));
		
		//List k = new LinkedList(); 
	}
	

}
class Person {
	private String name;
	private Integer age;
	
	Person( String name,Integer age){
		this.name=name;
		this.age=age;
	}
	//contains,remove要实现equals方法
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
}
