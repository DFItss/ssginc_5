package exam12_상속후_1_기본;

public class TestMain {

	public static void main(String[] args) {
	
		Engineer eng = new Engineer("홍길동", 100, "JAVA");
		Manager m = new Manager("이순신", 200, "인사");
		Secretary s = new Secretary("유관순", 200);
		
		System.out.println(eng.getEngineer());
		System.out.println(m.getManager());
		System.out.println(s.getSecretary());
	
	}
}
