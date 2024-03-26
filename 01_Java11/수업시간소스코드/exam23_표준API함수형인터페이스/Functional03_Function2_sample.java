package exam23_표준API함수형인터페이스;

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

public class Functional03_Function2_sample {

	// 이름만 출력하는 메서드
	public static void printName(List<Student> list, Function<Student, String> x) {
		for (Student stu : list) {
			System.out.println(x.apply(stu));
		}
	}
	// kor 출력하는 메서드
	public static void printKor(List<Student> list, ToIntFunction<Student> f) {
		for (Student stu : list) {
			System.out.println(f.applyAsInt(stu));
		}
	}
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add( new  Student("홍길동", 100, 80));
		list.add( new  Student("이순신", 89, 90));
		list.add( new  Student("유관순", 99, 99));
		// 이름만 출력하시오
//		Function<Student, String> x = new Function<Student, String>() {
//			@Override
//			public String apply(Student t) {
//				return t.getName();
//			}
//		};
		printName(list, t->t.getName());
		// kor 출력하는 메서드
		printKor(list, t-> t.getKor());
	}//end main

}
