package exam05_연산자;

public class Operator01_산술연산자 {

	public static void main(String[] args) {

		//1. 산술 연산자 ( +, -, *, /, % )
		
		int n = 10;
		int n2 = 3;
		
		//필요시 연산결과를 변수에 저장할 수 있다. 변수에 저장하는 이유는 결과값을 계속 사용하기 위해서.
		int result = n + n2;
		System.out.println(result); // 13
		System.out.println(n + n2); // 13
		System.out.println(n - n2); // 7
		System.out.println(n * n2); // 30
		System.out.println(n / n2); // 3   (몫)
		System.out.println(n % n2); // 1   (나머지)
		
		// 기본형의 실수값의 연산결과는 정확도가 떨어짐. 클래스로 정확도를 높일수 있다.
		System.out.println( 10 / 3.0); // 3.3333333333333335
		
		//2. + ==> 연결 연산자로 사용될 수도 있다.
		System.out.println("hello" + 10);  // hello10
		String s = 10+20+30+"hello";  // 60hello
		String s2 = "hello"+10+20+30; // hello102030
		System.out.println(s);
		System.out.println(s2);
		
	}

}
