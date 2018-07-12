package javautil;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Stream;

/**
 * 使用数据流统计order的总金额
 * @author acer
 * @date 2018年7月11日
 */
public class MapReduceTest {
	public static void main(String[] args) {
		List<Order> list = new ArrayList<Order>();
		list.add(new Order("notebook",10,10000.00));
		list.add(new Order("desk",100,1000.00));
		list.add(new Order("book",1000,100.00));
		Stream<Order> all = list.stream();
		/**
		 *     Optional<T> reduce(BinaryOperator<T> accumulator);
		 *     <R> Stream<R> map(Function<? super T, ? extends R> mapper);
		 */
/*		Double allsum=all.map((e)->e.getAmount()*e.getPrice()).reduce((sum,x)->sum*x).get();//统计累加
		System.out.println(new BigDecimal(allsum));*/
		DoubleSummaryStatistics dss=all.mapToDouble((e)->e.getAmount()*e.getPrice()).summaryStatistics();
		System.out.println(dss.getAverage());
		System.out.println(dss.getCount());
		System.out.println(dss.getMax());
		System.out.println(dss.getMin());
		System.out.println(dss.getSum());

	}
}
class Order{
	private String name;
	private long amount;
	private double price;
	public Order(String name, long amount, double price) {
		super();
		this.name = name;
		this.amount = amount;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
