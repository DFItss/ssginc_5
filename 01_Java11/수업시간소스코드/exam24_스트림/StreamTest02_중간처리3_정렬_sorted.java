package exam24_스트림;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;

class Student2{
	String name;
	int kor;  // 국어점수
	int eng;  // 영어점수

	public Student2() {}

	public Student2(String name, int kor, int eng) {
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

public class StreamTest02_중간처리3_정렬_sorted {

	public static void main(String[] args) {

		List<Student2> list = new ArrayList<>();
		list.add( new  Student2("홍길동", 100, 80));
		list.add( new  Student2("이순신", 89, 90));
		list.add( new  Student2("유관순", 99, 65));
		list.add( new  Student2("유관순", 99, 34));
		list.add( new  Student2("유관순", 99, 100));
		 
	    // eng 로 정렬
		Comparator<Student2> c = new Comparator<Student2>() {
			@Override
			public int compare(Student2 s1, Student2 s2) {
//				return s1.getEng() - s2.getEng(); // 오름차순
				return s2.getEng() - s1.getEng(); // 내림차순
			}
		};
		Comparator<Student2> c2 = (s1, s2)->s2.getEng() - s1.getEng();
		// 	sorted​(Comparator<? super T> comparator)
		list.stream().sorted(c2).forEach(System.out::println);
		list.stream().sorted((s1, s2)->s2.getEng() - s1.getEng()).forEach(System.out::println);
		
		System.out.println("#############################################");
		System.out.println("#############################################");
		// 추가: Comparator.comparing(Function)
		Function<Student2, Integer> f = new Function<Student2, Integer>() {
			@Override
			public Integer apply(Student2 t) {
				return t.getEng();
			}
		};
		list.stream().sorted(Comparator.comparing(f)).forEach(System.out::println);
		list.stream().sorted(Comparator.comparing(t->t.getEng())).forEach(System.out::println);
		list.stream().sorted(Comparator.comparing((Student2 t)->t.getEng())).forEach(System.out::println);
		list.stream().sorted(Comparator.comparing(Student2::getEng)).forEach(System.out::println);//***
		System.out.println("#############################################");
	    // 내림차순: .sorted( Comparator.comparing(f, Comparator.reverseOrder() ))         
		list.stream().sorted(Comparator.comparing(f, Comparator.reverseOrder())).forEach(System.out::println);
	}
}






