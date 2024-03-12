package exam05_연산자;

public class Operator04_논리연산자2_실제활용 {

	public static void main(String[] args) {

		//4. 논리 연산자 실 활용( &&, ||, ! )
        // 실제로는 true/false값을 반환하는 비교연산자와 같이 사용된다.
		
		int n = 10;
		int n2 = 3;
		
		//문제1: n값이 15보다 크고(그리고) n2값이 5보다 작냐?
		 boolean result =(n > 15)&&( n2 < 5 ) ;
		 System.out.println(result);  // false
		 
		//문제2: n값이 15보다 크거나(또는) n2값이 5보다 작냐? 
		 boolean result2 =(n > 15)||( n2 < 5 ) ;
		 System.out.println(result2);  // true
		
	}

}
