package exam20_exception;

class Test{
	public void a()throws ArithmeticException {
		b();
	}
	public void b() throws ArithmeticException{
		int n = 0;
		int result = 10/n;
		System.out.println("결과값:" + result);
	}
}//end Test
public class ExceptionTest03_throws {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		Test t = new  Test();
		try {
		  t.a();
		}catch(ArithmeticException e) {  // 정확한 예외클래스를 지정(권장).  다형성 적용 가능(권장안함)
			System.out.println(e.getMessage());
		}
		System.out.println("프로그램 종료");
	}
}
