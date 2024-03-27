package exam24_스트림;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Student8{
	String name;
	int kor;  // 국어점수
	int eng;  // 영어점수

	public Student8() {}

	public Student8(String name, int kor, int eng) {
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

public class StreamTest03_최종처리4_컬렉션대상그룹메서드 {

	public static void main(String[] args) {

		 //정수형 배열 ==> IntStream 의 메서드로 처리해야 된다.
        int [] arr = new int[] {1,2,3,4,5,6};
        int sum2 = Arrays.stream(arr).sum(); 
        
		List<Student8> list = new ArrayList<>();
		list.add( new  Student8("홍길동", 100, 80));
		list.add( new  Student8("이순신", 89, 90));
		list.add( new  Student8("유관순1", 99, 65));
		list.add( new  Student8("유관순2", 99, 34));
		list.add( new  Student8("유관순3", 99, 100));
		
	   // 1. 카운트
		long count = list.stream().collect(Collectors.counting());
		System.out.println("1. 카운트: " + count);
		
		//2. 영어 점수 총합
		int sum  = list.stream().collect(Collectors.summingInt(t->t.getEng()));
		System.out.println("2. 영어 점수 총합: " + sum);
		
		//3. 영어 점수 평균
		double avg  = list.stream().collect(Collectors.averagingDouble(t->t.getEng()));
		System.out.println("3. 영어 점수 평균: " + avg);
		
		//4. 영어 점수 최대값
		Optional<Student8> max = 
				list.stream()
				    .collect(Collectors.maxBy(Comparator.comparing(Student8::getEng)));
		Student8 sss = max.get();
		System.out.println("4. 영어 점수 최대값: " + sss);
		
		//5. 영어 점수 최소값	
		Student8 sss2 = list.stream()
			    .collect(Collectors.minBy(Comparator.comparing(Student8::getEng)))
			    .get();
		System.out.println("5. 영어 점수 최소값 " + sss2);
		
	}
}






