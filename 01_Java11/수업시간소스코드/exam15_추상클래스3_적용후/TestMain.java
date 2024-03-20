package exam15_추상클래스3_적용후;

public class TestMain {

	public static void main(String[] args) {
	
		Employee eng = new Engineer("홍길동", 100, "JAVA");
		Employee m = new Manager("이순신", 200, "인사");
		Employee s = new Secretary("유관순", 200);
		
		System.out.println(eng.getEmployee());
		System.out.println(m.getEmployee());
		System.out.println(s.getEmployee());
	
	}
}
