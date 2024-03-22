package exam19_util;

public class util03_wrapperTest2_오토박싱_언박싱 {

	public static void main(String[] args) {
		
	   // 과거: 기본형과 참조형을 분리해서 사용했음
	
		// 기본형으로 정수 10 만드는 방법
		  int n = 10;
		 
		// 참조형으로 정수 10 만드는 방법
		  Integer n2 = new Integer(10);  // 취소선은 deprecated 된것이다.
		 
		// 참조형을 기본형으로 저장
		  int n3 = n2.intValue();
	 
		
	 // 현재: 기본형과 참조형을 구분하지 않고 사용. 자동으로 서로간에 변경되도록 지원
	
		 // 오토박싱:  기본형 --> 참조형
		 int x = 10;
		 Integer x2 = x;
		 
		 // 오토언박싱: 참조형 --> 기본형
		 int x3 = x2;
		
		 
	  // 다형성을 적용한 Object 배열
		 Object [] obj = { 10, 3.14, "hello" };
	  	
		
	}
}
