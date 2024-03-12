package exam07_제어문;

import java.util.Scanner;

public class Statement03_다중if문2 {
	public static void main(String[] args) {

		// 다중 if~else문 : 비교해야 될 조건이 여러개인 경우에 사용
		
		
		/*
		    점수        학점
		  ----------------
		  90~100        A학점
		  80~89         B학점
		  70~79         C학점
		  나머지          F학점
		 */
		//문제: 키보드로 점수를 입력받아서 학점을 출력하시오.
		System.out.println("점수를 입력하시오");
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();  // 0 ~ 100 값 입력가정
		
		if( num >= 90  ) {
			System.out.println("A학점");
		}else if( num >= 80   ) {
			System.out.println("B학점");
		}else if( num >= 70  ) {
			System.out.println("C학점");
		}else {
			System.out.println("F학점");
		}
		
		System.out.println("end");
		
//		scan.close();
		
		
	}// end main
}
