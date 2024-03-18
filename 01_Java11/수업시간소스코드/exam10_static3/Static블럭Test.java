package exam10_static3;

public class Static블럭Test {
	
	//static 블럭 : 반드시 필요한 선처리 작업을 주로 구현한다.
	static{
		System.out.println("static 블럭");
	}
	
	// instance 블럭: 거의 사용 안됨.
	{
		System.out.println("instance 블럭");		
	}
	public Static블럭Test() {		
		System.out.println("Static블럭Test 생성자");		
	}
	
	public static void main(String[] args) {
		Static블럭Test t = new Static블럭Test();
	
	}
}
