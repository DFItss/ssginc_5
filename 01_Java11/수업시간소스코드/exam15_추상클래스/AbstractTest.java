package exam15_추상클래스;

//추상 클래스
abstract class AAA{

	int n; //   변수
	public AAA() {} // 생성자
	public void method() {} // 메서드(일반 메서드, concrete method )
	
	//추상메서드
	public abstract void a(); // {} 가 없어서 아직 어떤 작업을 할지 미지정된 메서드.
	
}//end AAA

// 추상클래스는 자식 클래스를 통해서만 인스턴스화 될 수 있다. (**************)
// 이때 자식 클래스는 반드시 추상 메서드를 overriding 해야되는 제약이 있다.
class BBB  extends AAA{
	@Override
	public void a() {
		System.out.println("a 메서드");
	}
}

public class AbstractTest {
	public static void main(String[] args) {

//		AAA x = new AAA(); // 추상클래스는 객체생성 불가
		
		//자식 클래스를 통해서 추상 클래스의 요소를 사용할 수 있다.
		BBB y = new BBB();
		System.out.println(y.n);
		y.method();
		y.a();
		
		// 다형성을 적용한 BBB 객체생성이 가능하다.
		AAA y2 = new BBB();
		System.out.println(y2.n);
		y2.method();
		y2.a();
	}
}
