package exam23_표준API함수형인터페이스;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntSupplier;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;

/*
      다. Function<T,​R>
       - 추상메서드가 파라미터 있고 리턴값은 있음.
       - R apply​(T t)

       * BiFunction<T,​U,​R> : R	apply​(T t, U u)
         DoubleFunction<R> : R	apply​(double value)
	 DoubleToIntFunction: int applyAsInt​(double value)
	 DoubleToLongFunction : long	applyAsLong​(double value)
	 IntFunction<R> : R	apply​(int value)
	 IntToDoubleFunction : double	applyAsDouble​(int value)
	 IntToLongFunction: long	applyAsLong​(int value)
	 LongFunction<R>: R	apply​(long value)
	 LongToDoubleFunction : double	applyAsDouble​(long value)
	 LongToIntFunction : int	applyAsInt​(long value)
	 ToDoubleBiFunction<T,​U>: double	applyAsDouble​(T t, U u)
 */
public class Functional03_Function {

	public static void main(String[] args) {

	    // Function<T,​R> : R apply​(T t)
		// Function 익명 클래스
        Function<String, Integer> f = new Function<String, Integer>() {
			@Override
			public Integer apply(String t) {
				return t.length();
			}
		};		
		System.out.println("문자열 길이:" + f.apply("hello"));
		
		// Function 람다 표현식
		Function<String, Integer> f2 =  t->t.length();
		System.out.println("문자열 길이:" + f2.apply("hello"));
		
		// BiFunction<T,​U,​R> : R	apply​(T t, U u)
		BiFunction<String, String, Integer> bi = (t, u)-> (t+u).length();
		System.out.println("문자열 길이:" + bi.apply("hello","world"));
		
				
	}//end main

}
