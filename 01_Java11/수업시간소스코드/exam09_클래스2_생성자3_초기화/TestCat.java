package exam09_클래스2_생성자3_초기화;

public class TestCat {

	//기본생성자가 자동으로 생성됨.
	//public TestCat() {}
	
	public static void main(String[] args) {

	
		// 야옹이 2 암컷
		
		// 초기화2 : 생성자 이용 (권장방법)
		Cat c1 = new Cat("야옹이",2000,"암컷");
		//변수 출력
		System.out.printf("이름:%s, 나이:%d, 성별:%s \n", 
		         c1.name, c1.age, c1.gender);
	
		////////////////////////////////////////////
	    Cat c2 = new Cat();
		// 초기화1 :객체생성후 인스턴스변수를 직접 접근해서 초기화 (권장안함)
	    c2.name="야옹이";
	    c2.age=2000; 
	    c2.gender="암컷";
		//변수 출력
		System.out.printf("이름:%s, 나이:%d, 성별:%s \n", 
		         c2.name, c2.age, c2.gender);
		
	}
}
