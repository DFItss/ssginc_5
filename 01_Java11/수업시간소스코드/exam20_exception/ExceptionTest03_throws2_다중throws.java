package exam20_exception;

class Test2{
	public void a()throws ArithmeticException, NullPointerException {
		b();
	}
	public void b() throws ArithmeticException, NullPointerException{ // 다형성 사용 가능 (권장안함)
		
		// 1. ArithmeticException 발생 가능한 코드
		int n = 2;
		int result = 10/n;
		System.out.println("결과값:" + result);
		
		//2. NullPointerException 발생 가능한 코드
		String name = null;
		System.out.println("이름 길이: " + name.length()); 
	}
}//end Test
public class ExceptionTest03_throws2_다중throws {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		Test2 t = new  Test2();
		try {
		  t.a();
		}catch(ArithmeticException e) {  // 정확한 예외클래스를 지정(권장).  다형성 적용 가능(권장안함)
			System.out.println(e.getMessage());
		}catch(NullPointerException e) {  // 정확한 예외클래스를 지정(권장).  다형성 적용 가능(권장안함)
			System.out.println(e.getMessage());
		}catch(Exception e) {  // 마지막 catch는 Exception으로 처리한다. (관례)
			System.out.println(e.getMessage());
		}
		System.out.println("프로그램 종료");
	}
}
