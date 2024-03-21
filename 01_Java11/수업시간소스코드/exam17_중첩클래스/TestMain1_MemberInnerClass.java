package exam17_중첩클래스;


//Member Inner class
class Outer{
	
	public int n=10;
	protected int n2=20;
	          int n3=30;
	private   int n4=40;
	static    int n5=50;
	
	public void method() {
		// Outer의 메서드에서 Inner 생성후 사용
		Inner i = new Inner();
		i.innerMethod();
	}	
	
	//member inner class: Outer클래스의 멤버형태로 존재하기 때문이다.
	class Inner{
		int m=10;
	//static int m2=20;  // static 변수 선언 불가
		public void innerMethod() {
			System.out.println(n);
			System.out.println(n2);
			System.out.println(n3);
			System.out.println(n4); // outer의 private도 접근 가능.
			System.out.println(n5);
			System.out.println(m);
		}
	}//end inner
}//end Outer
public class TestMain1_MemberInnerClass {
	public static void main(String[] args) {
		 //Outer 생성
		Outer x = new Outer();
		x.method();
		
		System.out.println();
		// Outer가 아닌 다른 클래스에서 Inner  접근하는 방법
		Outer x2 = new Outer();
		Outer.Inner i = x2.new Inner();
		i.innerMethod();
		
	}
}
