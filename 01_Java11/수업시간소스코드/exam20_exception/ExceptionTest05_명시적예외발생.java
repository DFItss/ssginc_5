package exam20_exception;

import java.util.Random;

//사용자 클래스
class MyRandom{
	public int random() throws MyException {
		Random r = new Random();
		int n = r.nextInt(3); // 0, 1, 2
		if(n==0) throw new MyException("0이 랜덤값 반환되어 예외발생");
		return n;
	}
}//end class
public class ExceptionTest05_명시적예외발생 {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		MyRandom r = new MyRandom();
	  try {
		int result = r.random();
		System.out.println("랜덤값: " + result);
	  }catch(MyException e) {
		  System.out.println(e.getMessage());
	  }
		System.out.println("프로그램 종료");
	}
}
