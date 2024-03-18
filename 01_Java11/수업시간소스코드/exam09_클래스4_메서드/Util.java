package exam09_클래스4_메서드;

public class Util {

	//1. 파라미터 없고 리턴값 없는 경우
	public void method1() {
		System.out.println("method1");
	}
	
	//2. 파라미터 있고 리턴값 없는 경우
	public void method1(int n) {
		System.out.println("method2:" + n);
	}
	public void method1(String n) {
		System.out.println("method3:" + n);
	}
	public void method1(String n, int n2) {
		System.out.println("method4:" + n +"\t" + n2);
	}
}
