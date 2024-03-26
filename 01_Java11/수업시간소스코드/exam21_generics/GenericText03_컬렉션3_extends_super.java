package exam21_generics;

import java.util.ArrayList;
import java.util.List;
class Person{}
class Man extends Person{}
class Woman extends Person{}

public class GenericText03_컬렉션3_extends_super {
	public static void main(String[] args) {

		List<Man> list = new ArrayList<>();
		list.add(new Man());
		list.add(new Man());
		
		List<Woman> list2 = new ArrayList<>();
		list2.add(new Woman());
		list2.add(new Woman());
		  
		 List<String> list3 = new ArrayList<>();
		 list3.add("a");
		 list3.add("a2");	
		 
		 
		 
		 printData(list);
		 printData(list2);
		// printData(list3);
		 
		 List<Person> list4 = new ArrayList<>();
			list4.add(new Person());
			list4.add(new Person());
			
		 printData2(list);
		 //printData2(list2); 
		 //printData2(list3);
		 printData2(list4);
	}
	
	// 메서드에 생성된 제네릭타입의 List 중에서 Person 하위 클래스만 파라미터로 전달하자.
	public static void printData(List<? extends Person> xxx) {
		
	}
	// 메서드에 생성된 제네릭타입의 List 중에서 Man 부모 클래스만 파라미터로 전달하자.
	public static void printData2(List<? super Man> xxx) {
		
	}
	
}




