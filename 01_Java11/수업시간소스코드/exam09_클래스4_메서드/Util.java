package exam09_클래스4_메서드;

public class Util {

	//1. 파라미터 없고 리턴값 없는 경우
	public void method1() {
		System.out.println("method1");
	}
	
	//2. 파라미터 있고 리턴값 없는 경우
	public void method1(int n) {
		System.out.println("method1:" + n);
	}
	public void method1(String n) {
		System.out.println("method1:" + n);
	}
	public void method1(String n, int n2) {
		System.out.println("method1:" + n +"\t" + n2);
	}

    // 3. 파라미터 없고 리턴값 있는 경우
	public int method2() {
		System.out.println("method2");
		return 100;
	}
	public String method3() {
		System.out.println("method3");
		return "홍길동";
	}
	
	// 4. 파라미터 있고 리턴값 있는 경우
	public int sum(int n , int n2) {
		return n+n2;
	}
	
	
	
}
