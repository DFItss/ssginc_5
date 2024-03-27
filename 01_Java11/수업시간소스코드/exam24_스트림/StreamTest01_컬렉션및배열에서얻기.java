package exam24_스트림;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamTest01_컬렉션및배열에서얻기 {

	public static void main(String[] args) {

	  
		 //1. 컬렉션
		 List<String> list = Arrays.asList("홍길동","이순신","유관순");
		 Stream<String> s = list.stream();
		 //반복출력 	forEach​(Consumer<? super T> action)
		 // Consumer 익명클래스
		 Consumer<String> c = new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		};
		 // Consumer 람다
		 Consumer<String> c2 = t-> System.out.println(t);
		 
		 // 메서드 호출 ( method reference )
		 Consumer<String> c3 = System.out::println;
				 
//		 s.forEach(c3);
//		 s.forEach(c3);  // 에러발생? 이전 forEach에서 스트림 모두 소멸됨.
//		 s.forEach(System.out::println);
		 list.stream().forEach(System.out::println);  // 일반적임
		 
		 System.out.println();
	   	 //2. 배열
		String [] names = {"홍길동1","이순신1","유관순1"};
		
		  //가. Arrays.stream(배열)
		Stream<String> s2 = Arrays.stream(names);
		s2.forEach(System.out::println);
		
		  //나. Stream.of(T)
		Stream<String> s3 = Stream.of(names);
		s3.forEach(System.out::println);
		
		  //다. Stream.of(T...)
		Stream<String> s4 = Stream.of("홍길동2","이순신2","유관순2");
		s4.forEach(System.out::println);
		
		Stream<Integer> s5 = Stream.of(10,20,30);
		s5.forEach(System.out::println);
		
	}
}






