package exam09_클래스;

/*
 *   main 메서드가 없는 Cat 클래스 관리할 목적
 *   1) 클래스 객체 생성
 */
public class TestCat {
	public static void main(String[] args) {

		// 1) 클래스 객체 생성
		Cat c1 = new Cat();
		
		// 2) 고양이 정보 설정
		// 야옹이 2 암컷
		c1.name ="야옹이";
		c1.age=2;
		c1.gender="암컷";
		
		// 3) 고양이 정보 조회
		System.out.println(c1.name);
		System.out.println(c1.age);
		System.out.println(c1.gender);
		
	}
}
