package exam20_exception;

public class ExceptionTest02_try_catch {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
     try {
		int n = 0;
		int result = 10/n;
		System.out.println("결과값:" + result);
     }catch(ArithmeticException e) {  // 아무 예외클래스가 아닌 적합한 예외클래스 지정(권장). 다형성 가능(권장안함)
    	//예외처리 코드구현==> 사용자에게 친절하게 예외 메시지를 알려주는 것이다.
    	System.out.println("0으로 나누어 예외 발생됨.");
     }
		System.out.println("프로그램 종료");  //정상종료
	}
}
