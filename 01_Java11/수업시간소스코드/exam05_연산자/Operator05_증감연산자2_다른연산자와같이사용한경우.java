package exam05_연산자;

public class Operator05_증감연산자2_다른연산자와같이사용한경우 {

	public static void main(String[] args) {

		//5. 증감 연산자 ( ++, -- ) 와 다른 연산자와 같이 사용하는 경우
		// 주의: 전치 또는 후치에 따라서 저장되는 변수값이 달라질 수 있음.
		
		int num = 10;
		int num2 = 10;
		
		// 문제1: num을 1 증가시키고 새로운 변수 result에 저장하시오.
		int result = ++num;  // 전치 ==> 먼저 증가되고 나중에 할당됨.
		System.out.println(result + " " + num);   // 11 11
	
		// 문제1: num2을 1 증가시키고 새로운 변수 result2에 저장하시오.
		int result2 = num2++; // 후치 ==> 먼저 할당하고 나중에 증가됨.
		System.out.println(result2 + " " + num2);  // 10 11
		
	}

}
