package Util;

import java.util.Arrays;

public class ArraysTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long[] a =new long []{1,2,3,44,5,6,7,8,9,22,32};
		long[] b =new long []{1,2,3,44,5,6,7,8,9,22,32};
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.equals(a, b));
		//此法为二分搜索法，故查询前需要用sort()方法将数组排序，如果数组没有排序，则结果是不确定的
		System.out.println(Arrays.binarySearch(b, 2));
		System.out.println(Arrays.binarySearch(b, 5));
		Arrays.sort(a);
		System.out.println(Arrays.binarySearch(a, 2));
		System.out.println(Arrays.binarySearch(a, 5));
		//二分法查找，拷贝，比较，填充
	}

}
