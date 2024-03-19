package exam12_상속후_2_super;

public class TestMain {

	public static void main(String[] args) {
	
		Manager m = 
				new Manager("홍길동", 100, "인사");
	
	    System.out.println(m.getManager());
	    
	    
	    Secretary s = new Secretary("이순신", 200);
	    System.out.println(s.name);
	    System.out.println(s.getSecretary());
	
	}
}
