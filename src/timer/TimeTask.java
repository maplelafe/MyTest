package timer;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimeTask {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//设置执行时间
//		Calendar calendar = Calendar.getInstance();
//		int year = calendar.get(Calendar.YEAR); 
//		int month = calendar.get(Calendar.MONTH); 
//		int day =calendar.get(Calendar.DAY_OF_MONTH);
//		calendar.set(year, month, day, 01, 00, 00);  //定时每天1点执行
//		Date date = calendar.getTime();
//		System.out.println(date);
//		int period = 24 * 60 * 60 * 1000;
		//Timer  timer= new Timer(true);
		//当所有的非守护线程结束时，程序也就终止了，同时会杀死进程中的所有守护线程
		Timer  timer= new Timer(true);//定时器作为守护进程，当System.out.println("111")结束，守护进程自动结束
		timer.schedule(new Task(), 1000, 1000);//延迟1秒，每一秒为周期
		try {
			Thread.currentThread().sleep(50000);
			System.out.println("111");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


}
class Task extends TimerTask{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));

	}

}
