package Util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		SimpleDateFormat myFmt=new SimpleDateFormat("yyyy��MM��dd�� HHʱmm��ss��");
        SimpleDateFormat myFmt1=new SimpleDateFormat("yy/MM/dd HH:mm"); 
        SimpleDateFormat myFmt2=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//�ȼ���now.toLocaleString()
        SimpleDateFormat myFmt3=new SimpleDateFormat("yyyy��MM��dd�� HHʱmm��ss�� E ");
        SimpleDateFormat myFmt4=new SimpleDateFormat(
                "һ���еĵ� D �� һ���е�w������ һ���е�W������ ��һ����kʱ zʱ��");
        Date now=new Date();
        String sb = myFmt.format(now);
        Date d= myFmt.parse(sb);
        System.out.println(myFmt.format(now));
        System.out.println(myFmt1.format(now));
        System.out.println(myFmt2.format(now));
        System.out.println(myFmt3.format(now));
        System.out.println(myFmt4.format(now));
        System.out.println(now.toGMTString());
        System.out.println(now.toLocaleString());
        System.out.println(now.toString());
        System.out.println(d);
	}

}
