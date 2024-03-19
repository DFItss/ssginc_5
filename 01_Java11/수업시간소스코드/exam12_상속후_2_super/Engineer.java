package exam12_상속후_2_super;

// 엔지니어 클래스

// Engineer is a Employee
public class Engineer extends Employee{

	String skill; // 기술
	
	public Engineer(String name,int salary,String skill) {
		super(); //자동삽입됨
		
		System.out.println(" Engineer 생성자");
		this.name = name;
		this.salary = salary;
		this.skill = skill;
	}
	//getter, setter 작성
	
	// 3가지 변수를 한번에 리턴해주는 메서드 작성
	public String getEngineer() {
		
		return name+"\t"+salary+"\t"+skill;
	}
}
