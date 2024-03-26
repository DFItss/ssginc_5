package exam22_컬렉션API;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		// Map 계열: key/value 쌍으로 저장, key이용해서 value 얻음. 저장순서 없음, Collection 인터페이스와 무관.
		
		Map<String, String> m = new HashMap<>();
		
		m.put("p01", "홍길동1");
		m.put("p02", "홍길동2");
		m.put("p03", "홍길동3");
		m.put("p04", "홍길동4");
		m.put("p04", "유관순");  // key 중복시 덮어쓴다.
		
		//추가 메서드
		System.out.println("map 길이:" + m.size());
		System.out.println("특정 key 존재?:" + m.containsKey("p01"));
		System.out.println("특정 value 존재?:" + m.containsValue("이순신"));

		System.out.println("특정값 조회:" + m.get("p01"));
		System.out.println("특정값 조회:" + m.get("xxx")); // 존재하지 않는 key 지정시 null 반환
		
		//치환
		m.replace("p04", "강감찬");
		
		//삭제
		m.remove("p02");
		
		// key값만 얻기 (*************)
		Set<String> keys = m.keySet();
		System.out.println(keys);
		for (String key : keys) {
			System.out.println(m.get(key));
		}
		
		// value만 얻기
		Collection<String> value = m.values();
		for (String v : value) {
			System.out.println(">>" + v);
		}
		
		//모두 삭제
		m.clear();
		
		//값 출력: toString()
		System.out.println(m);
	}

}
