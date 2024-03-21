package exam17_중첩클래스;

//interface
interface Flyer{
	public abstract  void fly();
}
//1. 일반적인 방법 ( 이름있는 클래스 이용)
class Bird implements Flyer{
	@Override
	public void fly() {
		System.out.println("Bird.fly() 호출");
	}
}

public class TestMain4_AnonymousInnerClass {
	public static void main(String[] args) {
		
		//1. 일반적인 방법 ( 이름있는 클래스 이용)
		 Flyer b = new Bird();  // 다형성
		 b.fly();
		 
		 //2. 익명클래스 (******************)
		 Flyer f = new Flyer() {
			@Override
			public void fly() {
				System.out.println("익명 클래스: Flyer.fly() 호출");
			}
		 };
		 f.fly();
		 
		 Flyer f2 = new Flyer() {
			@Override
			public void fly() {
				System.out.println("익명 클래스: Flyer.fly() 호출2");
			}
		};
		f2.fly();
	}
}
