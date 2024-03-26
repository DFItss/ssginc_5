package exam22_컬렉션API;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Cat{
	
	String name;
	int age;
	
	public Cat() {}

	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + "]";
	}
}//end class

public class Collections유틸리티 {
	public static void main(String[] args) {
		//1. shuffle
		List<Integer> list = Arrays.asList(10,20,30,40,50,60);
		Collections.shuffle(list);
		System.out.println(list);
	
		// 2. copy : 길이가 같거나 대상이 소스보다 크면 copy 가능.
		List<Integer> list2 = Arrays.asList(10,20,30,40,50,60,70,80);
		List<Integer> list3 = Arrays.asList(1,2,3,4,5,6);
		
		Collections.copy(list2, list3);  // 대상: list2  소스: list3
		System.out.println(list2);
		System.out.println(list3);
		
		// 3. 정렬 (*******************)
		List<Cat> list4 = Arrays.asList(new Cat("c1",4),
										new Cat("c3",2),
										new Cat("c2",1),
										new Cat("c4",8),
										new Cat("c5",3)
				                        ); 
	
		System.out.println(list4);
		
		// Comparator 사용법1: 익명클래스
        Comparator<Cat> comp = new Comparator<Cat>() {
			@Override
			public int compare(Cat c1, Cat c2) {
//				int result =c1.age - c2.age; // 오름차순
				int result =c2.age - c1.age; // 내림차순
				return result;  // result 가 0 이면 c1과 c2의 age가 같음.
				                // result 가 음수 이면 c1.age < c2.age 
				                 // result 가 양수 이면 c1.age > c2.age 
			}
        	
		};
		// Comparator 사용법2: 람다
//		 Comparator<Cat> comp2 = (c1 , c2)-> c2.age - c1.age;
//		Collections.sort(list4, comp2);
		
		Collections.sort(list4, (c1 , c2)-> c2.age - c1.age); // ***********8
		
		System.out.println(list4);
		
	}//end main
}//end class











