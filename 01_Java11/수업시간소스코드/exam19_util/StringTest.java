package exam19_util;

public class StringTest {

	public static void main(String[] args) {

		
		//1. 리터럴 이용 ( ***** ) ==> "hello" 문자열은 method area에 저장, 동일한 문자열은 한번만 생성됨.
		String s = "hello";
		String s2 = "hello";
		System.out.println(s);
		System.out.println(s2);

		System.out.println("주소값 비교: " + (s==s2)); // true
		System.out.println("문자열 실제값 비교: " + s.equals(s2)); // true
		
		
		//2. new 이용   ==> heap 에 저장, new 했기 때문에 동일한 문자열도 매번 생성됨.
		String x = new String("hello");
		String x2 = new String("hello");
		System.out.println(x);
		System.out.println(x2);
		
		System.out.println("주소값 비교: " + (x==x2)); // false
		System.out.println("문자열 실제값 비교: " + x.equals(x2)); // true

		System.out.println("문자열 실제값 비교: " + s.equals(x)); // true
		
		// 문자열 값을 비교할 때는 반드시  equals 메서드를 사용해야 된다.
		
	}//end main
}//end class
