package exam02_변수;

public class VartiableTest3_변수종류 {

	//메서드 밖
	int size = 20;  // 인스턴스 변수
	int n;           // 0으로 초기화됨. 인스턴스 변수
	static int age;  // 0으로 초기화됨. 클래스 변수, static 변수
	static String name; // null 초기화됨
	
	public static void main(String[] args) {
		 
		// 메서드 안
		int num = 10; //로컬 변수
		
		int num2=0;     //로컬 변수, 초기화
		System.out.println(num);
		System.out.println(num2);
		
	}//main 메서드 영역
	
}// class 영역
