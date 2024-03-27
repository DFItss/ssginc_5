package exam24_스트림;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;



public class StreamTest02_중간처리2_가공2_flatMap {

	public static void main(String[] args) {

	
		 List<String> list = Arrays.asList("홍길동/홍길동2","이순신/이순신2");
		
		 // 하나의 파라미터로 복수개의 요소들로 구성된 새로운 Stream을 반환한다.
		 Function<String, Stream<? extends String>> f = new Function<String, Stream<? extends String>>() {
			@Override
			public Stream<? extends String> apply(String t) {
				String [] names =  t.split("/");
				return Arrays.stream(names);
			}
		};
		 
		 list.stream().flatMap(f).forEach(System.out::println);
	
		 //문제: 정수로 출력
		 List<String> list2 = Arrays.asList("10,20,30","40,50,60");
		 
		 
		 
		 
		 
	}
}






