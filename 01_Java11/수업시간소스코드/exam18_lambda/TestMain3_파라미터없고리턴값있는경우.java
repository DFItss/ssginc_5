package exam18_lambda;

@FunctionalInterface // 추상메서드 갯수를 1개로 제한.
interface Flyer4{
	// 파라미터없고 리턴값 있는 추상메서드인 경우
	public abstract int fly();
}

public class TestMain3_파라미터없고리턴값있는경우 {
	public static void main(String[] args) {

		//1. 익명클래스
		Flyer4 f = new Flyer4() {
			@Override
			public int fly() {
				return 100;
			}
		};
		int result = f.fly();
		System.out.println("1. 익명클래스. 결과값:" + result);
		
		
		//2. 람다 표현식
		Flyer4 f2 = ()->{return 100;};
		int result2 = f2.fly();
		System.out.println("2. 람다 표현식. 결과값:" + result2);
		
		// return 문장만 있는 경우에는 {}와 return 키워드 생략 가능
		Flyer4 f3 = ()->100;
		int result3 = f3.fly();
		System.out.println("2. 람다 표현식. 결과값:" + result3);		
				
	}//end main
}//end class






