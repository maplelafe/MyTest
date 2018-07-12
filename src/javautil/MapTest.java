package javautil;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> m = new HashMap<Integer, String>();
		m.put(1, "a");
		m.put(1, "b");
		m.put(2, "c");
		
		Set<Entry<Integer, String>> setmap=m.entrySet();
		Iterator<Entry<Integer,String>> it = setmap.iterator();
		while(it.hasNext()) {
			Entry<Integer,String> entry = it.next();
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		System.out.println(m);	
	}

}
