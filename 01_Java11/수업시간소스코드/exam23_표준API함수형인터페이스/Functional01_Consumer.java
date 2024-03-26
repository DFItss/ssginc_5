package exam23_표준API함수형인터페이스;

import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.ObjIntConsumer;

/*
 가. Consumer
        - 추상메서드가 파라미터있고 리턴값은 없음.
	- void	accept​(T t)

       * BiConsumer<T,​U>: void	accept​(T t, U u)
         DoubleConsumer : void	accept​(double value)
         IntConsumer:     void	accept​(int value)
	 LongConsumer   : void	accept​(long value)
	 ObjDoubleConsumer<T>: void accept​(T t, double value)
	 ObjIntConsumer<T> : void	accept​(T t, int value)
	 ObjLongConsumer<T>: void	accept​(T t, long value)
 */
public class Functional01_Consumer {

	public static void main(String[] args) {

		// Consumer 익명클래스
		Consumer<String> c = new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println("Consumer: " + t);
			}
		};
		c.accept("hello");
		
		//Consumer 람다 표현식
		Consumer<String> c2 = t-> System.out.println("람다 Consumer: " + t);
		c2.accept("hello");
		
		
		//BiConsumer  익명클래스
		BiConsumer<String, Integer> bc = new BiConsumer<String, Integer>() {
			@Override
			public void accept(String t, Integer u) {
				System.out.println("BiConsumer: " + t +"\t" + u);
			}
		};
		bc.accept("홍길동", 20);

       // BiConsumer 람다
		BiConsumer<String, Integer> bc2 = (x, x2)->System.out.println("BiConsumer: " + x +"\t" + x2);
		bc2.accept("홍길동", 20);
		
		// ObjIntConsumer<T> : void	accept​(T t, int value)
		ObjIntConsumer<Date> oit = (x, x2)->System.out.println("ObjIntConsumer: " + x +"\t" + x2);
		oit.accept(new Date(), 100);
		
	}//end main

}
