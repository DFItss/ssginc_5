package exam08_배열;

public class ArrayTest02_2차원배열3_비정방형 {

	public static void main(String[] args) {
		
		// 비정방형 2차원 배열
		
		 //1. new 이용
		 int [][] num = new int[3][]; // 열 생성은 나중에
		 
		 // 열생성
		 num[0]=new int[1];
		 num[1]=new int[3];
		 num[2]=new int[2];
		
		 //초기화
		 num[0][0]=10;
		 num[1][0]=20;
		 num[1][1]=30;
		 num[1][2]=40;
		 num[2][0]=50;
		 num[2][1]=60;
		 
		 System.out.println("행의길이:" + num.length);
		 System.out.println("1행의 열길이:" + num[0].length);
		 System.out.println("2행의 열길이:" + num[1].length);
		 System.out.println("2행의 2열 요소 접근:" + num[1][1]);
		 
		 // 일반 for문
		 for(int row=0; row < num.length; row++) {
			 for(int col=0; col < num[row].length; col++) {
				System.out.printf("num[%d][%d]=%d \n", row, col, num[row][col]); 
			 }
		 }
		 System.out.println();
		 for(int[] n: num) {
			 for(int v : n) {
				 System.out.println(v);
			 }
		 }
	}//end main
}//end class
