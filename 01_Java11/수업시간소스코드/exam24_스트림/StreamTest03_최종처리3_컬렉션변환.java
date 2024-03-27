package exam24_스트림;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Student9{
	String name;
	int kor;  // 국어점수
	int eng;  // 영어점수

	public Student9() {}

	public Student9(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", kor=" + kor + ", eng=" + eng + "]";
	}
	
	
}//end clss

public class StreamTest03_최종처리3_컬렉션변환 {

	public static void main(String[] args) {

		List<Student9> list = new ArrayList<>();
		list.add( new  Student9("홍길동", 100, 80));
		list.add( new  Student9("이순신", 89, 90));
		list.add( new  Student9("유관순1", 99, 65));
		list.add( new  Student9("유관순2", 99, 34));
		list.add( new  Student9("유관순3", 99, 100));
		
		//1. 이름만 출력
		list.stream().map(t->t.getName()).forEach(System.out::println);
		list.stream().map(Student9::getName).forEach(System.out::println);
	
		//2. 이름만 List로 반환
		// .stream().collect( Collector ) , .stream().collect( Collectors ) 
		//  Collector와 Collectors 관계는 상속관계
		
		List<String> xxx = list.stream()
				               .map(Student9::getName)
				               .collect(Collectors.toList());
		System.out.println("2. 이름만 List로 반환:" + xxx); // [홍길동, 이순신, 유관순1, 유관순2, 유관순3]
		
		// 3. key:이름 value:Student9 형식의 Map로 반환
		// toMap​(Function, Function)
		Function<Student9, String> k = new Function<Student9, String>() {
			@Override
			public String apply(Student9 t) {
				return t.getName();
			}
		};;
		Function<Student9, Student9> k2 = new Function<Student9, Student9>() {
			@Override
			public Student9 apply(Student9 t) {
				return t;
			}
		};
		
		Map<String, Student9> xxx2 = list.stream()
				                         .collect(Collectors.toMap(k,k2));
		
		Map<String, Student9> xxx3 = list.stream()
                .collect(Collectors.toMap(t->t.getName(),t->t));
		
		Map<String, Student9> xxx4 = list.stream()
                .collect(Collectors.toMap(Student9::getName,t->t));
		
		System.out.println("3. key:이름 value:Student9 형식의 Map로 반환:" + xxx4);
		
		
		
	}
}






