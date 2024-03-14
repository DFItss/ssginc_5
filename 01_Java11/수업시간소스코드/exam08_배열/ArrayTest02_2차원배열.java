package exam08_배열;

public class ArrayTest02_2차원배열 {

	public static void main(String[] args) {
		
		// 정방형 2차원 배열
		
		// 1. 2차원 배열 선언
		 int [][] num;
		 
		//2. 배열 생성
		 num = new int[3][2];
		 
		 System.out.println("행의길이:" + num.length);
		 System.out.println("1행의 열길이:" + num[0].length);
		 System.out.println("2행의 2열 요소 접근:" + num[1][1]);
		 
		 //3. 배열 초기화
		 num[0][0]=1;
		 num[0][1]=2;
		 num[1][0]=3;
		 num[1][1]=4;
		 num[2][0]=5;
		 num[2][1]=6;
		 
		 // 4. 배열 순회
		 // 일반 for문
		 for(int row=0; row < num.length; row++) {
			 for(int col=0; col < num[row].length; col++) {
				System.out.printf("num[%d][%d]=%d \n", row, col, num[row][col]); 
			 }
		 }
		 
		 // foreach문
		 System.out.println();
		 for(int[] n: num) {
			 for(int v : n) {
				 System.out.println(v);
			 }
		 }
		 
		 

	}//end main
}//end class
