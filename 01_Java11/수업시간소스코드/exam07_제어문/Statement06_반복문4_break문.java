package exam07_제어문;

public class Statement06_반복문4_break문 {

	public static void main(String[] args) {

	   for(int n=1;n<=5;++n) {
		   if(n==3)break;
		   System.out.println("Hello" + n);
	   }
		//System.out.println(n);
		System.out.println("END");
	}//end main
}
