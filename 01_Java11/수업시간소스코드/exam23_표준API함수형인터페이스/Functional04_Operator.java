package exam23_표준API함수형인터페이스;

import java.util.function.BinaryOperator;
import java.util.function.LongUnaryOperator;

/*
Operator
      - Function 처럼 파라미터 있고 리턴값은 있음.
      - Function API를 상속받음.
        특징은 전달되는 파라미터 타입하고 리턴값의 타입이 동일함.
        
	* BinaryOperator<T> : BiFunction의 하위 인터페이스이고 
	                      T apply(T t1, T t2)

	  DoubleBinaryOperator: double	applyAsDouble​(double left, double right)
	  DoubleUnaryOperator: double	applyAsDouble​(double operand)
	  IntBinaryOperator :  int	applyAsInt​(int left, int right)
	  IntUnaryOperator :   int	applyAsInt​(int operand)
	  LongBinaryOperator:  long	applyAsLong​(long left, long right)
	  LongUnaryOperator :  long	applyAsLong​(long operand)
	  UnaryOperator<T>:     T apply(T t)
 */
public class Functional04_Operator {

	public static void main(String[] args) {

		// BinaryOperator<T> 익명클래스
		BinaryOperator<Integer> x = new BinaryOperator<Integer>() {
			@Override
			public Integer apply(Integer t, Integer u) {
				return t+u;
			}
		};
		System.out.println(x.apply(10, 20));
	
		// BinaryOperator<T> 람다 표현식
		BinaryOperator<Integer> x2 = (n, n2)-> n+n2;
		System.out.println(x2.apply(10, 20));
		
		//  LongUnaryOperator :  long	applyAsLong​(long operand)
		LongUnaryOperator y = n-> n+100;
		System.out.println(y.applyAsLong(10));
		
		
		
	}//end main

}
