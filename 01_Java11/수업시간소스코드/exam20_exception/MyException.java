package exam20_exception;

// 사용자 정의 예외 클래스 작성방법
public class MyException extends Exception{
	public MyException(String message) {
		super(message);
	}
}
