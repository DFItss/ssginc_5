package exam08_배열;

public class ArrayTest02_2차원배열2 {

	public static void main(String[] args) {
		
		// 정방형 2차원 배열 생성하는 3가지 방법
		
		//1. new 이용
		 int [][] num = new int[3][2]; //3행 2열
		 num[0][0]=1;
		 num[0][1]=2;
		 num[1][0]=3;
		 num[1][1]=4;
		 num[2][0]=5;
		 num[2][1]=6;
		 
		//2. 리터럴 이용
		// 문법:  데이터타입 [][] 배열명 = { { 값1, 값2 }, { 값1, 값2}, {값1, 값2} }; 
		 
		 int [][] num2 = {{1,2},{3,4},{5,6}}; // 한번에 정의해야 된다.
		 
		 System.out.println();
		 for(int[] n: num2) {
			 for(int v : n) {
				 System.out.println(v);
			 }
		 }
		 
		//3. new + 리터럴 혼합
		// 문법:  데이터타입 [][] 배열명 = new 데이터타입[][] { { 값1, 값2 }, { 값1, 값2}, {값1, 값2} }; 
		 int [][] num3;
		 num3 = new int[][]{{1,2},{3,4},{5,6}};  // size  지정불가
		 
		 System.out.println();
		 for(int[] n: num3) {
			 for(int v : n) {
				 System.out.println(v);
			 }
		 }
		 

	}//end main
}//end class
