package exam23_표준API함수형인터페이스;

import java.util.function.Consumer;
import java.util.function.Function;

public class Functional06_andThen {

	public static void main(String[] args) {

		// 1. Consumer 순차적인 작업
		Consumer<String> c = t-> System.out.println("람다 Consumer1: " + t);
		Consumer<String> c2 = t-> System.out.println("람다 Consumer2: " + t);
		
		Consumer<String> c3 = c.andThen(c2);
		c3.accept("hello");
		
		//2. Function
		Function<String, Integer> f =  t->t.length();
		Function<Integer, Float> f2 =  t->t + 3.14F;
		
		Function<String, Float> f3 =    f.andThen(f2);
		System.out.println(f3.apply("hello"));
		
		
		
		
	}//end main

}
