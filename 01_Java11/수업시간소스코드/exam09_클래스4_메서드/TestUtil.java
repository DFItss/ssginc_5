package exam09_클래스4_메서드;

public class TestUtil {

	public static void main(String[] args) {

		Util u = new Util();
		u.method1();
		
		// 오버로딩 메서드
		u.method1(10);
		u.method1("홍길동");
		u.method1("홍길동", 10);
	}
}
