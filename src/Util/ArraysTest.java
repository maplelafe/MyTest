package Util;

import java.util.Arrays;

public class ArraysTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long[] a =new long []{1,2,3,44,5,6,7,8,9,22,32};
		long[] b =new long []{1,2,3,44,5,6,7,8,9,22,32};
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.equals(a, b));
		//�˷�Ϊ�������������ʲ�ѯǰ��Ҫ��sort()���������������������û�����������ǲ�ȷ����
		System.out.println(Arrays.binarySearch(b, 2));
		System.out.println(Arrays.binarySearch(b, 5));
		Arrays.sort(a);
		System.out.println(Arrays.binarySearch(a, 2));
		System.out.println(Arrays.binarySearch(a, 5));
		//���ַ����ң��������Ƚϣ����
	}

}
