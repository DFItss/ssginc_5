package exam23_표준API함수형인터페이스;

import java.util.function.BinaryOperator;
import java.util.function.IntPredicate;
import java.util.function.LongUnaryOperator;
import java.util.function.Predicate;

/*
    마. Predicate<T>
      - 추상메서드가 파라미터 있고 리턴값은 있음.
        리턴값은 boolean 값으로 제한됨.
      - 조건체크 용도
      - boolean	test​(T t)

      * BiPredicate<T,​U> : boolean	test​(T t, U u)
        DoublePredicate :  boolean	test​(double value)
	IntPredicate    :  boolean	test​(int value)
	LongPredicate   : boolean	test​(long value)
 */
public class Functional05_Predicate {

	public static void main(String[] args) {

		// Predicate 익명클래스
		Predicate<String> x = new Predicate<String>() {
			@Override
			public boolean test(String t) {
				return t.length() >= 3;
			}
		};
		
		System.out.println(x.test("홍길동"));
		System.out.println(x.test("정조"));
		
		// Predicate 람다 표현식
		Predicate<String> x2 =  t->t.length() >= 3;
		System.out.println(x2.test("홍길동"));
		
		// IntPredicate    :  boolean	test​(int value)
		IntPredicate y = n->n%2==0;
		
		System.out.println(y.test(10));
		System.out.println(y.test(11));
		
		
		
	}//end main

}
