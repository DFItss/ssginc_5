package exam09_클래스4_메서드3;

class A{
	
	static class B{
		
	}
}

class Test{
	int num;
	public Test(int num) {
		this.num = num;
	}
}//end Test

public class TestMain {
	
	// 파라미터에 전달되는 값이 기본형인 경우에는 메서드내에서 전달된 값을 변경해도 원본값은 변경이 안된다.
	public static void method1(int x) {
		// 값 변경
		x = 20;
	}
	// 파라미터에 전달되는 값이 참조형인 경우에는 메서드내에서 전달된 값을 변경하면 원본값도 변경이 된다.
	public static void method2(Test t) {
		// 값 변경
		t.num = 200;
	}
	public static void main(String[] args) {
		// 기본형 
		int a = 10;
		System.out.println("기본형 메서드호출전:" + a); // 10
		method1(a);  // method1에 a변수가 가진 값(10)을 전달 ==> call by value
		System.out.println("기본형 메서드호출후:" + a); // 10
		
		// 참조형
		Test b = new Test(100);
		System.out.println("참조형 메서드호출전:" + b.num); // 100
		method2(b); // method2에 b변수가 가진 값(주소값)을 전달 ==> call by value reference
		System.out.println("참조형 메서드호출후:" + b.num); // 200
		
	}
}
