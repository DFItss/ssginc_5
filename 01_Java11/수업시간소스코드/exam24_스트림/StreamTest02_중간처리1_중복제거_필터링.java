package exam24_스트림;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamTest02_중간처리1_중복제거_필터링 {

	public static void main(String[] args) {

	  
		
		 List<String> list = Arrays.asList("홍길동","이순신","유관순","이순신");
		 
		 //1. 중복제거
		 list.stream()
		     .distinct()
		     .forEach(System.out::println);
		
		 //2. 필터링
	}
}






