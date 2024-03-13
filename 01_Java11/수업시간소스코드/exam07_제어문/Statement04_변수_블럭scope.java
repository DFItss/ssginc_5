package exam07_제어문;

public class Statement04_변수_블럭scope {

	public static void main(String[] args) {

	      int num= 10; //로컬변수
	      if(true){
	         System.out.println(num);
	         int num2 = 20; //로컬변수
	         System.out.println(num2); 
	      }
	      System.out.println(num);
	      //System.out.println(num2);  //에러 발생
		
	}//end main
}
