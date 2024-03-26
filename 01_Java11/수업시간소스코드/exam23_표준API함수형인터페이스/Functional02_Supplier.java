package exam23_표준API함수형인터페이스;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntSupplier;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;

/*
     나. Supplier<T>
       - 추상메서드가 파라미터 없고 리턴값은 있음.
       - T get()

       * BooleanSupplier: boolean getAsBoolean()
         DoubleSupplier:  double getAsDouble()
	     IntSupplier :  int	getAsInt()
	     LongSupplier : long	getAsLong()
 */
public class Functional02_Supplier {

	public static void main(String[] args) {

		// Supplier 익명클래스
		Supplier<String> s = new Supplier<String>() {
			@Override
			public String get() {
				return "hello";
			}
		};
		System.out.println(s.get());
		
		// Supplier 람다표현식
		Supplier<String> s2 = ()->"hello";
		System.out.println(s2.get());
		
	    //  IntSupplier :  int	getAsInt()
		IntSupplier is = ()-> 100;
		System.out.println(is.getAsInt());
		
		
	}//end main

}
