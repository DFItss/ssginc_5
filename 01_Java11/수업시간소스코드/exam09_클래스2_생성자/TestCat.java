package exam09_클래스2_생성자;

public class TestCat {

	//기본생성자가 자동으로 생성됨.
	//public TestCat() {}
	
	public static void main(String[] args) {

		Cat c1 = new Cat();
		
		// 초기화1 ==> 객체생성후 인스턴스변수를 직접 접근해서 초기화
		c1.name="야옹이";
		c1.age=2000;  //논리적으로 문제있음
		c1.gender="암컷";
		
		System.out.printf("이름:%s, 나이:%d, 성별:%s \n", 
				         c1.name, c1.age, c1.gender);
		
		// 초기화2 ==> 생성자 이용. (권장)
		
		
		
	}
}
