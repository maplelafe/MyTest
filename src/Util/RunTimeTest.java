package Util;

public class RunTimeTest {
	public static void main(String[] args) {
		String x = null;
		Runtime t=Runtime.getRuntime();// private Runtime() {} ���췽��˽�л���ֻ����һ��ʵ����������ģʽ
		//����ʽ����ģʽ��Runtime��ǰ�ڴ�ʹ����� public native long freeMemory();ȡ�õ�ǰ����
		System.out.println("1:maxMemory "+byteToM(t.maxMemory()));
		System.out.println("1:freeMemory "+byteToM(t.freeMemory()));
		System.out.println("1:totalMemory "+byteToM(t.totalMemory()));
		for (int i=0;i<1000;i++){
			  x= x +i ;
		}
		System.out.println("2:maxMemory "+byteToM(t.maxMemory()));
		System.out.println("2:freeMemory "+byteToM(t.freeMemory()));
		System.out.println("2:totalMemory "+byteToM(t.totalMemory()));
		t.gc();//�����ռ���
		System.out.println("3:maxMemory "+byteToM(t.maxMemory()));
		System.out.println("3:freeMemory "+byteToM(t.freeMemory()));
		System.out.println("3:totalMemory "+byteToM(t.totalMemory()));
		//GC �����ռ������ͷ����ÿռ䣬1�Զ������ڵ��ã�ʹ��Runtime.gc�ֹ�����
	}
	public static double byteToM(long m){
		return (double)m/2014/1024;
	}
}
