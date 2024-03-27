package exam23_표준API함수형인터페이스;

import java.util.function.BinaryOperator;
import java.util.function.Function;

class Calc{
	
	public static int methodA(int x, int y) { return x+y;}
}

public class Functional07_메서드호출 {

	public static void main(String[] args) {

	
		// 메서드 호출 ( method reference): 람다 표현식의 축약된 표현식
		//1. static 메서드 사용:   문법: 클래스명::static메서드명
		BinaryOperator<Integer> s = (a,b)->{return Calc.methodA(a, b);};
		BinaryOperator<Integer> s2 = (a,b)->Calc.methodA(a, b);
		BinaryOperator<Integer> s3 = Calc::methodA;
		
		int result = s3.apply(10, 20);
		System.out.println(result);
		
		// "100" ----> 100
		Function<String, Integer> f = x->{ return Integer.parseInt(x);};
		Function<String, Integer> f2 = x->Integer.parseInt(x);
		Function<String, Integer> f3 = Integer::parseInt;
		
		int result2 = f3.apply("100");
		System.out.println(result2);
		
		//2. 인스턴스 메서드 사용
		
		
		
	}//end main

}
