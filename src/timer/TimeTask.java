package timer;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimeTask {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����ִ��ʱ��
//		Calendar calendar = Calendar.getInstance();
//		int year = calendar.get(Calendar.YEAR); 
//		int month = calendar.get(Calendar.MONTH); 
//		int day =calendar.get(Calendar.DAY_OF_MONTH);
//		calendar.set(year, month, day, 01, 00, 00);  //��ʱÿ��1��ִ��
//		Date date = calendar.getTime();
//		System.out.println(date);
//		int period = 24 * 60 * 60 * 1000;
		//Timer  timer= new Timer(true);
		//�����еķ��ػ��߳̽���ʱ������Ҳ����ֹ�ˣ�ͬʱ��ɱ�������е������ػ��߳�
		Timer  timer= new Timer(true);//��ʱ����Ϊ�ػ����̣���System.out.println("111")�������ػ������Զ�����
		timer.schedule(new Task(), 1000, 1000);//�ӳ�1�룬ÿһ��Ϊ����
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
