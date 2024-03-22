package exam19_util;

public class util03_wrapperTest {

	public static void main(String[] args) {
		
		//1. 상수의 도움 예
		
		System.out.println(Byte.MIN_VALUE+" ~ " + Byte.MAX_VALUE); // -128 ~ 127
		System.out.println(Short.MIN_VALUE+" ~ " + Short.MAX_VALUE); // -32768 ~ 32767
		System.out.println(Integer.MIN_VALUE+" ~ " + Integer.MAX_VALUE); // -2147483648 ~ 2147483647
		System.out.println(Long.MIN_VALUE+" ~ " + Long.MAX_VALUE);    // -9223372036854775808 ~ 9223372036854775807
		
		//2. 메서드 도움 예
		// "10" --> 10
		int n = Integer.parseInt("10");
		
		// "3.14" --> 3.14
		float f = Float.parseFloat("3.14");
		
		// 10 과 20 중 최대값 반환 또는 최소값 반환 또는 합
		System.out.println(Integer.max(10, 20));  // 20
		System.out.println(Integer.min(10, 20));  // 10
		System.out.println(Integer.sum(10, 20));  // 30
		
		// 대문자냐? 소문자냐?
		char c = 'A';
		System.out.println(Character.isUpperCase(c)); // true
		System.out.println(Character.isLowerCase(c)); // false
		
		// 문자냐?
		char c2 = 'A';
		char c3 = '1';
		
		System.out.println(Character.isLetter(c2)); // true
		System.out.println(Character.isLetter(c3)); // false
		
		// 숫자냐?
		System.out.println(Character.isDigit(c2)); // false
		System.out.println(Character.isDigit(c3)); // true
		
		// 공백이냐?
		char c4=' ';
		System.out.println(Character.isWhitespace(c4)); // true
		
		// '1' ---> 1 ,  "1"----> 1
		int k = Character.getNumericValue('1');
		System.out.println(k+1); // 2
		
	}
}
