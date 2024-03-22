package exam19_util;

public class Util02_StringBuilderTest {

	public static void main(String[] args) {
		
		// 1. 생성
		StringBuilder sb = new StringBuilder("hello");
		
		// 2. 메서드
		System.out.println("1. 값출력: " + sb); // sb.toString() 동일
		
		
		System.out.println("2. 값 추가: " + sb.append(true)); //  hellotrue
		System.out.println("2. 값 추가: " + sb.append(100)); // hellotrue100
		System.out.println("2. 값 추가: " + sb.append(3.14)); // hellotrue1003.14
		System.out.println("2. 값 추가: " + sb.append("world")); // hellotrue1003.14world
		System.out.println("2. 값 추가: " + sb.append(new char[] {'A','B'})); // hellotrue1003.14worldAB
		
		System.out.println("3. 값 삽입: " + sb.insert(0, "홍길동")); //홍길동hellotrue1003.14worldAB 

		System.out.println("4. 값 삭제: " + sb.delete(0, 3)); //hellotrue1003.14worldAB 
		System.out.println("4. 값 삭제: " + sb.deleteCharAt(0)); //ellotrue1003.14worldAB 
		
		System.out.println("5. 값 거꾸로: " + sb.reverse()); //BAdlrow41.3001eurtolle
		
		//String에서도 제공되었던 메서드
		System.out.println("6. 길이: " + sb.length()); // 22
		System.out.println("7. 특정문자얻기: " + sb.charAt(0)); // B
		System.out.println("8. 특정문자 위치얻기: " + sb.indexOf("w")); // 6
		System.out.println("9. 부분열: " + sb.substring(6)); // w41.3001eurtolle
		System.out.println("9. 부분열: " + sb.substring(6,7)); // w
		
		// StringBuilder --> String
		String xxx = sb.toString();
		System.out.println(xxx);
	}

}
