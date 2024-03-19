package exam12_상속후_3_오버라이딩;

// 엔지니어 클래스

// Engineer is a Employee
public class Engineer extends Employee{

	String skill; // 기술
	
	public Engineer(String name,int salary,String skill) {
		this.name = name;
		this.salary = salary;
		this.skill = skill;
	}
	//getter, setter 작성
	
	// 3가지 변수를 한번에 리턴해주는 메서드 작성
	@Override
	public String getEmployee() {
		
		return name+"\t"+salary+"\t"+skill;
	}
}
