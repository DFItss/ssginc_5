package exam08_배열;

public class ArrayTest03_커맨드라인_arguments2 {

	public static void main(String [] args) {
		
		  // c:\> java Hello  10 + 20 
		  // 문자열 "10" ----> 정수형 10 로 변환필요
		  // int n = Integer.parseInt("10"); // 외우기
		  int v1 = Integer.parseInt(args[0]);  // "10" -- > 10
		  String op = args[1];
		  int v2 = Integer.parseInt(args[2]);  // "20" --> 20
		  
		  int result=0; // 로컬변수는 반드시 초기화 필요
		  switch(op) {
		     case "+": result = v1+v2; break;
		     case "-": result = v1-v2; break;
		  }
		  
		  System.out.println("결과값:" + result);
		  System.out.println("END");
	
	}//end main
}//end class
