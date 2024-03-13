package exam07_제어문;

public class Statement06_반복문5_continue문 {

	public static void main(String[] args) {

	   for(int n=1;n<=5;++n) {
		   if(n==3)continue;
		   System.out.println("Hello" + n);
	   }
		//System.out.println(n);
	   System.out.println();
	   
	   // 1~10까지 반복하는데 짝수값만 출력하시오.
	   for(int i=1; i<=10; i++) {
		 if(i%2 == 0) {
		   System.out.println(i);
		 }
	   }
	   System.out.println();
	   
	   for(int i=1; i<=10; i++) {
		   if(i%2 != 0)continue;
			 System.out.println(i);
	   }
	   
	   
		System.out.println("END");
	}//end main
}
