package exam24_스트림;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;

class Student3{
	String name;
	int kor;  // 국어점수
	int eng;  // 영어점수

	public Student3() {}

	public Student3(String name, int kor, int eng) {
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

public class StreamTest02_중간처리4_limit_skip {

	public static void main(String[] args) {

		List<Student3> list = new ArrayList<>();
		list.add( new  Student3("홍길동", 100, 80));
		list.add( new  Student3("이순신", 89, 90));
		list.add( new  Student3("유관순1", 99, 65));
		list.add( new  Student3("유관순2", 99, 34));
		list.add( new  Student3("유관순3", 99, 100));
		
		// 3개만 출력: limit(n)
		list.stream().limit(2).forEach(System.out::println);
		 System.out.println("#############################");
		// skip(n)
		list.stream().skip(2).forEach(System.out::println);
	}
}






