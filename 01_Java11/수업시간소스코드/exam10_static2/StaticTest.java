package exam10_static2;

class Counter{
	private int num;  // 인스턴스 변수. 매번 생성되기 때문에 누적용으로 사용 불가.
	static int count; // static 변수. 프로그램 실행시 단 한번만 생성 + lifecycle가장 길다. ==> 공유목적의 누적용
	public Counter() {
		//num++;
		count++;
	}
	public int getNum() { // 인스턴스 메서드, 객체생성(new)시 생성.
		System.out.println(this);
		return num;   // 인스턴스 변수 접근 가능
	//	return count;  // static 변수 접근 가능
	}
	/*
	 *   static 메서드 사용시 주의할점
	 *   - 인스턴스 변수 및 this 키워드 사용불가 ==> 아직 인스턴스가 생성 안됨.
	 *  
	 */
	public static int getCount() {  //  static 메서드, 객체생성과 무관, 프로그램 실행시 생성.
		//System.out.println(this); // heap 메모리에 생성된 자신의 인스턴스를 참조하는 this 사용불가
		return count;     // static 변수 접근 가능
		//return num;         // 인스턴스 변수 접근 불가능 ==> num 인스턴스 변수는 아직 생성 안됨.
	}
}//end Counter
public class StaticTest {
	public static void main(String[] args) {
		//Counter클래스를  몇번 객체생성했는지 숫자 세기
		// new 전에 static 메서드 호출 가능. 
		// static 메서드 용도: new 없이 메서드 사용하기 위해서. 대표적: Integer.parseInt("10")
		System.out.println(Counter.getCount());
				
		Counter c = new Counter();
		System.out.println(Counter.getCount());  // c.getCount() 가능 ( 권장안함)
		Counter c2 = new Counter();
		System.out.println(Counter.getCount());
	
	}
}
