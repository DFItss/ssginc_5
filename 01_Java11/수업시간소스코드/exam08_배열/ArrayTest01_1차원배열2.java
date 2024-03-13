package exam08_배열;

public class ArrayTest01_1차원배열2 {

	public static void main(String[] args) {
	
		int [] num = new int[3];
		num[0]=10;
		num[1]=20;
		num[2]=30;
		
		// num[0] 얻어서 변수에 저장하자.
		int n = num[0];
		
		//1. 일반 for문 이용
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		System.out.println();
		
		//2. foreach문 ( 향상된 for문 )
		for (int x : num) {
			System.out.println(x);
		}
		
		
	}//end main
}//end class
