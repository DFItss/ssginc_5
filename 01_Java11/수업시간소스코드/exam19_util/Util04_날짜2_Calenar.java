package exam19_util;

import java.util.Calendar;

public class Util04_날짜2_Calenar {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		
		// 현재시간 얻기
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;  // 0 부터 관리
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.println("년도: " +  year);
		System.out.println("월: " +  month);
		System.out.println("일: " +  day);
		System.out.println("시간: " +  hour);
		System.out.println("분: " +  minute);
		System.out.println("초: " +  second);
		
		//특정 날짜 설정
		Calendar cal2 = Calendar.getInstance();
		cal2.set(2002, 2, 15);
		int year2 = cal2.get(Calendar.YEAR);
		int month2 = cal2.get(Calendar.MONTH)+1;  // 0 부터 관리
		int day2 = cal2.get(Calendar.DAY_OF_MONTH);
		
		System.out.println("설정 년도: " +  year2);
		System.out.println("설정 월: " +  month2);
		System.out.println("설정 일: " +  day2);
		
		/*
		 java.util.GregorianCalendar
		 [time=1711086467464,
		  areFieldsSet=true,
		  areAllFieldsSet=true,
		  lenient=true,
		  zone=sun.util.calendar.ZoneInfo[id="Asia/Seoul",
		                                  offset=32400000,
		                                  dstSavings=0,
		                                  useDaylight=false,
		                                  transitions=30,
		                                  lastRule=null],
		                                  firstDayOfWeek=1,
		                                  minimalDaysInFirstWeek=1,
		                                  ERA=1,
		                                  YEAR=2024,
		                                  MONTH=2, // 월은 내부적으로 배열로 관리 0이 1월임.
		                                  WEEK_OF_YEAR=12,
		                                  WEEK_OF_MONTH=4,
		                                  DAY_OF_MONTH=22,
		                                  DAY_OF_YEAR=82,
		                                  DAY_OF_WEEK=6,
		                                  DAY_OF_WEEK_IN_MONTH=4,
		                                  AM_PM=1,
		                                  HOUR=2,
		                                  HOUR_OF_DAY=14,
		                                  MINUTE=47,
		                                  SECOND=47,
		                                  MILLISECOND=464,
		                                  ZONE_OFFSET=32400000,
		                                  DST_OFFSET=0] 
		  
		 */
	}
}
