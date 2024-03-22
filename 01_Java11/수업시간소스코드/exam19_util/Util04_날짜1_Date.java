package exam19_util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Util04_날짜1_Date {

	public static void main(String[] args) throws Exception{

		
		Date d = new Date();
		System.out.println(d); 
		// Fri Mar 22 14:45:08 KST 2024, d.toString() 
		
		// java.text.SimpleDateFormat 적용
		// 1. Date -----> 특정포맷을 가진 문자열로 변경
		SimpleDateFormat sdf = new  SimpleDateFormat("yyyy");
		String year = sdf.format(d);
		System.out.println("year: " + year );
		
		SimpleDateFormat sdf2 = new  SimpleDateFormat("yyyy/MM/dd");
		String year2 = sdf2.format(d);
		System.out.println("year/MM/dd: " + year2 );
		
		SimpleDateFormat sdf3 = new  SimpleDateFormat("yyyy/MM/dd, HH:mm:ss");
		String year3 = sdf3.format(d);
		System.out.println("year/MM/dd, HH:mm:ss: " + year3 );
		
		SimpleDateFormat sdf4 = new  SimpleDateFormat("yyyy년MM월dd일 HH:mm:ss");
		String year4 = sdf4.format(d);
		System.out.println("yyyy년MM월dd일 HH:mm:ss: " + year4 );
		
		// 2.  특정포맷을 가진 날짜형식의 문자열 --> Date
		SimpleDateFormat k = new  SimpleDateFormat("yyyy년MM/dd");
		String s = "2002년11/12";
		Date d2 =  k.parse(s)  ;
		System.out.println(d2);
	}
}
