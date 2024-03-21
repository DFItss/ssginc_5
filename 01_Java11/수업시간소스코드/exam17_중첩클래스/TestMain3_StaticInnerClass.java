package exam17_중첩클래스;

// static inner class
class Outer3{
	public int n=10;
	protected int n2=20;
	          int n3=30;
	private   int n4=40;
	static    int n5=50;
	public void method() {}
	
	//static
	static class Inner{
		int m=10;
		static int m2=20; // static 변수선언 가능, 대신 Outer의 인스턴스 변수 접근불가
		public void innerMethod() {
//			System.out.println(n);
//			System.out.println(n2);
//			System.out.println(n3);
//			System.out.println(n4); 
			System.out.println(n5);
			System.out.println(m);
		}//end innerMethod
	}//end Inner
	
}//end Outer3

public class TestMain3_StaticInnerClass {
	public static void main(String[] args) {

		//static이기 때문에 Outer3로 접근
		Outer3.Inner i = new Outer3.Inner();
		i.innerMethod();
		
	}
}
