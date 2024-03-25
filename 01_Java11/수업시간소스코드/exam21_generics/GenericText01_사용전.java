package exam21_generics;

import java.util.Date;

// 값을 저장할 수 있는 클래스: 모든 데이터 저장이 가능
class Box{
	Object obj;
	public void setValue(Object obj) {
		this.obj = obj;
	}
	public Object getValue() {
		return obj;
	}
}//end class
public class GenericText01_사용전 {
	public static void main(String[] args) {
		//문자열만 저장
		Box b = new  Box();
		b.setValue("Hello");
b.setValue(100);  // 문제1: 잘못된 데이터를 저장시 컴파일 시점이 아닌 런타임 시점에 알 수 있다.
		String s = (String)b.getValue(); //문제2: 항상 형변환이 필요하다.
		System.out.println(s+"\t" + s.toUpperCase());
		//날짜만 저장
		Box b2 = new Box();
b2.setValue(100); 
		b2.setValue(new Date());
		Date d =(Date)b2.getValue();
		System.out.println(d+"\t"+ d.getYear());
		
		
	}
}
