package exam23_표준API함수형인터페이스;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

class Calc{
	
	public static int methodA(int x, int y) { return x+y;}
	public  int methodB(int x, int y) { return x*y;}
	
	public Calc() {}
	public Calc(int x, String x2) {}
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
		
		//2. 인스턴스 메서드 사용 :    문법: 참조변수명::메서드명
		Calc c  = new Calc();
		BinaryOperator<Integer> k = (a,b)->{return c.methodB(a, b);};
		BinaryOperator<Integer> k2 = (a,b)->c.methodB(a, b);
		BinaryOperator<Integer> k3 = c::methodB;
		
		int result3 = k3.apply(10, 20);
		System.out.println(result3);
		
		// "HeLLO" ---> "HELLO"
		UnaryOperator<String> y = (String x)->{return x.toUpperCase();};
		UnaryOperator<String> y2 = x->{return x.toUpperCase();};
		UnaryOperator<String> y3 = x->x.toUpperCase();
		UnaryOperator<String> y4 = String::toUpperCase;
		
		String result4 = y4.apply("HeLLO");
		System.out.println(result4);
		
		// 3. new 이용한 생성자 호출
		
		// 호출하면 객체생성후 반환
		Supplier<Calc> xx = ()->{ return new Calc();};
		Supplier<Calc> xx2 = ()->new Calc();
		Supplier<Calc> xx3 = Calc::new;
		
		Calc yy = xx3.get();
		System.out.println(yy.methodB(10, 10));
		
		// int와 String 전달해서 객체생성후 반환
		BiFunction<Integer, String, Calc> kkk = (a,b)->{ return new Calc(a,b);};
		BiFunction<Integer, String, Calc> kkk2 = (a,b)->new Calc(a,b);
		BiFunction<Integer, String, Calc> kkk3 = Calc::new;
		
		// 4. sysout
		Consumer<String> cc = x-> System.out.println(x);
		Consumer<String> cc2 = System.out::println;
		cc2.accept("Hello");
		
	}//end main

}
