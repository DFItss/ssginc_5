package exam21_generics;

import java.util.Date;

// 값을 저장할 수 있는 클래스: 모든 데이터 저장이 가능
class Box2<T>{
	T obj;
	public void setValue(T obj) {
		this.obj = obj;
	}
	public T getValue() {
		return obj;
	}
}//end class

public class GenericText02_사용후 {
	public static void main(String[] args) {
		//문자열만 저장
		Box2<String> x = new  Box2<>();  // new 뒤에 오는 제네릭 타입은 생략 가능하다.
		Box2<String> b = new  Box2<String>();
		b.setValue("Hello");
//b.setValue(100);  // 문제1 해결: 잘못된 데이터를 저장시 컴파일 시점에 알 수 있다.
		
		String s = b.getValue(); //문제2 해결: 형변환이 불필요하다.
		System.out.println(s+"\t" + s.toUpperCase());
		
		//날짜만 저장
		Box2<Date> x2 = new Box2<>();   // new 뒤에 오는 제네릭 타입은 생략 가능하다.
		Box2<Date> b2 = new Box2<Date>();
//b2.setValue(100);   // 문제1 해결
		b2.setValue(new Date());
		Date d =b2.getValue(); //문제2 해결
		System.out.println(d+"\t"+ d.getYear());
		
		
	}
}
