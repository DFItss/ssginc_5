package exam07_제어문;

import java.util.Scanner;

public class Statement03_다중if문3 {
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
		String mesg = "";
		if( num >= 90  ) {
			mesg ="A학점";
		}else if( num >= 80   ) {
			mesg ="B학점";
		}else if( num >= 70  ) {
			mesg ="C학점";
		}else {
			mesg ="F학점";
		}
		
		System.out.println(mesg);
		System.out.println("end");
		
//		scan.close();
		
		
	}// end main
}
