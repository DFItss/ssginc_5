package exam20_exception;

public class ExceptionTest02_try_catch4_finally문 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
     try {
    	
    	 System.out.println("실행문");
    
     // 예외처리 목적이 아닌 반드시 수행해야되는 문장의 정보를 알려주는 목적	 
     }finally {
    	 System.out.println("finally문: 반드시 수행되는 문장");
	 }
		System.out.println("프로그램 종료");  //정상종료
	}
}
