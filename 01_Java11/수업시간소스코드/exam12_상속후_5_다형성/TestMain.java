package exam12_상속후_5_다형성;

public class TestMain {

	public static void main(String[] args) {
	
		//1. 일반적인 방법
		Employee emp = new Employee("강감찬", 200);
		Engineer eng = new Engineer("홍길동", 100, "JAVA");
		Manager m = new Manager("이순신", 200, "인사");
		Secretary s = new Secretary("유관순", 200);
		
		System.out.println(emp.getEmployee());
		System.out.println(eng.getEmployee());
		System.out.println(m.getEmployee());
		System.out.println(s.getEmployee());
		
		System.out.println();
		//2. 다형성 적용
		// => 하나의 Employee타입(부모인 큰 타입)의 emp 변수로 여러 자식(하위타입)을  참조함. 
		Employee emp2 = new Employee("강감찬", 200);
           		 System.out.println(emp2.getEmployee());
		         emp2 =  new Engineer("홍길동", 100, "JAVA");
		         System.out.println(emp2.getEmployee());
		         emp2 = new Manager("이순신", 200, "인사");
		         System.out.println(emp2.getEmployee());
		         emp2 = new Secretary("유관순", 200);
		         System.out.println(emp2.getEmployee());
		
	
	}
}
