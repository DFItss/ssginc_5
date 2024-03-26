package exam22_컬렉션API;

import java.util.HashSet;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		// Set 계열:  저장 순서가 없고 중복 불가
		
		Set<String> set = new HashSet<>();
		set.add("홍길동1");
		set.add("홍길동2");
		set.add("홍길동2");
		set.add("홍길동3");
		set.add("홍길동4");

		//추가메서드
		System.out.println("set 길이(크기):" + set.size());
		System.out.println("set 비어있냐: " + set.isEmpty());
		System.out.println("특정값 존재하냐: " + set.contains("유관순"));
		
		//삭제 ( 값이용 )
		set.remove("홍길동4");
		
		//전체 삭제
		set.clear();
				
		//값출력: toString()
		System.out.println(set);
	}

}
