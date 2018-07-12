package javautil;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * ������
 * @author acer
 * @date 2018��7��11��
 */
public class StreamTest {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("cb");
		list.add("cd");
		list.add("ce");
		list.add("cf");
		Stream<String> s = list.stream();
		System.out.println(s.skip(2).limit(3).map((e)->e.toUpperCase()).collect(Collectors.toList()));
		//System.out.println(s.filter((e)->e.contains("a")).count()); ������
		//System.out.println(s.filter((e)->e.contains("a")).collect(Collectors.toList()));//�ռ���������list
		//System.out.println(s.count());
	}
}
