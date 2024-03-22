package exam19_util;

public class StringTest2_메서드 {

	public static void main(String[] args) {

		
		//1. 생성
		String s = "helLO";
		String s2 = "     helLO     ";
		
		//2. 인스턴스 메서드 ( s.메서드 형식 )
		int n = s.length();
		System.out.println("1. 문자열길이: " + n);   // 5

		char c = s.charAt(0);
		System.out.println("2. 특정문자조회: " + c);   // h
		System.out.println("3. 부분열: " + s.substring(1));   // elLO
		System.out.println("3. 부분열: " + s.substring(1, 4));   // elL, endIndex는 항상 전까지
		
		System.out.println("4. 특정문자위치: " + s.indexOf("e"));   // 1
		System.out.println("4. 특정문자위치: " + s.indexOf("E"));   // -1 (일치하는 문자가 없으면 -1 반환 )
		
		System.out.println("5. 대문자: " + s.toUpperCase());   // HELLO
		System.out.println("6. 소문자: " + s.toLowerCase());   // hello
		
		System.out.println("7. 문자열 값비교: " + s.equals("helLO"));   // true
		System.out.println("7. 문자열 값비교: " + s.equals("hello"));   // false ( equals는 대소문자 구별)
		System.out.println("7. 문자열 값비교(대소문자무시): " + s.equalsIgnoreCase("hello"));   // true
		
		System.out.println("8. 문자열 포함여부: " + s.contains("el"));   // true
		System.out.println("8. 문자열 포함여부: " + s.contains("xe"));   // false
		
		System.out.println("9. 문자열 치환: " + s.replace("h", "H")) ;   // HelLO
System.out.println("원본문자열: " + s);  // String 는 한번 생성하면 변경 안됨. 메서드를 적용하면 새로운 문자열이 생성됨.
		
		String x = s2.trim();		
		System.out.println("10. 공백제거 전: " + s2) ;   //      hello     
		System.out.println("10. 공백제거 전  길이: " + s2.length()) ;   // 15   
		System.out.println("10. 공백제거 후: " + x) ;   // hello
		System.out.println("10. 공백제거 후 길이:" + x.length()) ;   // 5
		System.out.println("10. 공백제거 후 길이(메서드체인):" + s2.trim().length()) ;   // 5
		
		
		//3. static 메서드 ( String.메서드 형식 )
	
	}//end main
}//end class
