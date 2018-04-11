package Util;

public class RunTimeTest {
	public static void main(String[] args) {
		String x = null;
		Runtime t=Runtime.getRuntime();// private Runtime() {} 构造方法私有化，只能有一个实例化，单利模式
		//饿汉式单例模式，Runtime当前内存使用情况 public native long freeMemory();取得当前空余
		System.out.println("1:maxMemory "+byteToM(t.maxMemory()));
		System.out.println("1:freeMemory "+byteToM(t.freeMemory()));
		System.out.println("1:totalMemory "+byteToM(t.totalMemory()));
		for (int i=0;i<1000;i++){
			  x= x +i ;
		}
		System.out.println("2:maxMemory "+byteToM(t.maxMemory()));
		System.out.println("2:freeMemory "+byteToM(t.freeMemory()));
		System.out.println("2:totalMemory "+byteToM(t.totalMemory()));
		t.gc();//垃圾收集类
		System.out.println("3:maxMemory "+byteToM(t.maxMemory()));
		System.out.println("3:freeMemory "+byteToM(t.freeMemory()));
		System.out.println("3:totalMemory "+byteToM(t.totalMemory()));
		//GC 垃圾收集器，释放无用空间，1自动不定期调用，使用Runtime.gc手工调用
	}
	public static double byteToM(long m){
		return (double)m/2014/1024;
	}
}
