package exam12_상속후_2_super;

// Engineer, Secretary, Manger 클래스들의
// 공통적인 속성과 메서드를 뽑아서 
// 더 큰 개념의 클래스를 만들자..
public class Employee {
	String name;
	int salary;
	
	//getter, setter
	public Employee() {
		super(); //자동삽입됨. 명시적으로 지정할 때는 반드시 첫라인
		System.out.println(" Employee 생성자");
	}
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	
	public String getEmployee() {
		return name+"\t"+salary;
	}
}
