package exam22_컬렉션API;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest2 {

	public static void main(String[] args) {
		// Set 계열:  저장 순서가 없고 중복 불가
		
		Set<String> set = new HashSet<>();
		set.add("홍길동1");
		set.add("홍길동2");
		set.add("홍길동2");
		set.add("홍길동3");
		set.add("홍길동4");

		//값출력1: toString()
		System.out.println(set);
		
		//값출력2: foreach문
		for (String s : set) {
			System.out.print(s +"\t");
		}
		System.out.println();
		
		// 출력방법 3: Iterator 이용 ( ****** )
		Iterator<String> ite = set.iterator();
		while(ite.hasNext()) {
			String s = ite.next();
			System.out.print(s +"\t");
		}
	}

}
