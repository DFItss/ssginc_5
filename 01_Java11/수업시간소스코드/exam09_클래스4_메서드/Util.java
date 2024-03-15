package exam09_클래스4_메서드;

public class Util {

	//1. 파라미터 없고 리턴값도 없는 형식
	// 반드시 리턴타입은 void로 명시해야 된다.
	public void method1() {
		System.out.println("method1");
	}
	
   	
	//2. 파라미터 있고 리턴값은 없는 형식
   public void method2(int n){
	System.out.println("method2 " + n);
   }
   public void method3(int n, int n2){
	System.out.println("method2 " + n + "\t" + n2);
   }
   
}
