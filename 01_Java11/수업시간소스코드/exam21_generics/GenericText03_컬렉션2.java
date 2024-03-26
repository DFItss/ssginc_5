package exam21_generics;

import java.util.ArrayList;
import java.util.List;



public class GenericText03_컬렉션2 {
	public static void main(String[] args) {

		 List<String> list = new ArrayList<>();
		  list.add("a");
		  list.add("a2");
		  
		  List<Integer> list2 = new ArrayList<>();
		  list2.add(10);
		  list2.add(20);

		  List<Character> list3 = new ArrayList<>();
		  list3.add('A');
		  list3.add('B');
		  
		  printData(list);
		  printData(list2);
		  printData(list3);

	}
	
	// 메서드에 생성된 제네릭타입의 List들을 파라미터로 전달하자.
	public static void printData(List<?> xxx) {
		
	}
	
	
}




