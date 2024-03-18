package exam09_클래스4_메서드;

public class TestUtil {

	public static void main(String[] args) {

		Util u = new Util();
		u.method1();
		
		// 오버로딩 메서드
		u.method1(10);
		u.method1("홍길동");
		u.method1("홍길동", 10);
		
		int result =u.method2();
		System.out.println(result);
		
		String result2 = u.method3();
		System.out.println(result2);
		
		
		int result3 = u.sum(10, 20);
		System.out.println(result3);
		
		
	}
}
