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
	     //flatMap​(Function<? super T    ,​   ? extends Stream<? extends R>> mapper)
		 Function<String, Stream<? extends String>> f = new Function<String, Stream<? extends String>>() {
			@Override
			public Stream<? extends String> apply(String t) {
				String [] names =  t.split("/");
				return Arrays.stream(names);
			}
		};
		 
		// Function 의 리턴값을 Stream으로 지정한 이유는 .forEach() 를 바로 호출할 목적이다.
		// 만약 String [] 배열로 반환하면 다시 Stream으로 변경해서 .forEach() 를 호출해야 된다.
		 list.stream().flatMap(f).forEach(System.out::println);
	
		 //문제: 정수로 출력하시오.  flatMapToInt 사용 권장: 이유는 int로 반환하기 때문에.
		 // 	flatMapToInt​(Function<? super T,​? extends IntStream> mapper)
		 List<String> list2 = Arrays.asList("10,20,30","40,50,60");

		 
		 
	}
}






