package exam21_generics;

import java.util.ArrayList;

public class GenericText03_컬렉션 {
	public static void main(String[] args) {
	
		// 순서있고 중복가능 컬렉션 사용: List 계열인 ArrayList 클래스를 사용하자.
		// 기본적으로 컬렉션 API에는 모든 데이터가 저장이 가능하다.
		
		// 1. 제네릭 없이 사용 ( 거의 사용 안됨 )
		  ArrayList list = new ArrayList();
	     // 문자열로 저장 제한함.
		  list.add(10);  // 문제1 
		  list.add("hello");
		  list.add(3.14); //문제1
		  
		  Object obj = list.get(1);
		  String str = (String)obj; // 문제2
		
		// 2. 제네릭으로 사용 ( 저장할 데이터타입을 제한)
		// 문자열로 저장 제한함.
		  // public class ArrayList<E> implements List<E>{}
		  ArrayList<String> list2 = new ArrayList<>();
		  list2.add("a");
		  list2.add("a2");
//list2.add(10); // 문제 1 해결

		  String str2 = list2.get(1); // 문제 2 해결
		
	}
}
