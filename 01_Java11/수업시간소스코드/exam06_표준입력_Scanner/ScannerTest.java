package exam06_표준입력_Scanner;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {

		//Scanner 클래스 객체 생성
		//문법:  클래스명   변수명  = new 클래스명([값,값2,..]);
//		java.util.Scanner scn = new java.util.Scanner(System.in);
		
		Scanner scn = new Scanner(System.in);
		System.out.println("나이를 입력하시오");
		int age = scn.nextInt();
		System.out.println("이름을 입력하시오");
		String name = scn.next();
		/*
		 *   이름을 입력하시오.
		 *   홍길동 \n
		 */
		System.out.println("주소를 입력하시오");
		// 부산시 해운대구 우동
		String address1 = scn.next();
		String address2 = scn.nextLine();  // next() 보다 nextLine() 더 효율적
		
		System.out.println("나이:" + age);
		System.out.println("이름:" + name);
		System.out.println("주소:" + address1 +"\t" + address2);
		
		
	}
}
