package javautil;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 数据流
 * @author acer
 * @date 2018年7月11日
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
		//System.out.println(s.filter((e)->e.contains("a")).count()); 过滤器
		//System.out.println(s.filter((e)->e.contains("a")).collect(Collectors.toList()));//收集器，返回list
		//System.out.println(s.count());
	}
}
