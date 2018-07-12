package javautil;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Persons> s= new HashSet<Persons>();
		s.add(new Persons("Alice",10));
		s.add(new Persons("Bob",20));
		s.add(new Persons("Lucy",30));
		s.add(new Persons("Lucy",20));
		System.out.println(s);

	}
}


class Persons{
	private String name;
	private Integer age;
	public Persons(String name,Integer age) {
		this.name=name;
		this.age=age;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "name:"+this.name+",age:"+this.age;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persons other = (Persons) obj;
		if (age == null) {
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
