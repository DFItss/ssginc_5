package exam05_연산자;

public class Operator05_증감연산자 {

	public static void main(String[] args) {

		//5. 증감 연산자 ( ++, -- )
		
		// 가. 증가 연산자
		//  ++변수명;  전치 , 1씩 증가
		//  변수명++;  후치 , 1씨 증가
		
		int n = 10;
		++n;  //전치, 풀어쓰면   n = n + 1; 동일.
		System.out.println(n);  // 11
		
		n++;  //후치, 풀어쓰면   n = n + 1; 동일
		System.out.println(n);  // 12
		
		// 나. 감소 연산자
		//  --변수명;  전치 , 1씩 감소
		//  변수명--;  후치 , 1씨 감소
		
		int n2 = 10;
		--n2; // 전치, 풀어쓰면   n2 = n2 - 1; 동일.
		System.out.println(n2);  // 9
	
		n2--; // 후치, 풀어쓰면   n2 = n2 - 1; 동일.
		System.out.println(n2);  // 8
		
		
		// 실행결과의 특징은 다른 연산자와 같이 사용하지 않고 독자적으로 증감연산자를 사용한 경우에는
		// 전치와 후치의 실행결과는 동일하다.
	}

}
