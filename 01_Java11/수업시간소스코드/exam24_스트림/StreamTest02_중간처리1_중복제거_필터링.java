package exam24_스트림;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamTest02_중간처리1_중복제거_필터링 {

	public static void main(String[] args) {

	  
		
		 List<String> list = Arrays.asList("홍길동","이순신","유관순","이순신","세조","정조");
		 
		 //1. 중복제거 : distinct()
		 list.stream()
		     .distinct()
		     .forEach(System.out::println);
		
		 System.out.println("####################################");
		 
		 //2. 필터링 : 	filter​(Predicate<? super T> predicate)
		 // 첫글자가 "이" 로 시작
		 Predicate<String> x = new Predicate<String>() {
			@Override
			public boolean test(String t) {
				return t.startsWith("이");
			}
		};
		 
		 list.stream().filter(x).forEach(System.out::println);
		 list.stream().filter(t->t.startsWith("이")).forEach(System.out::println); // (********)
		 
		 System.out.println("####################################");
		 // 3. distict() + filter()
		 list.stream()
	     .distinct()
	     .filter(t->t.startsWith("이"))
	     .forEach(System.out::println);
		 
		 //실습: 이름이 2글자만 출력
		 System.out.println("####################################");
		 list.stream()
	     .filter(t->t.length() == 2)
	     .forEach(System.out::println);
	}
}






