package exam22_컬렉션API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		// List 계열: 저장순서가 있고 중복이  가능하다.
		
		List<String> list  = new ArrayList<>();
		
		//1. 추가 ( append 기능 )
		list.add("홍길동1");
		list.add("홍길동2");
		list.add("홍길동2");
		list.add("홍길동3");
		list.add("홍길동4");
		
		//2. 삽입 ( insert 기능 )
		list.add(0, "이순신");
		
		//3. 수정 ( 치환 기능 )
		list.set(1, "유관순");
		
		//4. 삭제 ( 위치값 또는 값이용 )
		list.remove(0);
		list.remove("홍길동4");
		
		//추가 메서드
		System.out.println("리스트 길이(크기):" + list.size());
		
		Object [] arr = list.toArray();
		System.out.println("리스트를 배열로 변환: " + Arrays.toString(arr));
		
		System.out.println("특정값의 위치: " + list.indexOf("유관순"));
		System.out.println("리트스가 비어있냐: " + list.isEmpty());
		System.out.println("특정값 존재하냐: " + list.contains("유관순"));
		System.out.println("특정값 존재하냐: " + list.contains("정조"));
		System.out.println("특정값 얻기: " + list.get(0));
		
		//전체 삭제
		list.clear();
		
		// 출력
		System.out.println(list);  // list.toString()
	}

}
