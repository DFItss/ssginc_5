package exam18_lambda;

@FunctionalInterface // 추상메서드 갯수를 1개로 제한.
interface Flyer5{
	// 파라미터있고 리턴값 있는 추상메서드인 경우
	public abstract int fly(int n, int n2);
}

public class TestMain4_파라미터있고리턴값있는경우 {
	public static void main(String[] args) {

		//1. 익명클래스
	    Flyer5 f = new Flyer5() {
			@Override
			public int fly(int n, int n2) {
				return n+n2;
			}
		};
		int result = f.fly(10, 20);
		System.out.println("1. 익명클래스 결과값: " +  result);
		
		//2. 람다 표현식
		Flyer5 f2 =(int n, int n2)->{return n+n2;};
		Flyer5 f3 =( n,  n2)->{return n+n2;};
		Flyer5 f4 =(n,n2)-> n+n2;
		int result4 = f4.fly(10, 20);
		System.out.println("2. 람다 표현식 결과값: " +  result4);
	
				
	}//end main
}//end class






