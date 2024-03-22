package exam19_util;

import java.util.Arrays;

//클래스 밖에 
enum Day{
	SUNDAY, MONDAY, TUESDAY
}
public class Util06_enum {
	// 클래스 안에서 
	enum Day2{
		SUNDAY, MONDAY, TUESDAY
	}
	public static void main(String[] args) {

		// 1. enum 얻기
		Day d = Day.SUNDAY;
		switch (d) {
		
		case SUNDAY: System.out.println("SUNDAY");break;
		case MONDAY:System.out.println("MONDAY");break;
		default:System.out.println("default");break;
		
		}
		
		Day [] days = Day.values();
		System.out.println(Arrays.toString(days)); // [SUNDAY, MONDAY, TUESDAY]
        		
	}
}

