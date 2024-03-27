package exam24_스트림;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

class Student{
	String name;
	int kor;  // 국어점수
	int eng;  // 영어점수

	public Student() {}

	public Student(String name, int kor, int eng) {
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

public class StreamTest02_중간처리2_가공_map {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<>();
		list.add( new  Student("홍길동", 100, 80));
		list.add( new  Student("이순신", 89, 90));
		list.add( new  Student("유관순", 99, 99));
		
		//1. 이름에서 첫글자만  출력(성만 출력)
		Function<Student, String> f = new Function<Student, String>() {
			@Override
			public String apply(Student t) {
				return t.getName().substring(0,1);
			}
		};
		list.stream().map(f).forEach(System.out::println);
		list.stream().map(t->t.getName().substring(0,1)).forEach(System.out::println); // ***
		System.out.println("###########################################");
		//2. eng 점수에 -5 해서 출력
		Function<Student, Integer> f2 = new Function<Student, Integer>() {
			@Override
			public Integer apply(Student t) {
				return t.getEng()-5;
			}
		};
		list.stream().map(f2).forEach(System.out::println);
		list.stream().map(t->t.getEng()-5).forEach(System.out::println); // *****
		System.out.println("###########################################");
		ToIntFunction<Student> f3 = new  ToIntFunction<Student>() {
			@Override
			public int applyAsInt(Student t) {
				return t.getEng()-5;
			}
		};
		list.stream().mapToInt(f3).forEach(System.out::println);
		list.stream().mapToInt(t->t.getEng()-5).forEach(System.out::println); // ******
		
		
	}
}






