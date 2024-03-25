package exam20_exception;

import java.io.IOException;

class Super{
	public void a() throws ArithmeticException{}
	public void b() throws Exception{}
}

class Child extends Super{
	
	@Override
	public void b() throws IOException{}  // 부모의 예외클래스보다 하위 클래스는 사용 가능
	
	@Override
	public void a(){} //가능
//	public void a()throws ArithmeticException{} //가능

//	public void a() throws Exception{} // 부모의 예외클래스보다 상위클래스는 불가능
//	public void a() throws IOException{} // 부모의 예외클래스와 관련없는 클래스는 불가능 ( 확대개념 )
}

public class ExceptionTest03_throws3_오버라이딩 {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");

		System.out.println("프로그램 종료");
	}
}
