package exam08_배열;

public class ArrayTest01_1차원배열 {

	public static void main(String[] args) {
		
		// 정수값 3개 저장하자. 10 20 30
		
		//1. 배열선언
		int [] num;  // num 변수? 변수, 참조형변수, int 배열타입의 변수, 로컬변수(stack에 저장)

		//2. 배열생성 ( new 이용, new 하면 무조건 heap 메모리에 생성됨 )
		num = new int[3];  // 3개의 요소로 구성된 배열이 heap 메모리에 생성된다. 자동초기화됨
		
		// 한번에 가능.
		// int [] num2 = new int[3];
		
		//3. 배열요소접근
		System.out.println(num.length);
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		
		//3. 배열초기화
		num[0]=10;
		num[1]=20;
		num[2]=30;
		
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		
	}//end main
}//end class
