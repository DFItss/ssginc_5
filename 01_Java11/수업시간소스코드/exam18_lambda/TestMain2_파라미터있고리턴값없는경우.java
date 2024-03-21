package exam18_lambda;

@FunctionalInterface // 추상메서드 갯수를 1개로 제한.
interface Flyer2{
	// 파라미터있고 리턴값 없는 추상메서드인 경우
	public abstract void fly(int n);
}

@FunctionalInterface // 추상메서드 갯수를 1개로 제한.
interface Flyer3{
	// 파라미터있고 리턴값 없는 추상메서드인 경우
	public abstract void fly(int n, String n2);
}

public class TestMain2_파라미터있고리턴값없는경우 {
	public static void main(String[] args) {

		
		//1. 익명클래스
		  Flyer3 x = new Flyer3() {
			@Override
			public void fly(int n, String n2) {
				System.out.println("1. 익명클래스.fly():  " + n +"\t" + n2);
			}
		};
		x.fly(100, "hello");
		
		//2. 람다표현식
		Flyer3 x2 =(int n, String n2)->{System.out.println("1. 익명클래스.fly():  " + n +"\t" + n2);};
		x2.fly(100, "hello");
		
		// 파라미터 변수의 타입 생략가능, 실행문이 한개인 경우 {} 생략가능
		Flyer3 x3 = (n, n2)->System.out.println("1. 익명클래스.fly():  " + n +"\t" + n2);
		x3.fly(100, "hello");
		
		// ######################################################################################################
		//1. 익명클래스
		Flyer2 f = new Flyer2() {
			@Override
			public void fly(int n) {
				System.out.println("1. 익명클래스.fly():  " + n);
			}
		};
		f.fly(10);
          
	    //2. 람다표현식
		Flyer2 f2 = (int n)->{System.out.println("2. 람다표현식.fly():  " + n);};
		f2.fly(10);
		
	 	// 파라미터 변수의 타입 생략가능, 실행문이 한개인 경우 {} 생략가능
		Flyer2 f3 = (n)->System.out.println("2. 람다표현식.fly():  " + n);
		f3.fly(10);
		
		// 파라미터 변수가 한개인 경우는 () 생략가능 ==> 파라미터 변수가 두개 이상인 경우에는 () 생략 불가
		Flyer2 f4 = n->System.out.println("2. 람다표현식.fly():  " + n);
		f4.fly(10);
		
	}//end main
}//end class






