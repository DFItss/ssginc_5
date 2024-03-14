package exam08_유틸리티;


public class StringTest {

	public static void main(String[] args) {
		
		// hello 문자열 생성
		
		//1. 리터럴 이용
		String s = "hello";
		
		//2. new  이용
		String s2 = new String("hello");
		
		System.out.println(s);
		System.out.println(s2);
		
		// s 와 s2가 같냐?
		System.out.println( s==s2 ); //  s의 주소값과 s2의 주소값이 같냐? false
		System.out.println( s.equals(s2) ); // s의 실제값인 "hello"와  s2의 실제값인 "hello"가 같냐? true

	}

}
