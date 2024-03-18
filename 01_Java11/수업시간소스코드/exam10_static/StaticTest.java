package exam10_static;

class Counter{
	private int num;  // 인스턴스 변수. 매번 생성되기 때문에 누적용으로 사용 불가.
	static int count; // static 변수. 프로그램 실행시 단 한번만 생성 + lifecycle가장 길다. ==> 공유목적의 누적용
	public Counter() {
		//num++;
		count++;
	}
	public int getNum() {
//		return num;
		return count;
	}
}//end Counter

public class StaticTest {
	public static void main(String[] args) {
		//Counter클래스를  몇번 객체생성했는지 숫자 세기
		// new 전에 static 변수 접근 가능: 클래스명.변수
		System.out.println(Counter.count); // 0 , static 변수는 자동초기화됨
		Counter c = new Counter();
		System.out.println(c.getNum()); // 1
		System.out.println(Counter.count); // 1 
		Counter c2 = new Counter();
		System.out.println(c2.getNum()); // 2
		System.out.println(Counter.count); // 2 
	}
}
