package javautil;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Test {
	public static void main(String[] args) {
		
		Stack s= new Stack();
		s.push("1");
		s.push("2");
		System.out.println(s.pop());
		System.out.println(s.pop());
		//public interface Queue<E> extends Collection<E>
		Queue<String> q = new LinkedList<String>();
		q.add("1");
		q.add("2");
		System.out.println(q.poll());
		System.out.println(q.poll());
	}
}
