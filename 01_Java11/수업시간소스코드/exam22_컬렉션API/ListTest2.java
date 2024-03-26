package exam22_컬렉션API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListTest2 {

	public static void main(String[] args) {
		// List 계열: 저장순서가 있고 중복이  가능하다.
		
		List<String> list  = new ArrayList<>();

		list.add("홍길동1");
		list.add("홍길동2");
		list.add("홍길동2");
		list.add("홍길동3");
		list.add("홍길동4");

		// 출력방법 1: toString() 이용
		System.out.println(list);  // list.toString()
		
		// 출력방법 2: 반복문
		for (String s : list) {
			System.out.print(s +"\t");
		}
		System.out.println();
		
		for(int idx=0; idx < list.size(); idx++) {
			System.out.print(list.get(idx) +"\t");			
		}
		System.out.println();
		
		// 출력방법 3: Iterator 이용 ( ****** )
		Iterator<String> ite = list.iterator();
		while(ite.hasNext()) {
			String s = ite.next();
			System.out.print(s +"\t");
		}
	}

}
