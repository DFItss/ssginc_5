package exam05_연산자;

public class Operator03_비교연산자 {

	public static void main(String[] args) {

		//3. 비교 연산자 ( >, >=, <, <=, ==, !=)
		// 실행결과는 논리값 ( true/false) 으로 반환됨.
		
		int n = 10;
		int n2 = 3;
		
		System.out.println(n>n2); // n이 n2보다 크냐?
		System.out.println(n>=n2); // n이 n2보다 크거나 같냐?
		System.out.println(n<n2); // n이 n2보다 작냐?
		System.out.println(n<=n2); // n이 n2보다 작거나 같냐?
		System.out.println(n==n2); // n이 n2보다 같냐?
		System.out.println(n!=n2); // n이 n2보다 같지 않냐?
		
 	    //실행결과값을 계속 사용하기 위해서 변수에 저장할 수 있다.
		boolean result = n > n2;
		System.out.println(result); // n이 n2보다 크냐?
		
	}

}
