package exam01_데이터종류;

public class PDT01_정수형 {

	public static void main(String[] args) {

		// 정수형 리터럴 표현 방법
		//1. 10진수
		System.out.println(100);
		System.out.println(100L); // long타입으로 처리
		
		//2. 2진수 ( 0b값, 0|1 )
		System.out.println(0b01);
		System.out.println(0b10);
		System.out.println(0b11);
		
		//3. 8진수 ( 0값, 0~7 )
		System.out.println(01);
		System.out.println(02);
		System.out.println(07);
		
		//4. 16진수 ( 0x값, 0~9, A,B,C,D,E,F )
		System.out.println(0x1);
		System.out.println(0x2);
		System.out.println(0x7);
		System.out.println(0xA);
		System.out.println(0xF);
	}

}
