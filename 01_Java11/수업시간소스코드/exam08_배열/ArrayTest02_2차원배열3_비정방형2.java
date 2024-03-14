package exam08_배열;

public class ArrayTest02_2차원배열3_비정방형2 {

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
		 
		 //2. 리터널 이용
		 int [][] num2 = { {10},{20,30,40},{50,60}};
		 
		 //3. new + 리터널 이용
		 int [][] num3 = new int[][]{ {10},{20,30,40},{50,60}};
	
		 // 일반 for문
		 for(int row=0; row < num3.length; row++) {
			 for(int col=0; col < num3[row].length; col++) {
				System.out.printf("num[%d][%d]=%d \n", row, col, num3[row][col]); 
			 }
		 }
		 System.out.println();
		 for(int[] n: num3) {
			 for(int v : n) {
				 System.out.println(v);
			 }
		 }
	}//end main
}//end class
