package exam17_중첩클래스;

//Local Inner class
class Outer2{
	
	public int n=10;
	protected int n2=20;
	          int n3=30;
	private   int n4=40;
	static    int n5=50;
	
	public void method() {
		int x = 100; //로컬변수
		class Inner{ // 로컬변수와 동일한 레벨
			int m=10;
			// static int m2=20; // static 변수 선언 불가
			public void innerMethod() {
				System.out.println(n);
				System.out.println(n2);
				System.out.println(n3);
				System.out.println(n4); // outer의 private도 접근 가능.
				System.out.println(n5);
				System.out.println(m);
			}//end innerMethod
		}//end Inner
		
		//local inner class는 로컬변수처럼 동작하기 때문에
		// 메서드안에서 사용이 가능하다. 따라서 메서드안에서만 생성할 수 있다.
		Inner i = new Inner();
		i.innerMethod();

	}//end method
	
}//end Outer2


public class TestMain2_LocalInnerClass {

	public static void main(String[] args) {

		 //Outer 생성
		Outer x = new Outer();
		x.method();
	}

}
