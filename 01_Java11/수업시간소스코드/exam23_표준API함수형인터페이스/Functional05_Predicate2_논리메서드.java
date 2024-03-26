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
          논리연산자의 역할의 메서드 제공
			 && : and()
			 || : or()
			 !  : negate()
      - boolean	test​(T t)

      * BiPredicate<T,​U> : boolean	test​(T t, U u)
        DoublePredicate :  boolean	test​(double value)
	IntPredicate    :  boolean	test​(int value)
	LongPredicate   : boolean	test​(long value)
 */
public class Functional05_Predicate2_논리메서드 {

	public static void main(String[] args) {

		
		
		IntPredicate y = n->n%2==0;  // 2의 배수
		IntPredicate y2 = n->n%3==0;  // 3의 배수
		
        //1. 2의 배수이면서 3의 배수냐?
		IntPredicate y3 = y.and(y2);
		System.out.println(y3.test(6));
		System.out.println(y3.test(8));
		
		//2. 2의 배수이거나 3의 배수냐?
		IntPredicate y4 = y.or(y2);
		System.out.println(y4.test(7));
		System.out.println(y4.test(8));
		
		//3. 부정
		IntPredicate y5 = y.negate();
		System.out.println(y5.test(7));
		System.out.println(y5.test(8));
		
	}//end main

}
