package exam12_상속후_3_오버라이딩;

public class TestMain {

	public static void main(String[] args) {
	
		Engineer eng = new Engineer("홍길동", 100, "JAVA");
		Manager m = new Manager("이순신", 200, "인사");
		Secretary s = new Secretary("유관순", 200);
		
		System.out.println(eng.getEmployee());
		System.out.println(m.getEmployee());
		System.out.println(s.getEmployee());
	
	}
}
